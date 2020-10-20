package com.module.parser.entity.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ShipmentTaskInit {
    @JSONField(name = "QCNO", label = "qcNo")
    private String QCNo;
    @JSONField(name = "QCDRIVER", label = "qcDriver")
    private String QCDriver;
    @JSONField(name = "CONTRACTORCODE", label = "contractorCode")
    private String contractorCode;
    @JSONField(name = "USERID", label = "userID")
    private String userId;
    @JSONField(name = "VESSELNAME", label = "vesselName")
    private String vesselName;
    @JSONField(name = "VOY", label = "voy")
    private String voy;
    @JSONField(name = "DEVICENO", label = "deviceNo")
    private String deviceNo;
    @JSONField(name = "OPTYPE", label = "opType")
    private String opType;//进出口类型；I-卸船; O-装船
    @JSONField(name = "BERTHNO", label = "berthNo")
    private String berthNo;
    @JSONField(name = "TICKET_ID", label = "ticketID")
    private String ticket_ID;//通过OP007001获取到的TicketID;
}
