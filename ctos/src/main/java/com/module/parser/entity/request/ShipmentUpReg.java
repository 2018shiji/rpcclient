package com.module.parser.entity.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ShipmentUpReg {
    @JSONField(name = "DEVICEOPTIMELINESID", label = "deviceOpTimeLineSId")
    private String deviceOpTimeLineSid;
    @JSONField(name = "OPTYPE", label = "opType")
    private String opType;
    @JSONField(name = "TABLEPARAMS", label = "tableParams")
    private String tableParams;
    @JSONField(name = "WORKITEMNO", label = "workItemNo")
    private String workItemNo;
    @JSONField(name = "QC_DRIVER", label = "qcDriver")
    private String qc_driver;
    @JSONField(name = "QC_DEVICENO", label = "qcDeviceNo")
    private String qc_deviceNo;
    @JSONField(name = "TARGET", label = "target")
    private String target;
    @JSONField(name = "USER_ID", label = "userID")
    private String user_id;
    @JSONField(name = "TALLYCLERK", label = "tallyClerk")
    private String tallyClerk;
    @JSONField(name = "BINDCLERK", label = "bindClerk")
    private String bindClerk;
    @JSONField(name = "TICKET_ID", label = "ticketID")
    private String ticket_id;
}
