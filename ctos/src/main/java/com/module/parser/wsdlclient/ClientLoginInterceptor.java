package com.module.parser.wsdlclient;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;
import java.util.List;

public class ClientLoginInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
    private String username;
    private String password;

    public ClientLoginInterceptor(){
        super(Phase.PREPARE_SEND);
    }

    public ClientLoginInterceptor(String username, String password){
        super(Phase.PREPARE_SEND);
        this.username = username;
        this.password = password;
    }

    @Override
    public void handleMessage(SoapMessage soapMessage) throws Fault {
        List<Header> headers = soapMessage.getHeaders();
        Document document = DOMUtils.createDocument();
        Element authority = document.createElement("authority");
        Element username = document.createElement("username");
        Element password = document.createElement("password");
        username.setTextContent(this.username);
        password.setTextContent(this.password);
        authority.appendChild(username);
        authority.appendChild(password);
        headers.add(0, new Header(new QName("timamaes"), authority));
    }
}
