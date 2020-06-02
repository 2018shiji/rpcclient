package com.module.parser.script;

import com.module.parser.annotation.BindGenPojo;

import com.module.parser.input.pojo.IMain;
import lombok.Data;

import java.util.ServiceLoader;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * https://www.ibm.com/developerworks/java/tutorials/j-jibx1/#side2
 * http://jibx.sourceforge.net/fromcode/bindgen-example1.html
 */
@Data
public class XmlCommand {
    private String jibxPath;
    private String outPath;

    public XmlCommand() {
        jibxPath = System.getenv("JIBX_HOME");
        System.out.println(jibxPath);
        outPath = "com.module.parser.output";
    }

    public void doBindGen() {
        ServiceLoader<IMain> services = ServiceLoader.load(IMain.class);
        Set<IMain> serviceSet = services
                .stream()
                .filter(item -> item.type().isAnnotationPresent(BindGenPojo.class))
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toSet());
        for(IMain service : serviceSet) {
            System.out.println("Service: "
                    + service.getClass().getAnnotation(BindGenPojo.class).name());
            System.out.println(service.getClass().getName());

        }
    }

    public static void main(String[] args) {
        XmlCommand xml = new XmlCommand();
        xml.doBindGen();
    }
}
