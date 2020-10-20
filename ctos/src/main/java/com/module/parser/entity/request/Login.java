package com.module.parser.entity.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Login {
    @JSONField(name = "USERNAME", label = "userName")
    private String userName;
    @JSONField(name = "PASSWORD", label = "password")
    private String password;
    /** 无线终端编号 */
    @JSONField(name = "TERMINALNO", label = "terminalNo")
    private String terminalNo;
    @JSONField(name = "CLIENTIP", label = "clientIP")
    private String clientIp;
    @JSONField(name = "TICKET_ID", label = "ticket_id")
    private String ticket_id;

}
