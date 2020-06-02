package com.module.parser.script.util;

import com.module.parser.script.ProcessState;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

@Data
public class CommandGobbler extends Thread {
    private InputStream input;
    private String command;
    private boolean ready;

    private ProcessState result = ProcessState.RUNNING;
    private List<String> infoList = new LinkedList<>();

    public CommandGobbler(InputStream input, String command) {
        this.input = input;
        this.command = command;
    }

    @Override
    public void run() {
        InputStreamReader inputReader = null;
        BufferedReader bufReader = null;
        try {
            inputReader = new InputStreamReader(input);
            bufReader = new BufferedReader(inputReader);
            String line;
            ready = true;
            while(result != ProcessState.TIMEOUT){
                if(bufReader.ready() || result == ProcessState.FINISH){
                    if((line = bufReader.readLine()) != null)
                        infoList.add(line);
                    else
                        break;
                } else { Thread.sleep(100); }
            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try{
                if(bufReader != null)bufReader.close();
                if(inputReader != null)inputReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
