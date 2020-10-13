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
    @XmlType(name = "OP004041")
    public static class DataTable{
        @XmlElement(name = "CONTAINERNO")
        @VueField(label = "箱号", sortable = true)
        private String containerNo;
        @XmlElement(name = "ISOCODE")
        @VueField(label ="ISO代码")
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
        @XmlElement(name = "SOURCEPOS")
        @VueField(label = "船上位置")
        private String sourcePos;
        @XmlElement(name = "RELACONTAINERNO")
        @VueField(label = "rela-箱号", sortable = true)
        private String relaContainerNo;
        @XmlElement(name = "RELAISOCODE")
        @VueField(label = "rela-ISO代码")
        private String relaIsoCode;
        @XmlElement(name = "RELACONTAINERTYPE")
        @VueField(label = "rela-箱型")
        private String relaContainerType;
        @XmlElement(name = "RELACONTAINERHEIGHT")
        @VueField(label = "rela-高度")
        private String relaContainerHeight;
        @XmlElement(name = "RELACONTAINERSIZE")
        @VueField(label = "rela-尺寸")
        private String relaContainerSize;
        @XmlElement(name = "RELAEMPTYFULL")
        @VueField(label = "rela-空重")
        private String relaEmptyFull;
        @XmlElement(name = "RELAISREEF")
        @VueField(label = "rela-冷藏")
        private String relaIsReef;
        @XmlElement(name = "RELAISIMDG")
        @VueField(label = "rela-危品")
        private String relaIsImdg;
        @XmlElement(name = "RELAISOVERTOP")
        @VueField(label = "rela-超限")
        private String relaIsOverTop;
        @XmlElement(name = "RELAISDAMAGE")
        @VueField(label = "rela-残损")
        private String relaIsDamage;
        @XmlElement(name = "RELAISBIND")
        @VueField(label = "rela-绑扎")
        private String relaIsBind;
        @XmlElement(name = "RELASOURCEPOS")
        @VueField(label = "rela-装船位置")
        private String relaSourcePos;
    }

}
