package com.module.parser.entity.result;

import com.module.parser.reflect.VueField;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class GetContractorResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "SM003006", required = true)
    private List<DataTable> dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "SM003006")
    public static class DataTable{
        @XmlElement(name = "CONTRACTORCNAME", required = true)
        @VueField(label = "承包商中文名")
        private String contractorCName;
        @XmlElement(name = "CONTRACTORENAME")
        @VueField(label = "承包商英文名")
        private String contractorEName;
        @XmlElement(name = "CONTRACTORCODE", required = true)
        @VueField(label = "承包商代码")
        private String contractorCode;
        @XmlElement(name = "TICKET_ID")
        private String ticket_Id;
    }

}
