package com.module.parser.entity.result;

import com.module.parser.reflect.VueField;
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
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class LoginResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "OP007001", required = true)
    private List<DataTable> dataTable;


    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "OP007001", propOrder = {"terminalDevice", "ticketId"})
    public static class DataTable {
        @XmlElement(name = "TD_TERMINALDEVICE", required = true)
        private TerminalDevice terminalDevice;
        @XmlElement(name = "TICKET_ID", required = true)
        @VueField(label = "ticketId")
        private String ticketId;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "TD_TERMINALDEVICE")
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TerminalDevice {
        @XmlElement(name = "DEVICENO", required = true)
        @VueField(label = "deviceNo", sortable = true)
        private String deviceNo;
        @XmlElement(name = "DEVICEMTYPE", required = true)
        @VueField(label = "deviceMType")
        private String deviceMType;
        @XmlElement(name = "WORKTYPE", required = true)
        @VueField(label = "workType")
        private String workType;
        /** 设备是否暂停 */
        @XmlElement(name = "ISHALT", required = true)
        @VueField(label = "isHalt")
        private boolean isHalt;
        /** 限载重量 */
        @XmlElement(name = "MOVECAPACITY", required = true)
        @VueField(label = "moveCapacity")
        private String moveCapacity;
    }
}
