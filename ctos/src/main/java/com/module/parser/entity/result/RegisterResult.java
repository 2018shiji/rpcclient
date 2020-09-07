package com.module.parser.entity.result;

import lombok.Data;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class RegisterResult {

    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "SM001001", required = true)
    private DataTable dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "SM001001", propOrder = {"ticketId"})
    public static class DataTable{
        @XmlElement(name = "TICKET_ID", required = true)
        private String ticketId;
    }
}
