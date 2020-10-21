package com.module.parser.logconfig;

import org.slf4j.Logger;

public class ConsoleLogRecorder {
    private Logger logger;

    private ConsoleLogRecorder(Logger actualLogger){
        this.logger = actualLogger;
    }

    public static ConsoleLogRecorder withLogger(Logger actualLogger){
        return new ConsoleLogRecorder(actualLogger);
    }

    public void info(String string){
        logger.info(string);
        System.out.println(string);
    }

    public void infoNonWrapped(String string){
        logger.info(string);
        System.out.print(string);
    }

}
