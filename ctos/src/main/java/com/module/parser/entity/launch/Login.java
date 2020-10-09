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
public class Login {
    @JSONField(name = "USERNAME", label = "userName")
    private String userName;
    @JSONField(name = "PASSWORD", label = "password")
    private String password;
    /** 无线终端编号 */
    @JSONField(name = "TERMINALNO", label = "terminalNo")
    private int terminalNo;
    @JSONField(name = "CLIENT_ID", label = "clientIP")
    private String clientIp;

}
