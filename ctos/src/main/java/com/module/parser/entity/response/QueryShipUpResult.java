package com.module.parser.entity.response;

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
        @VueField(label = "指令作业编号", sortable = true)
        private String workItemNo;
        @XmlElement(name = "CONTAINERNO")
        @VueField(label = "箱号", sortable = true)
        private String containerNo;
        @XmlElement(name = "CONTAINERID")
        @VueField(label = "箱ID", sortable = true)
        private String containerId;
        @XmlElement(name = "STATUS")
        @VueField(label = "指令状态")
        private String status;
        @XmlElement(name = "TARGET")
        @VueField(label = "目标场位")
        private String target;
        @XmlElement(name = "SHORTCODE")
        @VueField(label = "箱短名")
        private String shortCode;
        @XmlElement(name = "WORKPOINTNO")
        @VueField(label = "指令所属工作点", sortable = true)
        private String workPointNo;
        @XmlElement(name = "CARRYDEVICE")
        @VueField(label = "运载设备")
        private String carryDevice;
        @XmlElement(name = "POSONTRUCK")
        @VueField(label = "车上位置")
        private String posonTruck;
        @XmlElement(name = "CARRYTIME")
        @VueField(label = "压车时间")
        private String carryTime;
        @XmlElement(name = "ACTIVEMAN")
        @VueField(label = "激活人")
        private String activeMan;
        @XmlElement(name = "ACTIVETIME")
        @VueField(label = "激活时间", sortable = true)
        private String activeTime;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "XXX")
    public static class XXX{
        @XmlElement(name = "ISOCODE", required = true)
        @VueField(label = "ISO代码")
        private String isoCode;
        @XmlElement(name = "CONTAINERTYPE", required = true)
        @VueField(label = "箱型", sortable = true)
        private String containerType;
        @XmlElement(name = "CONTAINERHEIGHT", required = true)
        @VueField(label = "高度")
        private String containerHeight;
        @XmlElement(name = "CONTAINERSIZE", required = true)
        @VueField(label = "尺寸")
        private String containerSize;
        @XmlElement(name = "EMPTYFULL")
        @VueField(label = "空重")
        private String emptyFull;
        @XmlElement(name = "ISREEF")
        @VueField(label = "冷藏")
        private String isReef;
        @XmlElement(name = "ISIMDG")
        @VueField(label = "危品")
        private String isImdg;
        @XmlElement(name = "ISOVERTOP")
        @VueField(label = "超限")
        private String isOverTop;
        @XmlElement(name = "ISDAMAGE")
        @VueField(label = "残损")
        private String isDamage;
        @XmlElement(name = "ISBIND")
        @VueField(label = "绑扎")
        private String isBind;
        @XmlElement(name = "VELALIASE")
        @VueField(label = "船别名")
        private String velAliase;
        @XmlElement(name = "ISRELEASED")
        @VueField(label = "提前释放")
        private String isReleased;
    }
}
