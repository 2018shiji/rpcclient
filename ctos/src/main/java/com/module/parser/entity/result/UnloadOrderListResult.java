package com.module.parser.entity.result;

import com.module.parser.reflect.VueField;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class UnloadOrderListResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "OP004041", required = true)
    private List<DataTable> dataTable;


    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "OP004041", propOrder = {"workItemDis"})
    public static class DataTable{
        @XmlElement(name = "WI_WORKITEM_DIS")
        private WorkItemDis workItemDis;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "WI_WORKITEM_DIS")
    public static class WorkItemDis{
        @XmlElement(name = "CONTAINERNO")
        @VueField(label = "containerNo", sortable = true)
        private String containerNo;
        @XmlElement(name = "ISOCODE")
        @VueField(label ="isoCode")
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
        @XmlElement(name = "SOURCEPOS")
        @VueField(label = "sourcePos")
        private String sourcePos;
        @XmlElement(name = "RELACONTAINERNO")
        @VueField(label = "relaContainerNo", sortable = true)
        private String relaContainerNo;
        @XmlElement(name = "RELAISOCODE")
        @VueField(label = "relaIsoCode")
        private String relaIsoCode;
        @XmlElement(name = "RELACONTAINERTYPE")
        @VueField(label = "relaContainerType")
        private String relaContainerType;
        @XmlElement(name = "RELACONTAINERHEIGHT")
        @VueField(label = "relaContainerHeight")
        private String relaContainerHeight;
        @XmlElement(name = "RELACONTAINERSIZE")
        @VueField(label = "relaContainerSize")
        private String relaContainerSize;
        @XmlElement(name = "RELAEMPTYFULL")
        @VueField(label = "relaEmptyFull")
        private String relaEmptyFull;
        @XmlElement(name = "RELAISREEF")
        @VueField(label = "relaIsReef")
        private String relaIsReef;
        @XmlElement(name = "RELAISIMDG")
        @VueField(label = "relaIsImdg")
        private String relaIsImdg;
        @XmlElement(name = "RELAISOVERTOP")
        @VueField(label = "relaIsOverTop")
        private String relaIsOverTop;
        @XmlElement(name = "RELAISDAMAGE")
        @VueField(label = "relaIsDamage")
        private String relaIsDamage;
        @XmlElement(name = "RELAISBIND")
        @VueField(label = "relaIsBind")
        private String relaIsBind;
        @XmlElement(name = "RELASOURCEPOS")
        @VueField(label = "relaSourcePos")
        private String relaSourcePos;

    }
}
