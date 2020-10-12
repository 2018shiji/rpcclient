package com.module.parser.entity.launch;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Logout {
    @JSONField(name = "USER_ID", label = "userID")
    private String userId;
    @JSONField(name = "TERMINALNO", label = "terminalNo")
    private String terminalNo;
    @JSONField(name = "TICKET_ID", label = "ticketID")
    private String ticketId;
}
