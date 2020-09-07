package com.module.parser.entity.result;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class ShipmentUpResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "DATATABLE", required = true)
    private DataTable dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "OP007036", propOrder = {"timeLines", "errInfo"})
    public static class DataTable{
        @XmlElement(name = "WI_DEVICEOPTIMELINES", required = true)
        private DeviceOpTimeLines timeLines;
        @XmlElement(name = "ERRINFO")
        private ErrInfo errInfo;
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

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "ERRINFO", propOrder = {"containerNo", "errorCode", "errMsg"})
    public static class ErrInfo{
        @XmlElement(name = "CONTAINERNO")
        private String containerNo;
        @XmlElement(name = "ERRORCODE")
        private String errorCode;
        @XmlElement(name = "ERRMSG")
        private String errMsg;
    }
}
