package com.module.parser.entity.response;

import com.module.parser.reflect.VueField;
import lombok.Data;
import lombok.ToString;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class RegisterResult {

    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "SM001001", required = true)
    private List<DataTable> dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "SM001001", propOrder = {"ticketId"})
    public static class DataTable{
        @XmlElement(name = "TICKET_ID", required = true)
        @VueField(label = "会话编码")
        private String ticketId;
    }
}
