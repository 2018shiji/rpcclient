package com.module.parser.entity.result;

import com.module.parser.reflect.VueField;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class FindBoxOrderResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "OP007032", required = true)
    private List<DataTable> dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "OP007032", propOrder = {"workItems"})
    public static class DataTable{
        @XmlElement(name = "WI_WORKITEMS", required = true)
        private WorkItems workItems;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "WI_WORKITEMS")
    public static class WorkItems{
        @XmlElement(name = "WORKQUEUENO")
        @VueField(label = "队列号", sortable = true)
        private String workQueueNo;
        @XmlElement(name = "WORKITEMNO")
        @VueField(label = "指令编号", sortable = true)
        private String workItemNo;
        @XmlElement(name = "CONTAINERID")
        @VueField(label = "箱ID")
        private String containerId;
        @XmlElement(name = "CONTAINERNO")
        @VueField(label = "箱号", sortable = true)
        private String containerNo;
        @XmlElement(name = "CONTAINERSIZE")
        @VueField(label = "箱尺寸")
        private String containerSize;
        @XmlElement(name = "CONTAINERTYPE")
        @VueField(label = "箱型")
        private String containerType;
        @XmlElement(name = "EMPTYFULL")
        @VueField(label = "箱空重")
        private String emptyFull;
        @XmlElement(name = "CARRYDEVICE")
        @VueField(label = "运载设备")
        private String carryDevice;
        @XmlElement(name = "POSONTRUCK")
        @VueField(label = "车上位置")
        private String posonTruck;
        @XmlElement(name = "GROSSWEIGHT")
        @VueField(label = "总重")
        private String grossWeight;
        @XmlElement(name = "ISOCODE")
        @VueField(label = "ISO代码")
        private String isoCode;
        @XmlElement(name = "SNAME")
        @VueField(label = "箱短名", sortable = true)
        private String sName;
        @XmlElement(name = "SOURCEPOS")
        @VueField(label = "源位置")
        private String sourcePos;
        @XmlElement(name = "TARGET")
        @VueField(label = "目的位置")
        private String target;
        @XmlElement(name = "POD")
        @VueField(label = "卸货港")
        private String pod;
        @XmlElement(name = "WORKPOINTNO")
        @VueField(label = "工作点")
        private String workPointNo;
        @XmlElement(name = "DAMAGECODE")
        @VueField(label = "残损代码")
        private String damageCode;
        @XmlElement(name = "STATUS")
        @VueField(label = "指令状态")
        private String status;
    }
}
