package com.module.parser.entity.result;

import com.module.parser.reflect.VueField;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class UnloadOrderResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "OP007031", required = true)
    private List<DataTable> dataTable;

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
        @VueField(label = "workItemNo", sortable = true)
        private String workItemNo;
        @XmlElement(name = "CONTAINERNO")
        @VueField(label = "containerNo", sortable = true)
        private String containerNo;
        @XmlElement(name = "CONTAINERID")
        @VueField(label = "containerId")
        private String containerId;
        @XmlElement(name = "STATUS")
        @VueField(label = "status")
        private String status;
        @XmlElement(name = "TARGET")
        @VueField(label = "target")
        private String target;
        @XmlElement(name = "SHORTCODE")
        @VueField(label = "shortCode")
        private String shortCode;
        @XmlElement(name = "WORKPOINTNO")
        @VueField(label = "workPointNo", sortable = true)
        private String workPointNo;
        @XmlElement(name = "CARRYDEVICE")
        @VueField(label = "carryDevice")
        private String carryDevice;
        @XmlElement(name = "POSONTRUCK")
        @VueField(label = "posonTruck")
        private String posonTruck;
        @XmlElement(name = "SETUPTEMP")
        @VueField(label = "setupTemp")
        private String setupTemp;
        @XmlElement(name = "VESSELCOMPANYSEALNO")
        @VueField(label = "vesselCompanySealNo", sortable = true)
        private String vesselCompanySealNo;
        @XmlElement(name = "CIQSEALNO")
        @VueField(label = "ciqSealNo", sortable = true)
        private String ciqSealNo;
        @XmlElement(name = "VESSELCOMPANYSEALNOLIST")
        @VueField(label = "vesselCompanySealNoList")
        private String vesselCompanySealNoList;
        @XmlElement(name = "CIQSEALNOLIST")
        @VueField(label = "ciqSealNoList")
        private String ciqSealNoList;
        @XmlElement(name = "ISAUTOLISTSEALNO")
        @VueField(label = "isAutoListSealNo", sortable = true)
        private String isAutoListSealNo;
        @XmlElement(name = "OVERFRONT")
        @VueField(label = "overFront")
        private String overFront;
        @XmlElement(name = "OVERBEHIND")
        @VueField(label = "overBehind")
        private String overBehind;
        @XmlElement(name = "OVERLEFT")
        @VueField(label = "overLeft")
        private String overLeft;
        @XmlElement(name = "OVERRIGHT")
        @VueField(label = "overRight")
        private String overRight;
        @XmlElement(name = "OVERTOP")
        @VueField(label = "overTop")
        private String overTop;
        @XmlElement(name = "EMPTYFULL")
        @VueField(label = "emptyFull")
        private String emptyFull;
        @XmlElement(name = "ISOCODE")
        @VueField(label = "isoCode")
        private String isoCode;
        @XmlElement(name = "DAMAGECODE")
        @VueField(label = "damageCode")
        private String damageCode;
        @XmlElement(name = "GRADEID")
        @VueField(label = "gradeId", sortable = true)
        private String gradeId;
        @XmlElement(name = "CONTAINERSIZE")
        @VueField(label = "containerSize")
        private String containerSize;
        @XmlElement(name = "SOURCEPOS")
        @VueField(label = "sourcePos")
        private String sourcePos;
        /** ---------!!!!不同命名空间下同一名称的字段---------*/
        //private String target;
        @XmlElement(name = "ISREEF")
        @VueField(label = "isReef")
        private String isReef;
        @XmlElement(name = "ISOVERTOP")
        @VueField(label = "isOverTop")
        private String isOverTop;
        @XmlElement(name = "ISIMDG")
        @VueField(label = "isImdg")
        private String isImdg;
        @XmlElement(name = "CONTAINERTYPE")
        @VueField(label = "containerType")
        private String containerType;
        @XmlElement(name = "CONTAINERHEIGHT")
        @VueField(label = "containerHeight")
        private String containerHeight;
        @XmlElement(name = "ISDISCHECKCTN")
        @VueField(label = "isDisCheckCTN")
        private String isDisCheckCTN;
        @XmlElement(name = "ISDISCHECKSEAL")
        @VueField(label = "isDisCheckSeal")
        private String isDisCheckSeal;
        @XmlElement(name = "ISOVERDIS")
        @VueField(label = "isOverDis")
        private String isOverDis;
        @XmlElement(name = "SPECIALREQUIREMENTS")
        @VueField(label = "specialRequirements")
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
