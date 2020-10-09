package com.module.parser.entity.result;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class GetWorkOrderListResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "OP004039", required = true)
    private List<DataTable> dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "OP004039", propOrder = {"workItemHis"})
    public static class DataTable{
        @XmlElement(name = "WI_WORKITEMHIS", required = true)
        private WorkItemHis workItemHis;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "WI_WORKITEMHIS")
    public static class WorkItemHis{
        @XmlElement(name = "NUMB", required = true)
        private String numb;
        @XmlElement(name = "BERTHNO")
        private String berthNo;
        @XmlElement(name = "BERTHPLANNO")
        private String berthPlanNo;
        @XmlElement(name = "WORKPOINTNO")
        private String workPointNo;
        @XmlElement(name = "CONTAINERNO")
        private String containerNo;
        @XmlElement(name = "CARRYDEVICE")
        private String carryDevice;
        @XmlElement(name = "IOSCODE")
        private String isoCode;
        @XmlElement(name = "CONTAINERSIZE")
        private String containerSize;
        @XmlElement(name = "CONTAINERTYPE")
        private String containerType;
        @XmlElement(name = "CONTAINERHEIGHT")
        private String containerHeight;
        @XmlElement(name = "ISPUTONSHORE")
        private String isPutOnShore;
        @XmlElement(name = "QUEUETYPE")
        private String queueType;
        @XmlElement(name = "OPERATIONMAN")
        private String operationMan;
        @XmlElement(name = "OPERATIONTIME")
        private String operationTime;
        @XmlElement(name = "STATUS")
        private String status;
    }
}
