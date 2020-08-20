package com.module.parser.entity.launch;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VesselSchedule {
    @JSONField(name = "TICKET_ID")
    private String ticketId;
}
