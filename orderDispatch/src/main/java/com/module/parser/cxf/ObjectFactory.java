
package com.module.parser.cxf;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.module.parser.cxf package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.module.parser.cxf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResult }
     * 
     */
    public LoginResult createLoginResult() {
        return new LoginResult();
    }

    /**
     * Create an instance of {@link LoginResult.DataTable }
     * 
     */
    public LoginResult.DataTable createLoginResultDataTable() {
        return new LoginResult.DataTable();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link DoLogin }
     * 
     */
    public DoLogin createDoLogin() {
        return new DoLogin();
    }

    /**
     * Create an instance of {@link DoLoginResponse }
     * 
     */
    public DoLoginResponse createDoLoginResponse() {
        return new DoLoginResponse();
    }

    /**
     * Create an instance of {@link DoLoginResult }
     * 
     */
    public DoLoginResult createDoLoginResult() {
        return new DoLoginResult();
    }

    /**
     * Create an instance of {@link DoLoginResultResponse }
     * 
     */
    public DoLoginResultResponse createDoLoginResultResponse() {
        return new DoLoginResultResponse();
    }

    /**
     * Create an instance of {@link LoginResult.ReturnInfo }
     * 
     */
    public LoginResult.ReturnInfo createLoginResultReturnInfo() {
        return new LoginResult.ReturnInfo();
    }

    /**
     * Create an instance of {@link LoginResult.DataTable.Record }
     * 
     */
    public LoginResult.DataTable.Record createLoginResultDataTableRecord() {
        return new LoginResult.DataTable.Record();
    }

}
