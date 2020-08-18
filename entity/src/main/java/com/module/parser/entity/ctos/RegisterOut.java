package com.module.parser.entity.ctos;

import lombok.Data;

@Data
public class RegisterOut {
    /** required */
    private String userId;
    /** required */
    private String ticketId;
}
