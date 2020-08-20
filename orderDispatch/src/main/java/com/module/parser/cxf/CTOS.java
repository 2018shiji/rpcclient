package com.module.parser.cxf;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.14
 * 2020-08-20T23:59:59.270+08:00
 * Generated source version: 3.2.14
 *
 */
@WebServiceClient(name = "CTOS",
                  wsdlLocation = "file:/C:/Users/Administrator/IdeaProjects/parser/orderDispatch/src/main/resources/toWsdl/CTOS.wsdl",
                  targetNamespace = "http://module.com/parser/entity/test/CTOS")
public class CTOS extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://module.com/parser/entity/test/CTOS", "CTOS");
    public final static QName CTOSPort = new QName("http://module.com/parser/entity/test/CTOS", "CTOSPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Administrator/IdeaProjects/parser/orderDispatch/src/main/resources/toWsdl/CTOS.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CTOS.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Administrator/IdeaProjects/parser/orderDispatch/src/main/resources/toWsdl/CTOS.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CTOS(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CTOS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CTOS() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CTOS(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CTOS(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CTOS(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CTOSPortType
     */
    @WebEndpoint(name = "CTOSPort")
    public CTOSPortType getCTOSPort() {
        return super.getPort(CTOSPort, CTOSPortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CTOSPortType
     */
    @WebEndpoint(name = "CTOSPort")
    public CTOSPortType getCTOSPort(WebServiceFeature... features) {
        return super.getPort(CTOSPort, CTOSPortType.class, features);
    }

}
