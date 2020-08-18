package com.module.parser.core.picocli;

import picocli.CommandLine;

import java.util.List;

@CommandLine.Command(name="JibxBindGen")
public class JibxBindGen extends JavaCmdRunnable {

    @CommandLine.Option(names={"-cp"}, required = true)
    private String extJar;

    @CommandLine.Option(names={"-b"})
    private String bindDefName;
    @CommandLine.Option(names={"-p"})
    private String classPath;
    @CommandLine.Option(names={"-s"})
    private String sourceClassPath;
    @CommandLine.Option(names={"-t"}, required = true)
    private String outputPath;

    @CommandLine.Parameters(index="0")
    private String sourceClass;

    @Override
    public void run() {
        System.out.println(extJar + "  " + bindDefName + "   " + classPath + "   " + outputPath + "  " + sourceClass);
        super.run();
    }
}
