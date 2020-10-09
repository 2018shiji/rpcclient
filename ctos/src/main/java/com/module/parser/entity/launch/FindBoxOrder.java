package com.module.parser.entity.launch;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FindBoxOrder {
    @JSONField(name = "CNTRSUFFIXLIST", label = "cntrSuffixList")
    private String cntrSuffixList;
    @JSONField(name = "VELALIASE", label = "velAliase")
    private String velAliase;
    @JSONField(name = "WORKPOINTNO", label = "workPointNo")
    private String workPointNo;
    @JSONField(name = "TICKET_ID", label = "ticketID")
    private String ticket_id;
}
