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
public class VesselStruct {
    @JSONField(name = "VELALIASE", label = "velAliase")
    private String velAlias;
    @JSONField(name = "TICKET_ID", label = "ticketID")
    private String ticketId;
}
