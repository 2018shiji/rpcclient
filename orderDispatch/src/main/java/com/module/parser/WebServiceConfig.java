package com.module.parser;

import com.module.parser.webservice.AuthInterceptor;
import com.module.parser.webservice.CTOSService;
import com.module.parser.wsclient.ClientLoginInterceptor;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * https://blog.csdn.net/qq_34446485/article/details/79669134
 * https://www.cnblogs.com/soundcode/p/6561207.html
 * http://127.0.0.1:8080/CTOS/CTOSResult?wsdl
 */
@Configuration
public class WebServiceConfig {
    @Autowired
    private Bus bus;

    @Bean
    public ServletRegistrationBean disServlet(){
        return new ServletRegistrationBean(new CXFServlet(), "/CTOS/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus(){return new SpringBus();}

    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus, new CTOSService());
        endpoint.publish("/CTOSResult");
//        endpoint.getInInterceptors().add(new AuthInterceptor());
        return endpoint;
    }
}
