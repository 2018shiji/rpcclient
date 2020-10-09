package com.module.parser.entity.result;

import com.module.parser.reflect.VueField;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class ShipmentUpRegResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "OP007036", required = true)
    private List<DataTable> dataTable;

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
    @XmlType(name = "WI_DEVICEOPTIMELINES")
    public static class DeviceOpTimeLines{
        @XmlElement(name = "DEVICEOPTIMELINESID", required = true)
        @VueField(label = "deviceOpTimeLineSid")
        private String deviceOpTimeLineSid;
        @XmlElement(name = "FINISHCOUNTS", required = true)
        @VueField(label = "finishCounts", sortable = true)
        private String finishCounts;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "ERRINFO")
    public static class ErrInfo{
        @XmlElement(name = "CONTAINERNO")
        @VueField(label = "containerNo", sortable = true)
        private String containerNo;
        @XmlElement(name = "ERRORCODE")
        @VueField(label = "errorCode")
        private String errorCode;
        @XmlElement(name = "ERRMSG")
        @VueField(label = "errMsg")
        private String errMsg;
    }
}
