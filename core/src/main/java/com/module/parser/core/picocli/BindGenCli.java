package com.module.parser.core.picocli;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import picocli.CommandLine;

@CommandLine.Command(description = "cli for creating bind generation xml and xsd file", name = "BindGenCli")
public class BindGenCli implements Runnable {
    @CommandLine.Option(names = {"-cp"}, required = true, description = "ext jar dependency")
    String extJarPath;

    @CommandLine.Option(names = {"-t"}, required = true)
    String outputPath;

    @CommandLine.Parameters(index = "0", description = "target class")
    String targetClass;

    public void executeCmd(String... args){

        int exitCode = new CommandLine(new BindGenCli()).execute(args);
        System.out.println(exitCode);
    }

    @Override
    public void run() {
        System.out.println("extJarPath: " + extJarPath + "outputPath: " + outputPath + "targetClass: " + targetClass);
    }
}
