package com.module.parser.entity.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UnloadOrder {
    @JSONField(name = "CNTRSUFFIX", label = "cntrSuffix")
    private String cntrSuffix;
    @JSONField(name = "VELALIASE", label = "velAliase")
    private String velAliase;
    @JSONField(name = "TICKET_ID", label = "ticketID")
    private String ticket_id;
}
