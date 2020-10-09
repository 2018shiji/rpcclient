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
public class GetRoleUser {
    @JSONField(name = "US_NAME", label = "usName")
    private String us_name;
    @JSONField(name = "TICKET_ID", label = "ticketID")
    private String ticket_id;
}
