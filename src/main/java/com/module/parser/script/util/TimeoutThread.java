package com.module.parser.script.util;

import lombok.Data;


@Data
public class TimeoutThread extends Thread {

    private Process process;
    private boolean finish;
    private int exitValue = -1;

    public TimeoutThread(Process process) {
        this.process = process;
    }

    @Override
    public void run() {
        try {
            this.exitValue = process.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            finish = true;
        }
    }

}
