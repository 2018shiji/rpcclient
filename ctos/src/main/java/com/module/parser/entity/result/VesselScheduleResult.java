package com.module.parser.entity.result;

import lombok.Data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@XmlRootElement(name = "CTOSRESULT")
public class VesselScheduleResult {
    @XmlElement(name = "RETURNINFO")
    private ReturnInfo returnInfo;
    @XmlElement(name = "DATATABLE")
    private List<DataTable> dataTables;



    @Data
    private class DataTable {
        @XmlAttribute(name = "NAME")
        private String name;
        @XmlElement(name = "RECORD")
        private Record record;
    }

    @Data
    private class Record {
        @XmlAttribute(name = "VESSELALIASE")
        private String vesselAlias;
        @XmlAttribute(name = "EVESSELNAME")
        private String eVesselName;
        @XmlAttribute(name = "CVESSELNAME")
        private String cVesselName;
        @XmlAttribute(name = "INBOUNDVOY")
        private String inBoundVoy;//进口航次
        @XmlAttribute(name = "OUTBOUNDVOY")
        private String outBoundVoy;//出口航次

        @XmlAttribute(name = "VESSELTYPE")
        private String vesselType;//船舶类型，B-班轮/S-驳船
        @XmlAttribute(name = "BERTHNO")
        private String berthNo;//实际靠泊2泊位号
        @XmlAttribute(name = "STATE")
        private String state;//状态：A-已激活 C-已取消 I-已关闭 O-已取消靠泊
    }

}
