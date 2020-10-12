package com.module.parser.entity.launch;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Register {
    @JSONField(name = "USER_ID", label = "userID")
    private String userId;
    @JSONField(name = "PASSWORD", label = "passWord")
    private String password;
    @JSONField(name = "CLIENTIP", label = "clientIP")
    private String clientIP;

}
