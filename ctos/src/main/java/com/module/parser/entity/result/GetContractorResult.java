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
    @XmlType(name = "SM003006", propOrder = {"contractorInfo"})
    public static class DataTable{
        @XmlElement(name = "CONTRACTORINFO", required = true)
        private ContractorInfo contractorInfo;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "CONTRACTORINFO")
    public static class ContractorInfo{
        @XmlElement(name = "CONTRACTORCNAME", required = true)
        @VueField(label = "contractorCName")
        private String contractorCName;
        @XmlElement(name = "CONTRACTORENAME")
        @VueField(label = "contractorEName")
        private String contractorEName;
        @XmlElement(name = "CONTRACTORCODE", required = true)
        @VueField(label = "contractorCode")
        private String contractorCode;
    }
}
