
package com.module.parser.wsdlGen;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.2.14
 * 2020-08-20T12:31:49.195+08:00
 * Generated source version: 3.2.14
 *
 */

public class LoginResultPortType_LoginResultPort_Server{

    protected LoginResultPortType_LoginResultPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        LoginResultPortType implementor = new LoginResultPortImpl();
        String address = "http://localhost:8080/axis2/services/LoginResult";
        Endpoint.publish(address, implementor);
    }

    public static void main(String args[]) throws java.lang.Exception {
        new LoginResultPortType_LoginResultPort_Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
