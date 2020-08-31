package com.module.parser.entity.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "LoginResult", propOrder = {"returnInfo", "dataTables", "ticketId"})
public class LoginResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "DATATABLE", required = true)
    private List<DataTable> dataTables;
    @XmlElement(name = "TICKET_ID", required = true)
    private String ticketId;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "DataTable", propOrder = {"name", "record"})
    public static class DataTable {
        @XmlAttribute(name = "NAME", required = true)
        private String name;
        @XmlElement(name = "RECORD", required = true)
        private Record record;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "Record")
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Record {
        @XmlAttribute(name = "DEVICENO", required = true)
        private String deviceNo;
        @XmlAttribute(name = "DEVICEMTYPE", required = true)
        private String deviceMType;
        @XmlAttribute(name = "WORKTYPE", required = true)
        private String workType;
        /** 设备是否暂停 */
        @XmlAttribute(name = "ISHALT", required = true)
        private boolean isHalt;
        /** 限载重量 */
        @XmlAttribute(name = "MOVECAPACITY", required = true)
        private String moveCapacity;
    }
}
