package com.module.parser.entity.result;

import com.module.parser.reflect.VueField;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class QueryMainBoxResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "CM005009", required = true)
    private List<DataTable> dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "CM005009", propOrder = {"container"})
    public static class DataTable{
        @XmlElement(name = "CM_CONTAINER", required = true)
        private Container container;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "CM_CONTAINER")
    public static class Container{
        @VueField(label = "container", sortable = true)
        @XmlElement(name = "CONTAINERNO", required = true)
        private String containerNo;
        @VueField(label = "containerId", sortable = true)
        @XmlElement(name = "CONTAINERID", required = true)
        private String containerId;
    }
}
