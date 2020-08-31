package com.module.parser.entity.launch;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Logout {
    @JSONField(name = "USER_ID")
    private String userId;
    @JSONField(name = "TERMINALNO")
    private int terminalNo;
    @JSONField(name = "TICKET_ID")
    private String ticketId;
}
