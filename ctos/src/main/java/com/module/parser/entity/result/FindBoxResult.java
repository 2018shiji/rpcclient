package com.module.parser.entity.result;

import com.module.parser.reflect.VueField;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class FindBoxResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "CM005001", required = true)
    private List<DataTable> dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "CM005001", propOrder = {"containers", "bindInfo", "imdgInfo"})
    public static class DataTable{
        @XmlElement(name = "CM_CONTAINERS", required = true)
        private Containers containers;
        @XmlElement(name = "CM_CONTAINERS_BINDINFO")
        private ContainersBindInfo bindInfo;
        @XmlElement(name = "CM_CONTAINERIMDGINFO")
        private ContainerImdgInfo imdgInfo;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "CM_CONTAINERS")
    public static class Containers{
        @XmlElement(name = "CONTAINERNO", required = true)
        @VueField(label = "containerNo", sortable = true)
        private String containerNo;
        @XmlElement(name = "INAIM", required = true)
        @VueField(label = "inAim")
        private String inAim;
        @XmlElement(name = "PLANVESSELCELL", required = true)
        @VueField(label = "planVesselCell", sortable = true)
        private String planVesselCell;
        @XmlElement(name = "INEVESSELNAME", required = true)
        @VueField(label = "ineVesselName")
        private String ineVesselName;
        @XmlElement(name = "INBOUNDVOY", required = true)
        @VueField(label = "inBoundVoy", sortable = true)
        private String inBoundVoy;
        @XmlElement(name = "INVELALIASE", required = true)
        @VueField(label = "inVelAliase")
        private String inVelAliase;
        @XmlElement(name = "OUTEVESSELNAME", required = true)
        @VueField(label = "outeVesselName")
        private String outeVesselName;
        @XmlElement(name = "OUTBOUNDVOY", required = true)
        @VueField(label = "outBoundVoy", sortable = true)
        private String outBoundVoy;
        @XmlElement(name = "OUTVELALIASE", required = true)
        @VueField(label = "outVelAliase")
        private String outVelAliase;
        @XmlElement(name = "ISOCODE")
        @VueField(label = "isoCode")
        private String isoCode;
        @XmlElement(name = "CONTAINERTYPE")
        @VueField(label = "containerType")
        private String containerType;
        @XmlElement(name = "CONTAINERHEIGHT")
        @VueField(label = "containerHeight")
        private String containerHeight;
        @XmlElement(name = "CONTAINERSIZE")
        @VueField(label = "containerSize")
        private String containerSize;
        @XmlElement(name = "ISREEF", required = true)
        @VueField(label = "isReef")
        private String isReef;
        @XmlElement(name = "ISIMDG", required = true)
        @VueField(label = "isImdg")
        private String isImdg;
        @XmlElement(name = " ISOVERTOP", required = true)
        @VueField(label = "isOverTop")
        private String isOverTop;
        @XmlElement(name = "ISDAMAGE", required = true)
        @VueField(label = "isDamage")
        private String isDamage;
        @XmlElement(name = "ISBIND", required = true)
        @VueField(label = "isBind")
        private String isBind;
        @XmlElement(name = "FROMLOCK", required = true)
        @VueField(label = "fromLock")
        private String formLock;
        @XmlElement(name = "TERMINALLOCK", required = true)
        @VueField(label = "terminalLock")
        private String terminalLock;
        @XmlElement(name = "EMPTYFULL", required = true)
        @VueField(label = "emptyFull")
        private String emptyFull;
        @XmlElement(name = "CONTAINEROWNER", required = true)
        @VueField(label = "containerOwner")
        private String containerOwner;
        @XmlElement(name = "OVERTOP")
        @VueField(label = "overTop")
        private String overTop;
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
        @XmlElement(name = "ISOVERFLOW", required = true)
        @VueField(label = "isOverFlow")
        private String isOverFlow;
        @XmlElement(name = "LOCTYPE", required = true)
        @VueField(label = "locType")
        private String locType;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "CM_CONTAINERS_BINDINFO")
    public static class ContainersBindInfo{
        @XmlElement(name = "CONTAINERNO", required = true)
        @VueField(label = "containerNo", sortable = true)
        private String containerNo;
        @XmlElement(name = "INAIM", required = true)
        @VueField(label = "inAim")
        private String inAim;
        @XmlElement(name = "PLANVESSELCELL", required = true)
        @VueField(label = "planVesselCell", sortable = true)
        private String planVesselCell;
        @XmlElement(name = "INEVESSELNAME", required = true)
        @VueField(label = "ineVesselName")
        private String ineVesselName;
        @XmlElement(name = "INBOUNDVOY", required = true)
        @VueField(label = "inBoundVoy", sortable = true)
        private String inBoundVoy;
        @XmlElement(name = "INVELALIASE", required = true)
        @VueField(label = "inVelAliase")
        private String inVelAliase;
        @XmlElement(name = "OUTEVESSELNAME", required = true)
        @VueField(label = "outeVesselName")
        private String outeVesselName;
        @XmlElement(name = "OUTBOUNDVOY", required = true)
        @VueField(label = "outBoundVoy", sortable = true)
        private String outBoundVoy;
        @XmlElement(name = "OUTVELALIASE", required = true)
        @VueField(label = "outVelAliase")
        private String outVelAliase;
        @XmlElement(name = "ISOCODE")
        @VueField(label = "isoCode")
        private String isoCode;
        @XmlElement(name = "CONTAINERTYPE")
        @VueField(label = "containerType")
        private String containerType;
        @XmlElement(name = "CONTAINERHEIGHT")
        @VueField(label = "containerHeight")
        private String containerHeight;
        @XmlElement(name = "CONTAINERSIZE")
        @VueField(label = "containerSize")
        private String containerSize;
        @XmlElement(name = "ISREEF", required = true)
        @VueField(label = "isReef")
        private String isReef;
        @XmlElement(name = "ISIMDG", required = true)
        @VueField(label = "isImdg")
        private String isImdg;
        @XmlElement(name = "ISOVERTOP", required = true)
        @VueField(label = "isOverTop")
        private String isOverTop;
        @XmlElement(name = "ISDAMAGE", required = true)
        @VueField(label = "isDamage")
        private String isDamage;
        @XmlElement(name = "ISBIND", required = true)
        @VueField(label = "isBind")
        private String isBind;
        @XmlElement(name = "FROMLOCK", required = true)
        @VueField(label = "formLock")
        private String formLock;
        @XmlElement(name = "EMPTYFULL", required = true)
        @VueField(label = "emptyFull")
        private String emptyFull;
        @XmlElement(name = "CONTAINEROWNER", required = true)
        @VueField(label = "containerOwner")
        private String containerOwner;
        @XmlElement(name = "OVERTOP")
        @VueField(label = "overTop")
        private String overTop;
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
        @XmlElement(name = "ISOVERFLOW", required = true)
        @VueField(label = "isOverFlow")
        private String isOverFlow;
        @XmlElement(name = "TERMINALLOCK", required = true)
        @VueField(label = "terminalLock")
        private String terminalLock;
        @XmlElement(name = "LOCTYPE", required = true)
        @VueField(label = "locType")
        private String locType;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "CM_CONTAINERIMDGINFO")
    public static class ContainerImdgInfo{
        @XmlElement(name = "CONTAINERID", required = true)
        private String containerId;
        @XmlElement(name = "IMDGUNNO", required = true)
        private String imdgunNo;
        @XmlElement(name = "DANGERLEVEL", required = true)
        private String dangerLevel;
        @XmlElement(name = "ISALARM", required = true)
        private String isAlarm;
    }
}
