package com.module.parser.entity.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VesselSchedule {
    @JSONField(name = "TICKET_ID", label = "ticketID")
    private String ticketId;
}
