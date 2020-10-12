package com.module.parser.entity.result;

import com.module.parser.reflect.VueField;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class ShipWorkLoadResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "OP004040", required = true)
    private List<DataTable> dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "OP004040")
    public static class DataTable{
        @XmlElement(name = "WORKPOINTNO")
        @VueField(label = "workPointNo", sortable = true)
        private String workPointNo;
        @XmlElement(name = "VELALIASE")
        @VueField(label = "velAliase")
        private String velAliase;
        @XmlElement(name = "ISCOMPLETE")
        @VueField(label = "isComplete")
        private String isComplete;
        @XmlElement(name = "QUEUETYPE")
        @VueField(label = "queueType")
        private String queueType;
        @XmlElement(name = "COUNTSUM")
        @VueField(label = "countSum", sortable = true)
        private String countSum;
    }

}
