package com.module.parser.entity.response;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlRootElement(name = "CTOSRESULT")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class LogoutResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "OP007002", required = true)
    private List<DataTable> dataTable;

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "OP007002")
    public static class DataTable{

    }
}
