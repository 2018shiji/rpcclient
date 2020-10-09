package com.module.parser.entity.result;

import lombok.Data;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RETURNINFO", propOrder = {"errorCode", "errorMsg"})
public class ReturnInfo {
    @XmlElement(name = "ERRORCODE", required = true)
    public String errorCode;
    @XmlElement(name = "ERRORMSG", required = true)
    public String errorMsg;

}
