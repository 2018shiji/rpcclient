package com.module.parser.entity.result;

import javax.xml.bind.annotation.XmlElement;

public class ReturnInfo {
    @XmlElement(name = "ERRORCODE")
    private String errorCode;
    @XmlElement(name = "ERRORMSG")
    private String errorMsg;

}
