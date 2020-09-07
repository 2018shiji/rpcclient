package com.module.parser.entity.launch;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ShipmentUp {
    @JSONField(name = "DEVICEOPTIMELINESID")
    private String deviceOpTimeLineSid;
    @JSONField(name = "OPTYPE")
    private String opType;
    @JSONField(name = "TABLEPARAMS")
    private String tableParams;
    @JSONField(name = "WORKITEMNO")
    private String workItemNo;
    @JSONField(name = "QC_DRIVER")
    private String qc_driver;
    @JSONField(name = "QC_DEVICENO")
    private String qc_deviceNo;
    @JSONField(name = "TARGET")
    private String target;
    @JSONField(name = "USER_ID")
    private String user_id;
    @JSONField(name = "TALLYCLERK")
    private String tallyClerk;
    @JSONField(name = "BINDCLERK")
    private String bindClerk;
    @JSONField(name = "TICKET_ID")
    private String ticket_id;
}
