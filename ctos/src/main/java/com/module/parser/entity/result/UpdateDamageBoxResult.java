package com.module.parser.entity.result;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlRootElement(name = "CTOSRESULT")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class UpdateDamageBoxResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "OP007095", required = true)
    private List<DataTable> dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "OP007095")
    public static class DataTable{

    }
}
