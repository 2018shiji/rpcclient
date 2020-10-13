package com.module.parser.entity.result;

import com.module.parser.reflect.VueField;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class UnloadOrderResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "OP007031", required = true)
    private List<DataTable> dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "OP007031", propOrder = {"workItems", "dangerInfo"})
    public static class DataTable{
        @XmlElement(name = "WI_WORKITEMS")
        private WorkItems workItems;
        @XmlElement(name = "DANGERINFO")
        private DangerInfo dangerInfo;
    }

    /** ---------!!!!同一命名空间下存在多个同一名称的字段---------*/
    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "WI_WORKITEMS")
    public static class WorkItems{
        @XmlElement(name = "WORKITEMNO")
        @VueField(label = "指令作业编号", sortable = true)
        private String workItemNo;
        @XmlElement(name = "CONTAINERNO")
        @VueField(label = "箱号", sortable = true)
        private String containerNo;
        @XmlElement(name = "CONTAINERID")
        @VueField(label = "箱ID")
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
        @XmlElement(name = "SETUPTEMP")
        @VueField(label = "温度")
        private String setupTemp;
        @XmlElement(name = "VESSELCOMPANYSEALNO")
        @VueField(label = "船公司封", sortable = true)
        private String vesselCompanySealNo;
        @XmlElement(name = "CIQSEALNO")
        @VueField(label = "海关封条", sortable = true)
        private String ciqSealNo;
        @XmlElement(name = "VESSELCOMPANYSEALNOLIST")
        @VueField(label = "船封")
        private String vesselCompanySealNoList;
        @XmlElement(name = "CIQSEALNOLIST")
        @VueField(label = "海关封")
        private String ciqSealNoList;
        @XmlElement(name = "ISAUTOLISTSEALNO")
        @VueField(label = "是否显示封条", sortable = true)
        private String isAutoListSealNo;
        @XmlElement(name = "OVERFRONT")
        @VueField(label = "超限-前超")
        private String overFront;
        @XmlElement(name = "OVERBEHIND")
        @VueField(label = "超限-后封")
        private String overBehind;
        @XmlElement(name = "OVERLEFT")
        @VueField(label = "超限-左超")
        private String overLeft;
        @XmlElement(name = "OVERRIGHT")
        @VueField(label = "超限-右超")
        private String overRight;
        @XmlElement(name = "OVERTOP")
        @VueField(label = "超限-顶超")
        private String overTop;
        @XmlElement(name = "EMPTYFULL")
        @VueField(label = "空重")
        private String emptyFull;
        @XmlElement(name = "ISOCODE")
        @VueField(label = "ISO代码")
        private String isoCode;
        @XmlElement(name = "DAMAGECODE")
        @VueField(label = "残损代码")
        private String damageCode;
        @XmlElement(name = "GRADEID")
        @VueField(label = "空箱特征", sortable = true)
        private String gradeId;
        @XmlElement(name = "CONTAINERSIZE")
        @VueField(label = "箱尺寸")
        private String containerSize;
        @XmlElement(name = "SOURCEPOS")
        @VueField(label = "源位置")
        private String sourcePos;
        @XmlElement(name = "TARGET")
        @VueField(label = "目的位置")
        private String target0;
        @XmlElement(name = "ISREEF")
        @VueField(label = "冷藏")
        private String isReef;
        @XmlElement(name = "ISOVERTOP")
        @VueField(label = "超限")
        private String isOverTop;
        @XmlElement(name = "ISIMDG")
        @VueField(label = "危品")
        private String isImdg;
        @XmlElement(name = "CONTAINERTYPE")
        @VueField(label = "箱型")
        private String containerType;
        @XmlElement(name = "CONTAINERHEIGHT")
        @VueField(label = "高度")
        private String containerHeight;
        @XmlElement(name = "ISDISCHECKCTN")
        @VueField(label = "验箱")
        private String isDisCheckCTN;
        @XmlElement(name = "ISDISCHECKSEAL")
        @VueField(label = "验封")
        private String isDisCheckSeal;
        @XmlElement(name = "ISOVERDIS")
        @VueField(label = "溢卸")
        private String isOverDis;
        @XmlElement(name = "SPECIALREQUIREMENTS")
        @VueField(label = "卸船作业要求")
        private String specialRequirements;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "DANGERINFO")
    public static class DangerInfo{
        @XmlElement(name = "IMDGUNNO")
        @VueField(label = "联合国编码")
        private String imdgunNo;
        @XmlElement(name = "DANGERLEVEL")
        @VueField(label = "危品等级")
        private String dangerLevel;
        @XmlElement(name = "ISALARM")
        @VueField(label = "危标提示")
        private String isAlarm;
        @XmlElement(name = "IMDGLEVEL")
        @VueField(label = "危标等级")
        private String imdgLevel;
    }
}
