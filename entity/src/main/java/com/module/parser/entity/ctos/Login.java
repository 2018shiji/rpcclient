package com.module.parser.entity.ctos;

import lombok.Data;

@Data
public class Login {
    private String userName;
    private String password;
    /** 无线终端编号 */
    private int terminalNo;
    private String clientIp;
    private String ticketId;
}
