package com.module.parser.asmxclient;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.message.SOAPHeaderElement;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.encoding.XMLType;
import java.net.URL;

public class TestXXX {
    public static void sendReportTest(byte[] reportData, String date){
        try{
            String endpointURL = "XXXXXXXXXX";
            Service service = new Service();
            Call call = (Call) service.createCall();
            call.setTimeout(60000);
            call.setTargetEndpointAddress(new URL(endpointURL));
            call.setSOAPActionURI("http://tempuri.org/sendXMLFile");
            //设置操作的名称
            call.setOperationName(new QName("http://tempuri.org/", "sendXMLFile"));
            //认证情况下，需设置调用的用户名和密码
            SOAPHeaderElement soapHeaderElement = new SOAPHeaderElement("http://tempuri.org/", "UserSoapHeader");
            soapHeaderElement.setNamespaceURI("http://tempuri.org/");
            soapHeaderElement.addChildElement("UserId").setValue("user");
            soapHeaderElement.addChildElement("PassWord").setValue("password");
            call.addHeader(soapHeaderElement);
            //返回的数据类型
            call.setReturnType(XMLType.XSD_STRING);
            call.addParameter(new QName("http://tempuri.org/","xmlProjectData"), XMLType.XSD_BASE64, ParameterMode.IN);// 参数的类型
            call.addParameter(new QName("http://tempuri.org/","reportDate"), XMLType.XSD_STRING, ParameterMode.IN);// 参数的类型


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
