package com.module.parser.entity.launch;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class VesselInit {
    @JSONField(name = "QCNO")
    private String QCNo;
    @JSONField(name = "QCDRIVER")
    private String QCDriver;
    @JSONField(name = "CONTRACTORCODE")
    private String contractorCode;
    @JSONField(name = "USERID")
    private String userId;
    @JSONField(name = "VESSELNAME")
    private String vesselName;
    @JSONField(name = "VOY")
    private String voy;
    @JSONField(name = "DEVICENO")
    private String deviceNo;
    @JSONField(name = "OPTYPE")
    private String opType;//进出口类型；I-卸船; O-装船
    @JSONField(name = "BERTHNO")
    private String berthNo;
    @JSONField(name = "TICKET_ID")
    private String ticket_ID;//通过OP007001获取到的TicketID;
}
