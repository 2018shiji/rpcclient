package com.module.parser.core.picocli;


import picocli.CommandLine;

@CommandLine.Command(name = "Greet", header = "%n@|green Hello world demo|@")
class Greet implements Runnable {

    @CommandLine.Option(names = {"-u", "--user"}, required = true, description = "The user name.")
    String userName;

    public void run() {
        System.out.println("Hello, " + userName);


    }

    public static void main(String... args) {
        String[] myArgs = new String[1];
        myArgs[0] = "-u picoCli";
        int exitCode = new CommandLine(new Greet()).execute(myArgs);
        System.out.println(exitCode);

        CommandLine.ParseResult parseResult =
                new CommandLine(new Greet()).parseArgs(myArgs);

        String cmd = "ping www.baidu.com -t";

    }
}
