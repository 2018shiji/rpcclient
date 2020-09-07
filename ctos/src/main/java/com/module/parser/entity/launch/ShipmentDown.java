package com.module.parser.entity.launch;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ShipmentDown {
    @JSONField(name = "VELALIASE")
    private String velAliase;
    @JSONField(name = "DEVICEOPTIMELINESID")
    private String deviceOpTimeLineSid;
    @JSONField(name = "TABLEPARAMS")
    private String tableParams;
    @JSONField(name = "TICKET_ID")
    private String ticket_id;
    @JSONField(name = "WORKITEMNO")
    private String workItemNo;
    @JSONField(name = "TYPE")
    private String type;
    @JSONField(name = "STATUS")
    private String status;
    @JSONField(name = "USER_ID")
    private String user_id;
    @JSONField(name = "QCDRIVER")
    private String qcDriver;
    @JSONField(name = "QCNO")
    private String qcNo;
    @JSONField(name = "CONTAINERNO")
    private String containerNo;
    @JSONField(name = "CONTAINERID")
    private String containerId;
    @JSONField(name = "MAINCONTAINERNO")
    private String mainContainerNo;
    @JSONField(name = "BINDSEQUENCE")
    private String BindSequence;
    @JSONField(name = "ISSHORE")
    private String isShore;
    @JSONField(name = "ISOVERDIS")
    private String isOverDis;
    @JSONField(name = "ISFORCE")
    private String isForce;
    @JSONField(name = "CONTRACTORCODE")
    private String contractorCode;
    @JSONField(name = "BERTHNO")
    private String berthNo;
    @JSONField(name = "EMPTYFULL")
    private String emptyFull;
    @JSONField(name = "ISOCODE")
    private String isoCode;
    @JSONField(name  = "TRUCKNO")
    private String truckNo;
    @JSONField(name = "POSONTRUCK")
    private String posonTruck;
    @JSONField(name = "TARGET")
    private String target;
    @JSONField(name = "ISDEALFAILTODECK")
    private String isDealFailToDeck;
    @JSONField(name = "SEALL")
    private String sealL;
    @JSONField(name = "SEALC")
    private String sealC;
    @JSONField(name = "DAM")
    private String dam;
    @JSONField(name = "QS")
    private String qs;
    @JSONField(name = "IMDG1")
    private String imdg1;
    @JSONField(name = "IMDGSUM1")
    private String imdgSum1;
    @JSONField(name = "IMDG2")
    private String imdg2;
    @JSONField(name = "IMDGSUM2")
    private String imdgSum2;
    @JSONField(name = "IMDG3")
    private String imdg3;
    @JSONField(name = "IMDGSUM3")
    private String imdgSum3;
    @JSONField(name = "ISBAND")
    private String isBand;
    @JSONField(name = "SETTEMP")
    private String setTemp;
    @JSONField(name = "OH")
    private String oh;
    @JSONField(name = "OA")
    private String oa;
    @JSONField(name = "OF")
    private String of;
    @JSONField(name = "OL")
    private String ol;
    @JSONField(name = "OR")
    private String or;
    @JSONField(name = "DOOR")
    private String door;
}
