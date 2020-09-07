package com.module.parser.entity.result;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class ShipmentDownResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "OP007037", required = true)
    private DataTable dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "OP007037", propOrder = {"timeLines"})
    public static class DataTable{
        private DeviceOpTimeLines timeLines;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "WI_DEVICEOPTIMELINES", propOrder = {"deviceOpTimeLineSid", "finishCounts"})
    public static class DeviceOpTimeLines{
        @XmlElement(name = "DEVICEOPTIMELINESID", required = true)
        private String deviceOpTimeLineSid;
        @XmlElement(name = "FINISHCOUNTS", required = true)
        private String finishCounts;
    }
}
