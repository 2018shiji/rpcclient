package com.module.parser.entity.result;

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
        private String velAliase;
        @XmlElement(name = "INBOUNDVOY", required = true)
        private String inBoundVoy;
        @XmlElement(name = "OUTBOUNDVOY", required = true)
        private String outBoundVoy;
        @XmlElement(name = "QCVIRTUALLANE", required = true)
        private String QCVirtualAllane;
        @XmlElement(name = "STARTTIME")
        private String startTime;
        @XmlElement(name = "ENDTIME")
        private String endTime;
        @XmlElement(name = "VESSELTYPE", required = true)
        private String vesselType;
    }
}
