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
public class DeShipment {
    @JSONField(name = "CNTRSUFFIX")
    private String cntrSuffix;
    @JSONField(name = "VELALIASE")
    private String velAliase;
    @JSONField(name = "TICKET_ID")
    private String ticket_id;
}
