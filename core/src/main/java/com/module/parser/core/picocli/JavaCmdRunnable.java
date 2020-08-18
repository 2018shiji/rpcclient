package com.module.parser.core.picocli;

import com.module.parser.core.ApacheCli;
import picocli.CommandLine;

import java.util.List;

public class JavaCmdRunnable implements Runnable {

    private List<CommandLine.Model.ArgSpec> parseResults;

    public void fulfillParseResults(List<CommandLine.Model.ArgSpec> results){ this.parseResults = results; }

    @Override
    public void run() {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < parseResults.size(); i++){
            if(parseResults.get(i) instanceof CommandLine.Model.OptionSpec){
                CommandLine.Model.OptionSpec optionSpec = ((CommandLine.Model.OptionSpec)parseResults.get(i));
                builder.append(" " + optionSpec.names()[0] + " " + optionSpec.originalStringValues().get(0));
            } else if(parseResults.get(i) instanceof CommandLine.Model.PositionalParamSpec){
                CommandLine.Model.PositionalParamSpec positionalParaSpec = ((CommandLine.Model.PositionalParamSpec)parseResults.get(i));
                positionalParaSpec.originalStringValues().stream().forEach(element -> builder.append(" " + element));
            } else {
                System.out.println("!!!!!!! miss type !!!!!!!");
            }
        }
        System.out.println(builder.toString());

        ApacheCli.toJavaCli(builder.toString());
    }

}
