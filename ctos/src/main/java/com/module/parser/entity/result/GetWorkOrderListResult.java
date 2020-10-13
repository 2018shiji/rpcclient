package com.module.parser.entity.result;

import com.module.parser.reflect.VueField;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class GetWorkOrderListResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "OP004039", required = true)
    private List<DataTable> dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "OP004039", propOrder = {"workItemHis"})
    public static class DataTable{
        @XmlElement(name = "WI_WORKITEMHIS", required = true)
        private WorkItemHis workItemHis;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "WI_WORKITEMHIS")
    public static class WorkItemHis{
        @XmlElement(name = "NUMB", required = true)
        @VueField(label = "指令顺序号")
        private String numb;
        @XmlElement(name = "BERTHNO")
        @VueField(label = "泊位号")
        private String berthNo;
        @XmlElement(name = "BERTHPLANNO")
        @VueField(label = "相关船期ID")
        private String berthPlanNo;
        @XmlElement(name = "WORKPOINTNO")
        @VueField(label = "工作点")
        private String workPointNo;
        @XmlElement(name = "CONTAINERNO")
        @VueField(label = "箱号")
        private String containerNo;
        @XmlElement(name = "CARRYDEVICE")
        @VueField(label = "运载设备")
        private String carryDevice;
        @XmlElement(name = "IOSCODE")
        @VueField(label = "ISO")
        private String isoCode;
        @XmlElement(name = "CONTAINERSIZE")
        @VueField(label = "箱型尺寸")
        private String containerSize;
        @XmlElement(name = "CONTAINERTYPE")
        @VueField(label = "箱型")
        private String containerType;
        @XmlElement(name = "CONTAINERHEIGHT")
        @VueField(label = "箱高")
        private String containerHeight;
        @XmlElement(name = "ISPUTONSHORE")
        @VueField(label = "是否卸岸边")
        private String isPutOnShore;
        @XmlElement(name = "QUEUETYPE")
        @VueField(label = "队列类型")
        private String queueType;
        @XmlElement(name = "OPERATIONMAN")
        @VueField(label = "操作人")
        private String operationMan;
        @XmlElement(name = "OPERATIONTIME")
        @VueField(label = "操作时间")
        private String operationTime;
        @XmlElement(name = "STATUS")
        @VueField(label = "指令状态")
        private String status;
    }
}
