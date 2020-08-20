package com.module.parser.entity.launch;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Register {
    @JSONField(name = "USER_ID")
    private String userId;
    @JSONField(name = "PASSWORD")
    private String password;
    @JSONField(name = "CLIENTID")
    private String clientIp;

}
