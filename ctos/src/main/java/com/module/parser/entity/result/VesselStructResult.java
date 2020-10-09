package com.module.parser.entity.result;

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
        @VueField(label = "isoBay", sortable = true)
        private String isoBay;
        @XmlElement(name = "CUSTOMBAYNAME")
        @VueField(label = "customBayName")
        private String customBayName;
        @XmlElement(name = "TYPEA")
        @VueField(label = "typeA")
        private String typeA;
        @XmlElement(name = "PAIREDBAY")
        @VueField(label = "pairedBay")
        private String pairedBay;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "VD_VESSELSTACK")
    public static class VdVesselStack {
        @XmlElement(name = "VESSELTYPECODE")
        @VueField(label = "vesselTypeCode")
        private String vesselTypeCode;
        @XmlElement(name = "ISOBAY")
        @VueField(label = "isoBay")
        private String isoBay;
        @XmlElement(name = "ISOSTACK")
        @VueField(label = "isoStack", sortable = true)
        private String isoStack;
        @XmlElement(name = "CUSTOMSTACKNAME")
        @VueField(label = "customStackName")
        private String customStackName;
        @XmlElement(name = "MAXHEIGHT")
        @VueField(label = "maxHeight")
        private String maxHeight;
        @XmlElement(name = "MAXWEIGHTS")
        @VueField(label = "maxWeightS")
        private String maxWeightS;
        @XmlElement(name = "MAXWEIGHTB")
        @VueField(label = "maxWeightB")
        private String maxWeightB;
        @XmlElement(name = "TYPEA")
        @VueField(label = "typeA")
        private String typeA;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "VD_VESSELCELLALL")
    public static class VesselCellAll{
        @XmlElement(name = "VESSELTYPECODE")
        @VueField(label = "vesselTypeCode")
        private String vesselTypeCode;
        @XmlElement(name = "ISOBAY")
        @VueField(label = "isoBay", sortable = true)
        private String isoBay;
        @XmlElement(name = "ISOSTACK")
        @VueField(label = "isoStack", sortable = true)
        private String isoStack;
        @XmlElement(name = "ISOTIER")
        @VueField(label = "isoTier")
        private String isoTier;
        @XmlElement(name = "CUSTOMCELL")
        @VueField(label = "customCell", sortable = true)
        private String customCell;
        @XmlElement(name = "SIZETYPE")
        @VueField(label = "sizeType")
        private String sizeType;
        @XmlElement(name = "ALLOWSIZES")
        @VueField(label = "allowSized")
        private String allowSizes;
        @XmlElement(name = "TYPEA")
        @VueField(label = "typeA")
        private String typeA;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "VD_VESSELHATCHCOVER")
    public static class VesselHatchCover{
        @XmlElement(name = "VESSELTYPECODE")
        @VueField(label = "vesselTypeCode")
        private String vesselTypeCode;
        @XmlElement(name = "VESSELBAYNO")
        @VueField(label = "vesselBayNo", sortable = true)
        private String vesselBayNo;
        @XmlElement(name = "HATCHCOVERNAME")
        @VueField(label = "hatchCoverName")
        private String hatchCoverName;
        @XmlElement(name = "HATCHCOVERWEIGHT")
        @VueField(label = "hatchCoverWeight")
        private String hatchCoverWeight;
        @XmlElement(name = "HSTARTLIDOVERLAP")
        @VueField(label = "hStartLidOverLap")
        private String hStartLidOverLap;
        @XmlElement(name = "HENDLIDOVERLAP")
        @VueField(label = "hEndLidOverLap")
        private String hEndLidOverLap;
        @XmlElement(name = "LASTUPDATEMAN")
        @VueField(label = "lastUpdateMan")
        private String lastUpdateMan;
        @XmlElement(name = "HSTARTPOS")
        @VueField(label = "hStartPos")
        private String hStartPos;
        @XmlElement(name = "HENDPOS")
        @VueField(label = "hEndPos")
        private String hEndPos;
        @XmlElement(name = "LASTUPDATETIME")
        @VueField(label = "lastUpdateTime", sortable = true)
        private String lastUpdateTime;
        @XmlElement(name = "HATCHCOVERNO")
        @VueField(label = "hatchCoverNo", sortable = true)
        private String hatchCoverNo;
        @XmlElement(name = "HSTARTPOSABS")
        @VueField(label = "hStartPoAbx")
        private String hStartPosAbs;
        @XmlElement(name = "HENDPOSABS")
        @VueField(label = "hEndPosAbs")
        private String hEndPosAbs;
        @XmlElement(name = "REFBAYNO")
        @VueField(label = "refBayNo", sortable = true)
        private String refBayNo;
        @XmlElement(name = "HSTARTPOSINCARBIN")
        @VueField(label = "hStartPosInCarBin")
        private String hStartPosInCarBin;
        @XmlElement(name = "HSTARTPOSINHOLD")
        @VueField(label = "hStartPosInHold")
        private String hStartPosInHold;
        @XmlElement(name = "HSTARTPOSABSINCARBIN")
        @VueField(label = "hStartPosAbsInCarBin")
        private String hStartPosAbsInCarBin;
        @XmlElement(name = "HSTARTPOSABSINHOLD")
        @VueField(label = "hStartPosAbsInHold")
        private String hStartPosAbsInHold;
    }
}
