package com.module.parser.entity.result;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class FindBoxOrderResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "OP007032", required = true)
    private DataTable dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "OP007032", propOrder = {"workItems"})
    public static class DataTable{
        @XmlElement(name = "WI_WORKITEMS", required = true)
        private WorkItems workItems;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "WI_WORKITEMS")
    public static class WorkItems{
        @XmlElement(name = "WORKQUEUENO")
        private String workQueueNo;
        @XmlElement(name = "WORKITEMNO")
        private String workItemNo;
        @XmlElement(name = "CONTAINERID")
        private String containerId;
        @XmlElement(name = "CONTAINERNO")
        private String containerNo;
        @XmlElement(name = "CONTAINERSIZE")
        private String containerSize;
        @XmlElement(name = "CONTAINERTYPE")
        private String containerType;
        @XmlElement(name = "EMPTYFULL")
        private String emptyFull;
        @XmlElement(name = "CARRYDEVICE")
        private String carryDevice;
        @XmlElement(name = "POSONTRUCK")
        private String posonTruck;
        @XmlElement(name = "GROSSWEIGHT")
        private String grossWeight;
        @XmlElement(name = "ISOCODE")
        private String isoCode;
        @XmlElement(name = "SNAME")
        private String sName;
        @XmlElement(name = "SOURCEPOS")
        private String sourcePos;
        @XmlElement(name = "TARGET")
        private String target;
        @XmlElement(name = "POD")
        private String pod;
        @XmlElement(name = "WORKPOINTNO")
        private String workPointNo;
        @XmlElement(name = "DAMAGECODE")
        private String damageCode;
        @XmlElement(name = "STATUS")
        private String status;
    }
}
