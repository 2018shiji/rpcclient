package com.module.parser.entity.result;

import com.module.parser.reflect.VueField;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "containers", "bindInfo", "imdgInfo"})
public class FindBoxResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "CM_CONTAINERS")
    private List<Containers> containers;
    @XmlElement(name = "CM_CONTAINERS_BINDINFO")
    private List<ContainersBindInfo> bindInfo;
    @XmlElement(name = "CM_CONTAINERIMDGINFO")
    private List<ContainerImdgInfo> imdgInfo;

//    @XmlElement(name = "CM005001", required = true)
//    private List<DataTable> dataTable;
//
//    @Data
//    @XmlAccessorType(XmlAccessType.FIELD)
//    @XmlType(name = "CM005001", propOrder = {"containers", "bindInfo", "imdgInfo"})
//    public static class DataTable{
//
//    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "CM_CONTAINERS")
    public static class Containers{
        @XmlElement(name = "CONTAINERNO", required = true)
        @VueField(label = "箱号", sortable = true)
        private String containerNo;
        @XmlElement(name = "INAIM", required = true)
        @VueField(label = "进港类型")
        private String inAim;
        @XmlElement(name = "PLANVESSELCELL", required = true)
        @VueField(label = "计划装船位置", sortable = true)
        private String planVesselCell;
        @XmlElement(name = "INEVESSELNAME", required = true)
        @VueField(label = "进口船名")
        private String ineVesselName;
        @XmlElement(name = "INBOUNDVOY", required = true)
        @VueField(label = "进口航次", sortable = true)
        private String inBoundVoy;
        @XmlElement(name = "INVELALIASE", required = true)
        @VueField(label = "进口船别名")
        private String inVelAliase;
        @XmlElement(name = "OUTEVESSELNAME", required = true)
        @VueField(label = "出口船名")
        private String outeVesselName;
        @XmlElement(name = "OUTBOUNDVOY", required = true)
        @VueField(label = "出口船次", sortable = true)
        private String outBoundVoy;
        @XmlElement(name = "OUTVELALIASE", required = true)
        @VueField(label = "出口船别名")
        private String outVelAliase;
        @XmlElement(name = "ISOCODE")
        @VueField(label = "ISO代码")
        private String isoCode;
        @XmlElement(name = "CONTAINERTYPE")
        @VueField(label = "箱型")
        private String containerType;
        @XmlElement(name = "CONTAINERHEIGHT")
        @VueField(label = "高度")
        private String containerHeight;
        @XmlElement(name = "CONTAINERSIZE")
        @VueField(label = "尺寸")
        private String containerSize;
        @XmlElement(name = "ISREEF", required = true)
        @VueField(label = "冷藏")
        private String isReef;
        @XmlElement(name = "ISIMDG", required = true)
        @VueField(label = "危品")
        private String isImdg;
        @XmlElement(name = " ISOVERTOP", required = true)
        @VueField(label = "超限")
        private String isOverTop;
        @XmlElement(name = "ISDAMAGE", required = true)
        @VueField(label = "残损")
        private String isDamage;
        @XmlElement(name = "ISBIND", required = true)
        @VueField(label = "绑扎")
        private String isBind;
        @XmlElement(name = "FROMLOCK", required = true)
        @VueField(label = "海关锁")
        private String formLock;
        @XmlElement(name = "TERMINALLOCK", required = true)
        @VueField(label = "码头锁")
        private String terminalLock;
        @XmlElement(name = "EMPTYFULL", required = true)
        @VueField(label = "空重")
        private String emptyFull;
        @XmlElement(name = "CONTAINEROWNER", required = true)
        @VueField(label = "箱主")
        private String containerOwner;
        @XmlElement(name = "OVERTOP")
        @VueField(label = "超高")
        private String overTop;
        @XmlElement(name = "OVERFRONT")
        @VueField(label = "前超")
        private String overFront;
        @XmlElement(name = "OVERBEHIND")
        @VueField(label = "后超")
        private String overBehind;
        @XmlElement(name = "OVERLEFT")
        @VueField(label = "左超")
        private String overLeft;
        @XmlElement(name = "OVERRIGHT")
        @VueField(label = "右超")
        private String overRight;
        @XmlElement(name = "ISOVERFLOW", required = true)
        @VueField(label = "溢卸")
        private String isOverFlow;
        @XmlElement(name = "LOCTYPE", required = true)
        @VueField(label = "当前位置")
        private String locType;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "CM_CONTAINERS_BINDINFO")
    public static class ContainersBindInfo{
        @XmlElement(name = "CONTAINERNO", required = true)
        @VueField(label = "箱号", sortable = true)
        private String containerNo;
        @XmlElement(name = "INAIM", required = true)
        @VueField(label = "进港类型")
        private String inAim;
        @XmlElement(name = "PLANVESSELCELL", required = true)
        @VueField(label = "计划装船位置", sortable = true)
        private String planVesselCell;
        @XmlElement(name = "INEVESSELNAME", required = true)
        @VueField(label = "进口船名")
        private String ineVesselName;
        @XmlElement(name = "INBOUNDVOY", required = true)
        @VueField(label = "进口船次", sortable = true)
        private String inBoundVoy;
        @XmlElement(name = "INVELALIASE", required = true)
        @VueField(label = "进口船别名")
        private String inVelAliase;
        @XmlElement(name = "OUTEVESSELNAME", required = true)
        @VueField(label = "出口船名")
        private String outeVesselName;
        @XmlElement(name = "OUTBOUNDVOY", required = true)
        @VueField(label = "出口航次", sortable = true)
        private String outBoundVoy;
        @XmlElement(name = "OUTVELALIASE", required = true)
        @VueField(label = "出口船别名")
        private String outVelAliase;
        @XmlElement(name = "ISOCODE")
        @VueField(label = "ISO代码")
        private String isoCode;
        @XmlElement(name = "CONTAINERTYPE")
        @VueField(label = "箱型")
        private String containerType;
        @XmlElement(name = "CONTAINERHEIGHT")
        @VueField(label = "高度")
        private String containerHeight;
        @XmlElement(name = "CONTAINERSIZE")
        @VueField(label = "尺寸")
        private String containerSize;
        @XmlElement(name = "ISREEF", required = true)
        @VueField(label = "冷藏")
        private String isReef;
        @XmlElement(name = "ISIMDG", required = true)
        @VueField(label = "危品")
        private String isImdg;
        @XmlElement(name = "ISOVERTOP", required = true)
        @VueField(label = "超限")
        private String isOverTop;
        @XmlElement(name = "ISDAMAGE", required = true)
        @VueField(label = "残损")
        private String isDamage;
        @XmlElement(name = "ISBIND", required = true)
        @VueField(label = "绑扎")
        private String isBind;
        @XmlElement(name = "FROMLOCK", required = true)
        @VueField(label = "海关锁")
        private String formLock;
        @XmlElement(name = "EMPTYFULL", required = true)
        @VueField(label = "空重")
        private String emptyFull;
        @XmlElement(name = "CONTAINEROWNER", required = true)
        @VueField(label = "箱主")
        private String containerOwner;
        @XmlElement(name = "OVERTOP")
        @VueField(label = "超高")
        private String overTop;
        @XmlElement(name = "OVERFRONT")
        @VueField(label = "前超")
        private String overFront;
        @XmlElement(name = "OVERBEHIND")
        @VueField(label = "后超")
        private String overBehind;
        @XmlElement(name = "OVERLEFT")
        @VueField(label = "左超")
        private String overLeft;
        @XmlElement(name = "OVERRIGHT")
        @VueField(label = "右超")
        private String overRight;
        @XmlElement(name = "ISOVERFLOW", required = true)
        @VueField(label = "溢卸")
        private String isOverFlow;
        @XmlElement(name = "TERMINALLOCK", required = true)
        @VueField(label = "码头锁")
        private String terminalLock;
        @XmlElement(name = "LOCTYPE", required = true)
        @VueField(label = "当前位置")
        private String locType;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "CM_CONTAINERIMDGINFO")
    public static class ContainerImdgInfo{
        @XmlElement(name = "IMDGLEVEL", required = true)
        @VueField(label = "危标等级")
        private String imdgLevel;
        @XmlElement(name = "CONTAINERID")
        @VueField(label = "箱ID")
        private String containerId;
        @XmlElement(name = "IMDGUNNO", required = true)
        @VueField(label = "危品UNNO")
        private String imdgunNo;
        @XmlElement(name = "DANGERLEVEL", required = true)
        @VueField(label = "危品等级")
        private String dangerLevel;
        @XmlElement(name = "ISALARM", required = true)
        @VueField(label = "危标提示")
        private String isAlarm;
    }
}
