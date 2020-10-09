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
public class QueryShipUpResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "OP004042", required = true)
    private List<DataTable> dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "OP004042", propOrder = {"workItemLoad", "xxx"})
    public static class DataTable{
        @XmlElement(name = "WI_WORKITEM_LOAD")
        private WorkItemLoad workItemLoad;
        @XmlElement(name = "XXX")
        private XXX xxx;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "WI_WORKITEM_LOAD")
    public static class WorkItemLoad{
        @XmlElement(name = "WORKITEMNO")
        @VueField(label = "workItemNo", sortable = true)
        private String workItemNo;
        @XmlElement(name = "CONTAINERNO")
        @VueField(label = "containerNo", sortable = true)
        private String containerNo;
        @XmlElement(name = "CONTAINERID")
        @VueField(label = "containerId", sortable = true)
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
        @XmlElement(name = "ACTIVEMAN")
        @VueField(label = "activeMan")
        private String activeMan;
        @XmlElement(name = "ACTIVETIME")
        @VueField(label = "activeTime", sortable = true)
        private String activeTime;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "XXX")
    public static class XXX{
        @XmlElement(name = "ISOCODE", required = true)
        @VueField(label = "isoCode")
        private String isoCode;
        @XmlElement(name = "CONTAINERTYPE", required = true)
        @VueField(label = "containerType", sortable = true)
        private String containerType;
        @XmlElement(name = "CONTAINERHEIGHT", required = true)
        @VueField(label = "containerHeight")
        private String containerHeight;
        @XmlElement(name = "CONTAINERSIZE", required = true)
        @VueField(label = "containerSize")
        private String containerSize;
        @XmlElement(name = "EMPTYFULL")
        @VueField(label = "emptyFull")
        private String emptyFull;
        @XmlElement(name = "ISREEF")
        @VueField(label = "isReef")
        private String isReef;
        @XmlElement(name = "ISIMDG")
        @VueField(label = "isImdg")
        private String isImdg;
        @XmlElement(name = "ISOVERTOP")
        @VueField(label = "isOverTop")
        private String isOverTop;
        @XmlElement(name = "ISDAMAGE")
        @VueField(label = "isDamage")
        private String isDamage;
        @XmlElement(name = "ISBIND")
        @VueField(label = "isBind")
        private String isBind;
        @XmlElement(name = "VELALIASE")
        @VueField(label = "velAliase")
        private String velAliase;
        @XmlElement(name = "ISRELEASED")
        @VueField(label = "isReleased")
        private String isReleased;
    }
}
