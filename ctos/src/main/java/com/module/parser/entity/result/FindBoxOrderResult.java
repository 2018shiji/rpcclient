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
        @VueField(label = "workQueueNo", sortable = true)
        private String workQueueNo;
        @XmlElement(name = "WORKITEMNO")
        @VueField(label = "workItemNo", sortable = true)
        private String workItemNo;
        @XmlElement(name = "CONTAINERID")
        @VueField(label = "containerId")
        private String containerId;
        @XmlElement(name = "CONTAINERNO")
        @VueField(label = "contianerNo", sortable = true)
        private String containerNo;
        @XmlElement(name = "CONTAINERSIZE")
        @VueField(label = "containerSize")
        private String containerSize;
        @XmlElement(name = "CONTAINERTYPE")
        @VueField(label = "containerType")
        private String containerType;
        @XmlElement(name = "EMPTYFULL")
        @VueField(label = "emptyFull")
        private String emptyFull;
        @XmlElement(name = "CARRYDEVICE")
        @VueField(label = "carryDevice")
        private String carryDevice;
        @XmlElement(name = "POSONTRUCK")
        @VueField(label = "posonTruck")
        private String posonTruck;
        @XmlElement(name = "GROSSWEIGHT")
        @VueField(label = "grossWeight")
        private String grossWeight;
        @XmlElement(name = "ISOCODE")
        @VueField(label = "isoCode")
        private String isoCode;
        @XmlElement(name = "SNAME")
        @VueField(label = "sName", sortable = true)
        private String sName;
        @XmlElement(name = "SOURCEPOS")
        @VueField(label = "sourcePos")
        private String sourcePos;
        @XmlElement(name = "TARGET")
        @VueField(label = "target")
        private String target;
        @XmlElement(name = "POD")
        @VueField(label = "pod")
        private String pod;
        @XmlElement(name = "WORKPOINTNO")
        @VueField(label = "workPointNo")
        private String workPointNo;
        @XmlElement(name = "DAMAGECODE")
        @VueField(label = "damageCode")
        private String damageCode;
        @XmlElement(name = "STATUS")
        @VueField(label = "status")
        private String status;
    }
}
