package com.module.parser.entity.response;

import com.module.parser.reflect.VueField;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class BoxResult {

    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "OTS001008", required = true)
    private List<DataTable> dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "OTS001008", propOrder = {"containerOnShip"})
    public static class DataTable{
        @XmlElement(name = "CM_CONTAINERONSHIP", required = true)
        private ContainerOnShip containerOnShip;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "CM_CONTAINERONSHIP")
    public static class ContainerOnShip{
        @XmlElement(name = "CONTAINERNO")
        @VueField(label = "箱号", sortable = true)
        private String containerNo;
        @XmlElement(name = "CONTAINERID")
        @VueField(label = "箱ID", sortable = true)
        private String containerId;
        @XmlElement(name = "ISOCODE")
        @VueField(label = "ISO", sortable = true)
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
        @XmlElement(name = "CONTAINEROWNER")
        @VueField(label = "箱主")
        private String containerOwner;
        @XmlElement(name = "EMPTYFULL")
        @VueField(label = "空重")
        private String emptyFull;
        @XmlElement(name = "INAIM")
        @VueField(label = "进港类型")
        private String inAim;
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
        @XmlElement(name = "OUTTYPE")
        @VueField(label = "指令工作点")
        private String outType;
        @XmlElement(name = "INVESSELCELL")
        @VueField(label = "船上位置")
        private String inVesselCell;
    }
}
