package com.module.parser.entity.launch;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class VesselStruct {
    @JSONField(name = "VELALIASE")
    private String velAlias;
    @JSONField(name = "TICKET_ID")
    private String ticketId;
}
