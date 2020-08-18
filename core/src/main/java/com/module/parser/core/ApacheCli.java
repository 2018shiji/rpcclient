package com.module.parser.core;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;

import java.io.IOException;

public class ApacheCli {

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

    public static void main(String[] args){
        toJavaCli(null);
    }


}
