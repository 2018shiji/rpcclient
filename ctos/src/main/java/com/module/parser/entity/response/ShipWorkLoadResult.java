package com.module.parser.entity.response;

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
        @VueField(label = "工作点", sortable = true)
        private String workPointNo;
        @XmlElement(name = "VELALIASE")
        @VueField(label = "船别名")
        private String velAliase;
        @XmlElement(name = "ISCOMPLETE")
        @VueField(label = "是否完成")
        private String isComplete;
        @XmlElement(name = "QUEUETYPE")
        @VueField(label = "装卸类型")
        private String queueType;
        @XmlElement(name = "COUNTSUM")
        @VueField(label = "数量", sortable = true)
        private String countSum;
    }

}
