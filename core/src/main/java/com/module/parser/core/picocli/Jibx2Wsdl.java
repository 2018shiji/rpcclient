package com.module.parser.core.picocli;

import picocli.CommandLine;

@CommandLine.Command(name="Jibx2Wsdl")
public class Jibx2Wsdl extends JavaCmdRunnable {

    @CommandLine.Option(names={"-cp"}, required = true)
    private String extJar;

    @CommandLine.Option(names={"-b"})
    private String bindDefName;
    @CommandLine.Option(names={"-p"}, description = "path for loading java class")
    private String classPath;
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
