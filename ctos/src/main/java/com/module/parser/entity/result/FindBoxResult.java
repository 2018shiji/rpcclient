package com.module.parser.entity.result;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class FindBoxResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "CM005001", required = true)
    private DataTable dataTable;

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
        private String containerNo;
        @XmlElement(name = "INAIM", required = true)
        private String inAim;
        @XmlElement(name = "PLANVESSELCELL", required = true)
        private String planVesselCell;
        @XmlElement(name = "INEVESSELNAME", required = true)
        private String ineVesselName;
        @XmlElement(name = "INBOUNDVOY", required = true)
        private String inBoundVoy;
        @XmlElement(name = "INVELALIASE", required = true)
        private String inVelAliase;
        @XmlElement(name = "OUTEVESSELNAME", required = true)
        private String outeVesselName;
        @XmlElement(name = "OUTBOUNDVOY", required = true)
        private String outBoundVoy;
        @XmlElement(name = "OUTVELALIASE", required = true)
        private String outVelAliase;
        @XmlElement(name = "ISOCODE")
        private String isoCode;
        @XmlElement(name = "CONTAINERTYPE")
        private String containerType;
        @XmlElement(name = "CONTAINERHEIGHT")
        private String containerHeight;
        @XmlElement(name = "CONTAINERSIZE")
        private String containerSize;
        @XmlElement(name = "ISREEF", required = true)
        private String isReef;
        @XmlElement(name = "ISIMDG", required = true)
        private String isImdg;
        @XmlElement(name = " ISOVERTOP", required = true)
        private String isOverTop;
        @XmlElement(name = "ISDAMAGE", required = true)
        private String isDamage;
        @XmlElement(name = "ISBIND", required = true)
        private String isBind;
        @XmlElement(name = "FROMLOCK", required = true)
        private String formLock;
        @XmlElement(name = "TERMINALLOCK", required = true)
        private String terminalLock;
        @XmlElement(name = "EMPTYFULL", required = true)
        private String emptyFull;
        @XmlElement(name = "CONTAINEROWNER", required = true)
        private String containerOwner;
        @XmlElement(name = "OVERTOP")
        private String overTop;
        @XmlElement(name = "OVERFRONT")
        private String overFront;
        @XmlElement(name = "OVERBEHIND")
        private String overBehind;
        @XmlElement(name = "OVERLEFT")
        private String overLeft;
        @XmlElement(name = "OVERRIGHT")
        private String overRight;
        @XmlElement(name = "ISOVERFLOW", required = true)
        private String isOverFlow;
        @XmlElement(name = "LOCTYPE", required = true)
        private String locType;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "CM_CONTAINERS_BINDINFO")
    public static class ContainersBindInfo{
        @XmlElement(name = "CONTAINERNO", required = true)
        private String containerNo;
        @XmlElement(name = "INAIM", required = true)
        private String inAim;
        @XmlElement(name = "PLANVESSELCELL", required = true)
        private String planVesselCell;
        @XmlElement(name = "INEVESSELNAME", required = true)
        private String ineVesselName;
        @XmlElement(name = "INBOUNDVOY", required = true)
        private String inBoundVoy;
        @XmlElement(name = "INVELALIASE", required = true)
        private String inVelAliase;
        @XmlElement(name = "OUTEVESSELNAME", required = true)
        private String outeVesselName;
        @XmlElement(name = "OUTBOUNDVOY", required = true)
        private String outBoundVoy;
        @XmlElement(name = "OUTVELALIASE", required = true)
        private String outVelAliase;
        @XmlElement(name = "ISOCODE")
        private String isoCode;
        @XmlElement(name = "CONTAINERTYPE")
        private String containerType;
        @XmlElement(name = "CONTAINERHEIGHT")
        private String containerHeight;
        @XmlElement(name = "CONTAINERSIZE")
        private String containerSize;
        @XmlElement(name = "ISREEF", required = true)
        private String isReef;
        @XmlElement(name = "ISIMDG", required = true)
        private String isImdg;
        @XmlElement(name = "ISOVERTOP", required = true)
        private String isOverTop;
        @XmlElement(name = "ISDAMAGE", required = true)
        private String isDamage;
        @XmlElement(name = "ISBIND", required = true)
        private String isBind;
        @XmlElement(name = "FROMLOCK", required = true)
        private String formLock;
        @XmlElement(name = "EMPTYFULL", required = true)
        private String emptyFull;
        @XmlElement(name = "CONTAINEROWNER", required = true)
        private String containerOwner;
        @XmlElement(name = "OVERTOP")
        private String overTop;
        @XmlElement(name = "OVERFRONT")
        private String overFront;
        @XmlElement(name = "OVERBEHIND")
        private String overBehind;
        @XmlElement(name = "OVERLEFT")
        private String overLeft;
        @XmlElement(name = "OVERRIGHT")
        private String overRight;
        @XmlElement(name = "ISOVERFLOW", required = true)
        private String isOverFlow;
        @XmlElement(name = "TERMINALLOCK", required = true)
        private String terminalLock;
        @XmlElement(name = "LOCTYPE", required = true)
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
