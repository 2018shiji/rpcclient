package com.module.parser.entity.response;

import com.module.parser.reflect.VueField;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class ShipmentTaskInitResult {
    @XmlElement(name = "RETURNiNFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "OP007030", required = true)
    private List<DataTable> dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "OP007030", propOrder = {"velAliase", "inBoundVoy", "outBoundVoy", "startTime", "endTime", "vesselType"})
    public static class DataTable{
        @XmlElement(name = "VELALIASE", required = true)
        @VueField(label = "船别名")
        private String velAliase;
        @XmlElement(name = "INBOUNDVOY", required = true)
        @VueField(label = "进口航次")
        private String inBoundVoy;
        @XmlElement(name = "OUTBOUNDVOY", required = true)
        @VueField(label = "出口航次")
        private String outBoundVoy;
        @XmlElement(name = "QCVIRTUALLANE", required = true)
        @VueField(label = "虚拟作业栏")
        private String QCVirtualAllane;
        @XmlElement(name = "STARTTIME")
        @VueField(label = "停工开始时间")
        private String startTime;
        @XmlElement(name = "ENDTIME")
        @VueField(label = "停工结束时间")
        private String endTime;
        @XmlElement(name = "VESSELTYPE", required = true)
        @VueField(label = "船类型")
        private String vesselType;
    }
}
