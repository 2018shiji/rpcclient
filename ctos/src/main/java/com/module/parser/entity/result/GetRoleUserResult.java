package com.module.parser.entity.result;

import com.module.parser.reflect.VueField;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CTOSRESULT")
@XmlType(name = "CTOSRESULT", propOrder = {"returnInfo", "dataTable"})
public class GetRoleUserResult {
    @XmlElement(name = "RETURNINFO", required = true)
    private ReturnInfo returnInfo;
    @XmlElement(name = "SM001010", required = true)
    private List<DataTable> dataTable;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "SM001010", propOrder = {"userInfo"})
    public static class DataTable{
        @XmlElement(name = "USERINFO", required = true)
        private UserInfo userInfo;
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "USERINFO")
    public static class UserInfo{
        @XmlElement(name = "US_LOGID", required = true)
        @VueField(label = "us_logId")
        private String us_logId;
        @XmlElement(name = "US_TYPE", required = true)
        @VueField(label = "us_type")
        private String us_type;
    }
}
