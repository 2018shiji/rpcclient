package com.module.parser.entity.result;

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
public class VesselScheduleResult {
    @XmlElement(name = "RETURNINFO")
    private ReturnInfo returnInfo;
    @XmlElement(name = "VM002001")
    private List<DataTable> dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "VM002001")
    public static class DataTable {
        @XmlElement(name = "VESSELALIASE")
        @VueField(label = "vesselAlias")
        private String vesselAlias;
        @XmlElement(name = "EVESSELNAME")
        @VueField(label = "eVesselName")
        private String eVesselName;
        @XmlElement(name = "CVESSELNAME")
        @VueField(label = "cVesselName")
        private String cVesselName;
        @XmlElement(name = "INBOUNDVOY")
        @VueField(label = "inBoundVoy", sortable = true)
        private String inBoundVoy;//进口航次
        @XmlElement(name = "OUTBOUNDVOY")
        @VueField(label = "outBoundVoy", sortable = true)
        private String outBoundVoy;//出口航次

        @XmlElement(name = "VESSELTYPE")
        @VueField(label = "vesselType")
        private String vesselType;//船舶类型，B-班轮/S-驳船
        @XmlElement(name = "BERTHNO")
        @VueField(label = "berthNo", sortable = true)
        private String berthNo;//实际靠泊2泊位号
        @XmlElement(name = "STATE")
        @VueField(label = "state")
        private String state;//状态：A-已激活 C-已取消 I-已关闭 O-已取消靠泊
    }

}
