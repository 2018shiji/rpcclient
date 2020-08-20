package com.module.parser.entity.launch;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Login {
    @JSONField(name = "USERNAME")
    private String userName;
    @JSONField(name = "PASSWORD")
    private String password;
    /** 无线终端编号 */
    @JSONField(name = "TERMINALNO")
    private int terminalNo;
    @JSONField(name = "CLIENT_ID")
    private String clientIp;

}
