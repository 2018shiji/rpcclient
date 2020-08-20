package com.module.parser.entity.result;

import lombok.Data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@XmlRootElement(name = "CTOSRESULT")
public class RegisterResult {
    @XmlElement(name = "RETURNINFO")
    private ReturnInfo returnInfo;
    @XmlElement(name = "TICKET_ID")
    private String ticketId;

}
