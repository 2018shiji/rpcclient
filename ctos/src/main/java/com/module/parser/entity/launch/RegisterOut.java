package com.module.parser.entity.launch;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.AssertTrue;

@Data
@ToString
@AllArgsConstructor
public class RegisterOut {
    @JSONField(name = "USER_ID", label = "userID")
    private String userId;
    @JSONField(name = "TICKET_ID", label = "ticketID")
    private String ticketId;
}
