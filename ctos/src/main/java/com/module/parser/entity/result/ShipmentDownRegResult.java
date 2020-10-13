package com.module.parser.entity.result;

import com.module.parser.reflect.VueField;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class ShipmentDownRegResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "OP007037", required = true)
    private List<DataTable> dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "OP007037", propOrder = {"timeLines"})
    public static class DataTable{
        @XmlElement(name = "WI_DEVICEOPTIMELINES", required = true)
        private DeviceOpTimeLines timeLines;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "WI_DEVICEOPTIMELINES")
    public static class DeviceOpTimeLines{
        @XmlElement(name = "DEVICEOPTIMELINESID", required = true)
        @VueField(label = "MOVE-ID")
        private String deviceOpTimeLineSid;
        @XmlElement(name = "FINISHCOUNTS", required = true)
        @VueField(label = "确认的指令数量", sortable = true)
        private String finishCounts;
    }
}
