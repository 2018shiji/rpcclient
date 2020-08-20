package com.module.parser.entity.result;

import lombok.Data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@XmlRootElement(name = "CTOSRESULT")
public class LoginResult {
    @XmlElement(name = "RETURNINFO")
    private ReturnInfo returnInfo;
    @XmlElement(name = "DATATABLE")
    private List<DataTable> dataTables;
    @XmlElement(name = "TICKET_ID")
    private String ticketId;

    @Data
    private class DataTable {
        @XmlAttribute(name = "NAME")
        private String name;
        @XmlElement(name = "RECORD")
        private Record record;
    }

    @Data
    private class Record {
        @XmlAttribute(name = "DEVICENO")
        private String deviceNo;
        @XmlAttribute(name = "DEVICEMTYPE")
        private String deviceMType;
        @XmlAttribute(name = "WORKTYPE")
        private String workType;
        /** 设备是否暂停 */
        @XmlAttribute(name = "ISHALT")
        private boolean isHalt;
        /** 限载重量 */
        @XmlAttribute(name = "MOVECAPACITY")
        private String moveCapacity;
    }
}
