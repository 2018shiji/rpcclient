package com.module.parser.xml;

import org.jibx.binding.BindingGenerator;
import org.springframework.stereotype.Component;

@Component
public class JiBxParser {

    BindingGenerator bindGen;

    public JiBxParser() {
        bindGen = new BindingGenerator();
//        bindGen.main();

    }

}
