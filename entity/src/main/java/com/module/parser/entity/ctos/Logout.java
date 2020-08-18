package com.module.parser.entity.ctos;

import lombok.Data;

@Data
public class Logout {
    private String userId;
    private int terminalNo;
    private String ticketId;
}
