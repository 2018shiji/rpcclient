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
public class ShipmentQuit {
    @JSONField(name = "USER_ID")
    private String user_id;
    @JSONField(name = "DEVICENO")
    private String deviceNo;
    @JSONField(name = "QCNO")
    private String qcNo;
    @JSONField(name = "QCDRIVER")
    private String qcDriver;
    @JSONField(name = "CONTRACTORCODE")
    private String contractorCode;
    @JSONField(name = "TICKET_ID")
    private String ticket_id;
}
