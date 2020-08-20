package com.module.parser.wsdlGen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.14
 * 2020-08-20T12:31:49.174+08:00
 * Generated source version: 3.2.14
 *
 */
@WebService(targetNamespace = "http://module.com/parser/entity/result/LoginResult", name = "LoginResultPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface LoginResultPortType {

    @WebMethod(action = "urn:setTicketId")
    @RequestWrapper(localName = "setTicketId", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.SetTicketId")
    @ResponseWrapper(localName = "setTicketIdResponse", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.SetTicketIdResponse")
    public void setTicketId(
        @WebParam(name = "ticketId", targetNamespace = "http://module.com/parser/entity/result/LoginResult")
        java.lang.String ticketId
    );

    @WebMethod(action = "urn:canEqual")
    @RequestWrapper(localName = "canEqual", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.CanEqual")
    @ResponseWrapper(localName = "canEqualResponse", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.CanEqualResponse")
    @WebResult(name = "return", targetNamespace = "http://module.com/parser/entity/result/LoginResult")
    public boolean canEqual(
        @WebParam(name = "other", targetNamespace = "http://module.com/parser/entity/result/LoginResult")
        com.module.parser.wsdlGen.Object other
    );

    @WebMethod(action = "urn:getWorkType")
    @RequestWrapper(localName = "getWorkType", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.GetWorkType")
    @ResponseWrapper(localName = "getWorkTypeResponse", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.GetWorkTypeResponse")
    @WebResult(name = "return", targetNamespace = "http://module.com/parser/entity/result/LoginResult")
    public java.lang.String getWorkType();

    @WebMethod(action = "urn:setWorkType")
    @RequestWrapper(localName = "setWorkType", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.SetWorkType")
    @ResponseWrapper(localName = "setWorkTypeResponse", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.SetWorkTypeResponse")
    public void setWorkType(
        @WebParam(name = "workType", targetNamespace = "http://module.com/parser/entity/result/LoginResult")
        java.lang.String workType
    );

    @WebMethod(action = "urn:getDeviceMType")
    @RequestWrapper(localName = "getDeviceMType", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.GetDeviceMType")
    @ResponseWrapper(localName = "getDeviceMTypeResponse", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.GetDeviceMTypeResponse")
    @WebResult(name = "return", targetNamespace = "http://module.com/parser/entity/result/LoginResult")
    public java.lang.String getDeviceMType();

    @WebMethod(action = "urn:isHalt")
    @RequestWrapper(localName = "isHalt", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.IsHalt")
    @ResponseWrapper(localName = "isHaltResponse", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.IsHaltResponse")
    @WebResult(name = "return", targetNamespace = "http://module.com/parser/entity/result/LoginResult")
    public boolean isHalt();

    @WebMethod(action = "urn:getMoveCapacity")
    @RequestWrapper(localName = "getMoveCapacity", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.GetMoveCapacity")
    @ResponseWrapper(localName = "getMoveCapacityResponse", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.GetMoveCapacityResponse")
    @WebResult(name = "return", targetNamespace = "http://module.com/parser/entity/result/LoginResult")
    public java.lang.String getMoveCapacity();

    @WebMethod(action = "urn:getTicketId")
    @RequestWrapper(localName = "getTicketId", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.GetTicketId")
    @ResponseWrapper(localName = "getTicketIdResponse", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.GetTicketIdResponse")
    @WebResult(name = "return", targetNamespace = "http://module.com/parser/entity/result/LoginResult")
    public java.lang.String getTicketId();

    @WebMethod(action = "urn:setHalt")
    @RequestWrapper(localName = "setHalt", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.SetHalt")
    @ResponseWrapper(localName = "setHaltResponse", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.SetHaltResponse")
    public void setHalt(
        @WebParam(name = "isHalt", targetNamespace = "http://module.com/parser/entity/result/LoginResult")
        boolean isHalt
    );

    @WebMethod(action = "urn:setDeviceNo")
    @RequestWrapper(localName = "setDeviceNo", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.SetDeviceNo")
    @ResponseWrapper(localName = "setDeviceNoResponse", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.SetDeviceNoResponse")
    public void setDeviceNo(
        @WebParam(name = "deviceNo", targetNamespace = "http://module.com/parser/entity/result/LoginResult")
        java.lang.String deviceNo
    );

    @WebMethod(action = "urn:setDeviceMType")
    @RequestWrapper(localName = "setDeviceMType", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.SetDeviceMType")
    @ResponseWrapper(localName = "setDeviceMTypeResponse", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.SetDeviceMTypeResponse")
    public void setDeviceMType(
        @WebParam(name = "deviceMType", targetNamespace = "http://module.com/parser/entity/result/LoginResult")
        java.lang.String deviceMType
    );

    @WebMethod(action = "urn:hashCode")
    @RequestWrapper(localName = "hashCode", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.HashCode")
    @ResponseWrapper(localName = "hashCodeResponse", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.HashCodeResponse")
    @WebResult(name = "return", targetNamespace = "http://module.com/parser/entity/result/LoginResult")
    public int hashCode();

    @WebMethod(action = "urn:equals")
    @RequestWrapper(localName = "equals", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.Equals")
    @ResponseWrapper(localName = "equalsResponse", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.EqualsResponse")
    @WebResult(name = "return", targetNamespace = "http://module.com/parser/entity/result/LoginResult")
    public boolean equals(
        @WebParam(name = "o", targetNamespace = "http://module.com/parser/entity/result/LoginResult")
        com.module.parser.wsdlGen.Object o
    );

    @WebMethod(action = "urn:setMoveCapacity")
    @RequestWrapper(localName = "setMoveCapacity", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.SetMoveCapacity")
    @ResponseWrapper(localName = "setMoveCapacityResponse", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.SetMoveCapacityResponse")
    public void setMoveCapacity(
        @WebParam(name = "moveCapacity", targetNamespace = "http://module.com/parser/entity/result/LoginResult")
        java.lang.String moveCapacity
    );

    @WebMethod(action = "urn:getDeviceNo")
    @RequestWrapper(localName = "getDeviceNo", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.GetDeviceNo")
    @ResponseWrapper(localName = "getDeviceNoResponse", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.GetDeviceNoResponse")
    @WebResult(name = "return", targetNamespace = "http://module.com/parser/entity/result/LoginResult")
    public java.lang.String getDeviceNo();

    @WebMethod(action = "urn:toString")
    @RequestWrapper(localName = "toString", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.ToString")
    @ResponseWrapper(localName = "toStringResponse", targetNamespace = "http://module.com/parser/entity/result/LoginResult", className = "com.module.parser.wsdlGen.ToStringResponse")
    @WebResult(name = "return", targetNamespace = "http://module.com/parser/entity/result/LoginResult")
    public java.lang.String toString();
}
