package com.module.parser.entity.result;

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
        @VueField(label = "containerNo", sortable = true)
        private String containerNo;
        @XmlElement(name = "CONTAINERID")
        @VueField(label = "containerId", sortable = true)
        private String containerId;
        @XmlElement(name = "ISOCODE")
        @VueField(label = "test", sortable = true)
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
        @XmlElement(name = "CONTAINEROWNER")
        @VueField(label = "containerOwner")
        private String containerOwner;
        @XmlElement(name = "EMPTYFULL")
        @VueField(label = "emptyFull")
        private String emptyFull;
        @XmlElement(name = "INAIM")
        @VueField(label = "inAim")
        private String inAim;
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
        @XmlElement(name = "OUTTYPE")
        @VueField(label = "outType")
        private String outType;
        @XmlElement(name = "INVESSELCELL")
        @VueField(label = "inVesselCell")
        private String inVesselCell;
    }
}
