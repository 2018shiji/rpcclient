package com.module.parser.entity.ctos;

import lombok.Data;

@Data
public class VesselScheduleResult {
    
    private String vesselAlias;
    private String eVesselName;
    private String cVesselName;
    private String inBoundVoy;//进口航次
    private String outBoundVoy;//出口航次

    private String vesselType;//船舶类型，B-班轮/S-驳船
    private String berthNo;//实际靠泊2泊位号
    private String state;//状态：A-已激活 C-已取消 I-已关闭 O-已取消靠泊
}
