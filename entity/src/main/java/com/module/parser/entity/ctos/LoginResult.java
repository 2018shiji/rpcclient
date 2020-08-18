package com.module.parser.entity.ctos;

import lombok.Data;

@Data
public class LoginResult {
    private String deviceNo;
    private String deviceMType;
    private String workType;
    /** 设备是否暂停 */
    private boolean isHalt;
    /** 限载重量 */
    private String moveCapacity;
    private String ticketId;
}
