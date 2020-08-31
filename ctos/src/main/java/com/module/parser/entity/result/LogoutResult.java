package com.module.parser.entity.result;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "CTOSRESULT")
public class LogoutResult {
    @XmlElement(name = "RETURNINFO")
    private ReturnInfo returnInfo;

}
