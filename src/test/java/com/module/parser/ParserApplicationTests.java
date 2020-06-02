package com.module.parser;


import com.module.parser.script.util.CommandGobbler;
import com.module.parser.script.util.CommandProcess;
import com.module.parser.script.ProcessState;
import com.module.parser.script.util.TimeoutThread;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Date;

@SpringBootTest
class ParserApplicationTests {
    @Autowired
    CommandProcess commandProcess;

    @Test
    void contextLoads() {
        CommandProcess.ProcessRunner runner = commandProcess.buildProcessRunner();
        CommandProcess.Result result = runner.runCMD(Arrays.asList("cmd", "/C", "ping 127.0.0.1 -n 1"));
        System.out.println(result);
        boolean isRight = result.isSuccess((inputInfos, errorInfos, returnCode) -> returnCode == 0 && errorInfos.size() == 0);
        System.out.println(isRight);
    }

    @Test
    void testCommandGobbler(){
        InputStreamReader stdISR = null;
        InputStreamReader errISR = null;
        Process process = null;
        String command = "cmd /c C:\\Users\\DGM.DESKTOP-HJTAO\\Desktop\\testbat.bat";
        long timeout = 10 * 1000;
        try{
            process = Runtime.getRuntime().exec(command);

            CommandGobbler errGobbler = new CommandGobbler(process.getErrorStream(), command);
            CommandGobbler outGobbler = new CommandGobbler(process.getInputStream(), command);

            //必须先等待错误输出准备完毕后再建立标准输出
            errGobbler.start();
            while(!errGobbler.isReady()) Thread.sleep(20);

            outGobbler.start();
            while(!outGobbler.isReady()) Thread.sleep(20);

            TimeoutThread timeoutThread = new TimeoutThread(process);
            timeoutThread.start();

            long commandTime = new Date().getTime();
            long nowTime = new Date().getTime();
            boolean timeoutFlag = false;

            while(!timeoutThread.isFinish()){
                if(nowTime - commandTime > timeout){
                    timeoutFlag = true;
                    break;
                } else {
                    Thread.sleep(100);
                    nowTime = new Date().getTime();
                }
            }

            if(timeoutFlag) {
                //命令超时
                errGobbler.setResult(ProcessState.TIMEOUT);
                outGobbler.setResult(ProcessState.TIMEOUT);
                System.out.println("命令: " + command + " 超时");
            } else {
                //命令执行完成
                errGobbler.setResult(ProcessState.FINISH);
                outGobbler.setResult(ProcessState.FINISH);
                System.out.println("命令: " + command + " 完成");
            }

        } catch (Exception e) {

        }
    }

}
