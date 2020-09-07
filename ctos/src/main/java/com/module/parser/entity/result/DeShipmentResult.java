package com.module.parser.entity.result;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class DeShipmentResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "OP007031", required = true)
    private DataTable dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "OP007031", propOrder = {"workItems", "dangerInfo"})
    public static class DataTable{
        @XmlElement(name = "WI_WORKITEMS")
        private WorkItems workItems;
        @XmlElement(name = "DANGERINFO")
        private DangerInfo dangerInfo;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "WI_WORKITEMS")
    public static class WorkItems{
        @XmlElement(name = "WORKITEMNO")
        private String workItemNo;
        @XmlElement(name = "CONTAINERNO")
        private String containerNo;
        @XmlElement(name = "CONTAINERID")
        private String containerId;
        @XmlElement(name = "STATUS")
        private String status;
        @XmlElement(name = "TARGET")
        private String target;
        @XmlElement(name = "SHORTCODE")
        private String shortCode;
        @XmlElement(name = "WORKPOINTNO")
        private String workPointNo;
        @XmlElement(name = "CARRYDEVICE")
        private String carryDevice;
        @XmlElement(name = "POSONTRUCK")
        private String posonTruck;
        @XmlElement(name = "SETUPTEMP")
        private String setupTemp;
        @XmlElement(name = "VESSELCOMPANYSEALNO")
        private String vesselCompanySealNo;
        @XmlElement(name = "CIQSEALNO")
        private String ciqSealNo;
        @XmlElement(name = "VESSELCOMPANYSEALNOLIST")
        private String vesselCompanySealNoList;
        @XmlElement(name = "CIQSEALNOLIST")
        private String ciqSealNoList;
        @XmlElement(name = "ISAUTOLISTSEALNO")
        private String isAutoListSealNo;
        @XmlElement(name = "OVERFRONT")
        private String overFront;
        @XmlElement(name = "OVERBEHIND")
        private String overBehind;
        @XmlElement(name = "OVERLEFT")
        private String overLeft;
        @XmlElement(name = "OVERRIGHT")
        private String overRight;
        @XmlElement(name = "overTop")
        private String overTop;
        @XmlElement(name = "EMPTYFULL")
        private String emptyFull;
        @XmlElement(name = "ISOCODE")
        private String isoCode;
        @XmlElement(name = "DAMAGECODE")
        private String damageCode;
        @XmlElement(name = "GRADEID")
        private String gradeId;
        @XmlElement(name = "CONTAINERSIZE")
        private String containerSize;
        @XmlElement(name = "SOURCEPOS")
        private String sourcePos;
        /** ---------!!!!---------*/
        //private String target;
        @XmlElement(name = "ISREEF")
        private String isReef;
        @XmlElement(name = "ISOVERTOP")
        private String isOverTop;
        @XmlElement(name = "ISIMDG")
        private String isImdg;
        @XmlElement(name = "CONTAINERTYPE")
        private String containerType;
        @XmlElement(name = "CONTAINERHEIGHT")
        private String containerHeight;
        @XmlElement(name = "ISDISCHECKCTN")
        private String isDisCheckCTN;
        @XmlElement(name = "ISDISCHECKSEAL")
        private String isDisCheckSeal;
        @XmlElement(name = "ISOVERDIS")
        private String isOverDis;
        @XmlElement(name = "SPECIALREQUIREMENTS")
        private String specialRequirements;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "DANGERINFO")
    public static class DangerInfo{
        @XmlElement(name = "IMDGUNNO")
        private String imdgunNo;
        @XmlElement(name = "DANGERLEVEL")
        private String dangerLevel;
        @XmlElement(name = "ISALARM")
        private String isAlarm;
        @XmlElement(name = "IMDGLEVEL")
        private String imdgLevel;
    }
}
