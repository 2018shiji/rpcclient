package com.module.parser.core;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.PumpStreamHandler;
import org.apache.commons.exec.util.DebugUtils;

import java.io.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ApacheCli {

    private static Map<String, Long> ip2ReturnTime = new ConcurrentHashMap<>();

    public static void toJavaCli(String... args){
        final CommandLine cmdLine = CommandLine.parse("java " + args[0]);
//        final CommandLine cmdLine = CommandLine.parse("java -cp D:\\software\\jars\\jibx1.3.3\\jibx\\lib\\jibx-tools.jar;bin org.jibx.binding.generator.BindGen " +
//                "-t C:\\Users\\lizhuangjie.chnet\\IdeaProjects\\parser\\entity\\src\\main\\resources\\jibx " +
//                "-p C:\\Users\\lizhuangjie.chnet\\IdeaProjects\\parser\\entity\\target\\classes " +
//                "com.module.parser.entity.test.OrderBean");
        DefaultExecutor executor = new DefaultExecutor();
        try {
            System.out.println("***********" + executor.execute(cmdLine));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void toPingCli(String remoteIP){
        final CommandLine cmdLine = CommandLine.parse(remoteIP);
        try{
            DefaultExecutor executor = new DefaultExecutor();
            executor.setExitValues(null);

            executor.setStreamHandler(new MyHandler(remoteIP));
            DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
            executor.execute(cmdLine, resultHandler);
            resultHandler.waitFor(5000);

            System.out.println("ping end!!!!!!");

        } catch (Exception e){e.printStackTrace();}
    }

    public static class MyHandler extends PumpStreamHandler{
        private final String cmd;
        public MyHandler(String cmd){
            this.cmd = cmd;
        }

        @Override
        protected Thread createPump(InputStream is, OutputStream os, boolean closeWhenExhausted) {
            Thread result = null;
            try{
                result = new Thread(new ReaderPumper(
                        new BufferedReader(new InputStreamReader(is, "gbk")), new PrintStream(os), closeWhenExhausted, cmd));
            } catch (Exception e){e.printStackTrace();}
            result.setDaemon(true);
            return result;
        }
    }

    // 使用字符流逐行读取子进程的输出流
    public static class ReaderPumper implements Runnable {
        private final BufferedReader is;
        private final PrintStream os;
        private boolean finished;
        private final boolean closeWhenExhausted;
        private final String cmd;

        public ReaderPumper(final BufferedReader is, final PrintStream os,
                            final boolean closeWhenExhausted, final String cmd) {
            this.is = is;
            this.os = os;
            this.closeWhenExhausted = closeWhenExhausted;
            this.cmd = cmd;
        }

        public ReaderPumper(final BufferedReader is, final PrintStream os,
                            final boolean closeWhenExhausted, final int size, final String cmd) {
            this.is = is;
            this.os = os;
            this.closeWhenExhausted = closeWhenExhausted;
            this.cmd = cmd;
        }

        public ReaderPumper(final BufferedReader is, final PrintStream os, final String cmd) {
            this(is, os, false, cmd);
        }

        public void run() {
            synchronized (this) {
                // Just in case this object is reused in the future
                finished = false;
            }

            String line = null;
            try {
                while ((line = is.readLine()) != null) {
                    os.println(cmd + " " + line + " " + System.currentTimeMillis());
                    ip2ReturnTime.put(cmd, System.currentTimeMillis());
                }
            } catch (final Exception e) {
                // nothing to do - happens quite often with watchdog
            } finally {
                if (closeWhenExhausted) {
                    try {
                        os.close();
                    } catch (final Exception e) {
                        final String msg = "Got exception while closing exhausted output stream";
                        DebugUtils.handleException(msg ,e);
                    }
                }
                synchronized (this) {
                    finished = true;
                    notifyAll();
                }
            }
        }

        public synchronized boolean isFinished() {
            return finished;
        }

        public synchronized void waitFor() throws InterruptedException {
            while (!isFinished()) {
                wait();
            }
        }
    }

    public static void main(String[] args){
        String cmd = "ping 10.28.56.121";
        toPingCli(cmd);
        String cmd1 = "ping 10.28.56.122";
        toPingCli(cmd1);
        String cmd2 = "ping 10.28.56.123";
        toPingCli(cmd2);
        String cmd3 = "ping 10.28.56.124";
        toPingCli(cmd3);
        String cmd4 = "ping 10.28.56.125";
        toPingCli(cmd4);
        String cmd5 = "ping 10.28.56.126";
        toPingCli(cmd5);

        String cmd6 = "ping 10.28.56.127";
        toPingCli(cmd6);
        String cmd7 = "ping 10.28.56.128";
        toPingCli(cmd7);
        String cmd8 = "ping 10.28.56.129";
        toPingCli(cmd8);
        String cmd9 = "ping 10.28.56.130";
        toPingCli(cmd9);
        String cmd10 = "ping 10.28.56.131";
        toPingCli(cmd10);
        String cmd11 = "ping 10.28.56.132";
        toPingCli(cmd11);
        String cmd12 = "ping 10.28.56.133";
        toPingCli(cmd12);
        String cmd13 = "ping 10.28.56.134";
        toPingCli(cmd13);
        String cmd14 = "ping 10.28.56.135";
        toPingCli(cmd14);
        String cmd15 = "ping 10.28.56.136";
        toPingCli(cmd15);
        String cmd16 = "ping 10.28.56.137";
        toPingCli(cmd16);
        String cmd17 = "ping 10.28.56.138";
        toPingCli(cmd17);
    }


}
