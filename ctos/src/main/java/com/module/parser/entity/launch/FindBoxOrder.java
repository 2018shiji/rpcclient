package com.module.parser.entity.launch;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class FindBoxOrder {
    @JSONField(name = "CNTRSUFFIXLIST")
    private String cntrSuffixList;
    @JSONField(name = "VELALIASE")
    private String velAliase;
    @JSONField(name = "WORKPOINTNO")
    private String workPointNo;
    @JSONField(name = "TICKET_ID")
    private String ticket_id;
}
