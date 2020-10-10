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
        @VueField(label = "船别名")
        private String vesselAlias;
        @XmlElement(name = "EVESSELNAME")
        @VueField(label = "船名简称")
        private String eVesselName;
        @XmlElement(name = "CVESSELNAME")
        @VueField(label = "船名全称")
        private String cVesselName;
        @XmlElement(name = "INBOUNDVOY")
        @VueField(label = "进口航次", sortable = true)
        private String inBoundVoy;//进口航次
        @XmlElement(name = "OUTBOUNDVOY")
        @VueField(label = "出口航次", sortable = true)
        private String outBoundVoy;//出口航次

        @XmlElement(name = "VESSELTYPE")
        @VueField(label = "船舶类型")
        private String vesselType;//船舶类型，B-班轮/S-驳船
        @XmlElement(name = "BERTHNO")
        @VueField(label = "实际泊位号", sortable = true)
        private String berthNo;//实际靠泊泊位号
        @XmlElement(name = "BERTHWAY")
        @VueField(label = "实际靠泊方向")
        private String berthWay;
        @XmlElement(name = "STATE")
        @VueField(label = "状态")
        private String state;//状态：A-已激活 C-已取消 I-已关闭 O-已取消靠泊
    }

}
