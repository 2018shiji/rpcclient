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
public class ShipmentDownReg {/** 确认卸船 */
    @JSONField(name = "VELALIASE", label = "velAliase")
    private String velAliase;
    @JSONField(name = "DEVICEOPTIMELINESID", label = "deviceOpTimeLineSid")
    private String deviceOpTimeLineSid;
    @JSONField(name = "TABLEPARAMS", label = "tableParams")
    private String tableParams;
    @JSONField(name = "TICKET_ID", label = "ticketID")
    private String ticket_id;
    @JSONField(name = "WORKITEMNO", label = "workItemNo")
    private String workItemNo;
    @JSONField(name = "TYPE", label = "type")
    private String type;
    @JSONField(name = "STATUS", label = "status")
    private String status;
    @JSONField(name = "USER_ID", label = "userID")
    private String user_id;
    @JSONField(name = "QCDRIVER", label = "qcDriver")
    private String qcDriver;
    @JSONField(name = "QCNO", label = "qcNo")
    private String qcNo;
    @JSONField(name = "CONTAINERNO", label = "containerNo")
    private String containerNo;
    @JSONField(name = "CONTAINERID", label = "containerID")
    private String containerId;
    @JSONField(name = "MAINCONTAINERNO", label = "mainContainerNo")
    private String mainContainerNo;
    @JSONField(name = "BINDSEQUENCE", label = "bindSequence")
    private String BindSequence;
    @JSONField(name = "ISSHORE", label = "isShore")
    private String isShore;
    @JSONField(name = "ISOVERDIS", label = "isOverDis")
    private String isOverDis;
    @JSONField(name = "ISFORCE", label = "isForce")
    private String isForce;
    @JSONField(name = "CONTRACTORCODE", label = "contractorCode")
    private String contractorCode;
    @JSONField(name = "BERTHNO", label = "berthNo")
    private String berthNo;
    @JSONField(name = "EMPTYFULL", label = "emptyFull")
    private String emptyFull;
    @JSONField(name = "ISOCODE", label = "isoCode")
    private String isoCode;
    @JSONField(name  = "TRUCKNO", label = "truckNo")
    private String truckNo;
    @JSONField(name = "POSONTRUCK", label = "psoOnTruck")
    private String posonTruck;
    @JSONField(name = "TARGET", label = "target")
    private String target;
    @JSONField(name = "ISDEALFAILTODECK", label = "isDealFailToDeck")
    private String isDealFailToDeck;
    @JSONField(name = "SEALL", label = "sealL")
    private String sealL;
    @JSONField(name = "SEALC", label = "sealC")
    private String sealC;
    @JSONField(name = "DAM", label = "dam")
    private String dam;
    @JSONField(name = "QS", label = "qs")
    private String qs;
    @JSONField(name = "IMDG1", label = "imdg1")
    private String imdg1;
    @JSONField(name = "IMDGSUM1", label = "imdgSum1")
    private String imdgSum1;
    @JSONField(name = "IMDG2", label = "idmg2")
    private String imdg2;
    @JSONField(name = "IMDGSUM2", label = "imdgSum2")
    private String imdgSum2;
    @JSONField(name = "IMDG3", label = "imdg3")
    private String imdg3;
    @JSONField(name = "IMDGSUM3", label = "imdgSUm3")
    private String imdgSum3;
    @JSONField(name = "ISBAND", label = "isBand")
    private String isBand;
    @JSONField(name = "SETTEMP", label = "setTemp")
    private String setTemp;
    @JSONField(name = "OH", label = "oh")
    private String oh;
    @JSONField(name = "OA", label = "oa")
    private String oa;
    @JSONField(name = "OF", label = "of")
    private String of;
    @JSONField(name = "OL", label = "ol")
    private String ol;
    @JSONField(name = "OR", label = "or")
    private String or;
    @JSONField(name = "DOOR", label = "door")
    private String door;
}
