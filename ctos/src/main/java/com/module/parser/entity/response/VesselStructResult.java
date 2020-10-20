package com.module.parser.entity.response;

import com.module.parser.reflect.VueField;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "vesselBay", "vesselStack", "vesselCellAll", "vesselHatchCover"})
public class VesselStructResult {

    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "VD_VESSELBAY")
    private List<VesselBay> vesselBay;
    @XmlElement(name = "VD_VESSELSTACK")
    private List<VdVesselStack> vesselStack;
    @XmlElement(name = "VD_VESSELCELLALL")
    private List<VesselCellAll> vesselCellAll;
    @XmlElement(name = "VD_VESSELHATCHCOVER")
    private List<VesselHatchCover> vesselHatchCover;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "VD_VESSELBAY")
    public static class VesselBay{
        @XmlElement(name = "VESSELTYPECODE")
        @VueField(label = "船类型编码")
        private String vesselTypeCode;
        @XmlElement(name = "ISOBAY")
        @VueField(label = "ISOBay", sortable = true)
        private String isoBay;
        @XmlElement(name = "CUSTOMBAYNAME")
        @VueField(label = "Bay名")
        private String customBayName;
        @XmlElement(name = "TYPEA")
        @VueField(label = "Bay类型")
        private String typeA;
        @XmlElement(name = "PAIREDBAY")
        @VueField(label = "Bay伸展")
        private String pairedBay;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "VD_VESSELSTACK")
    public static class VdVesselStack {
        @XmlElement(name = "VESSELTYPECODE")
        @VueField(label = "船类名")
        private String vesselTypeCode;
        @XmlElement(name = "ISOBAY")
        @VueField(label = "ISOBay")
        private String isoBay;
        @XmlElement(name = "ISOSTACK")
        @VueField(label = "ISO列名", sortable = true)
        private String isoStack;
        @XmlElement(name = "CUSTOMSTACKNAME")
        @VueField(label = "自定义列名")
        private String customStackName;
        @XmlElement(name = "MAXHEIGHT")
        @VueField(label = "最大高度")
        private String maxHeight;
        @XmlElement(name = "MAXWEIGHTS")
        @VueField(label = "小箱最大载重")
        private String maxWeightS;
        @XmlElement(name = "MAXWEIGHTB")
        @VueField(label = "大箱最大载重")
        private String maxWeightB;
        @XmlElement(name = "TYPEA")
        @VueField(label = "甲板上下")
        private String typeA;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "VD_VESSELCELLALL")
    public static class VesselCellAll{
        @XmlElement(name = "VESSELTYPECODE")
        @VueField(label = "船类名")
        private String vesselTypeCode;
        @XmlElement(name = "ISOBAY")
        @VueField(label = "ISOBay", sortable = true)
        private String isoBay;
        @XmlElement(name = "ISOSTACK")
        @VueField(label = "ISO列名", sortable = true)
        private String isoStack;
        @XmlElement(name = "ISOTIER")
        @VueField(label = "ISO层号")
        private String isoTier;
        @XmlElement(name = "CUSTOMCELL")
        @VueField(label = "自定义层号", sortable = true)
        private String customCell;
        @XmlElement(name = "SIZETYPE")
        @VueField(label = "箱尺寸类型")
        private String sizeType;
        @XmlElement(name = "ALLOWSIZES")
        @VueField(label = "允许的箱尺寸")
        private String allowSizes;
        @XmlElement(name = "TYPEA")
        @VueField(label = "甲板上下")
        private String typeA;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "VD_VESSELHATCHCOVER")
    public static class VesselHatchCover{
        @XmlElement(name = "VESSELTYPECODE")
        @VueField(label = "船类名")
        private String vesselTypeCode;
        @XmlElement(name = "VESSELBAYNO")
        @VueField(label = "Bay号", sortable = true)
        private String vesselBayNo;
        @XmlElement(name = "HATCHCOVERNAME")
        @VueField(label = "舱盖名称")
        private String hatchCoverName;
        @XmlElement(name = "HATCHCOVERWEIGHT")
        @VueField(label = "舱盖重量")
        private String hatchCoverWeight;
        @XmlElement(name = "HSTARTLIDOVERLAP")
        @VueField(label = "横向起始舱盖互压")
        private String hStartLidOverLap;
        @XmlElement(name = "HENDLIDOVERLAP")
        @VueField(label = "横向终止舱盖互压")
        private String hEndLidOverLap;
        @XmlElement(name = "LASTUPDATEMAN")
        @VueField(label = "最后更新人")
        private String lastUpdateMan;
        @XmlElement(name = "HSTARTPOS")
        @VueField(label = "横向起始位")
        private String hStartPos;
        @XmlElement(name = "HENDPOS")
        @VueField(label = "横向结束位")
        private String hEndPos;
        @XmlElement(name = "LASTUPDATETIME")
        @VueField(label = "最后更新时间", sortable = true)
        private String lastUpdateTime;
        @XmlElement(name = "HATCHCOVERNO")
        @VueField(label = "舱盖编号", sortable = true)
        private String hatchCoverNo;
        @XmlElement(name = "HSTARTPOSABS")
        @VueField(label = "横向相对开始位")
        private String hStartPosAbs;
        @XmlElement(name = "HENDPOSABS")
        @VueField(label = "横向相对结束位")
        private String hEndPosAbs;
        @XmlElement(name = "REFBAYNO")
        @VueField(label = "关联Bay号", sortable = true)
        private String refBayNo;
        @XmlElement(name = "HSTARTPOSINCARBIN")
        @VueField(label = "横向起始位（舱内）")
        private String hStartPosInCarBin;
        @XmlElement(name = "HSTARTPOSINHOLD")
        @VueField(label = "横向结束位（舱内")
        private String hStartPosInHold;
        @XmlElement(name = "HSTARTPOSABSINCARBIN")
        @VueField(label = "横向相对开始位")
        private String hStartPosAbsInCarBin;
        @XmlElement(name = "HSTARTPOSABSINHOLD")
        @VueField(label = "横向相对结束位")
        private String hStartPosAbsInHold;
    }
}
