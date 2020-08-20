package com.module.parser.entity.launch;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.AssertTrue;

@Data
@AllArgsConstructor
public class RegisterOut {
    @JSONField(name = "USER_ID")
    private String userId;
    @JSONField(name = "TICKET_ID")
    private String ticketId;
}
