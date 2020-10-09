package com.module.parser.entity.result;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlRootElement(name = "CTOSRESULT")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class RegisterOutResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "SM001002", required = true)
    private List<DataTable> dataTable;

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "SM001002")
    public static class DataTable {

    }

}
