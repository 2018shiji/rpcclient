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
public class UpdateDamageBox {
    @JSONField(name = "CONTAINERID", label = "containerID")
    private String containerId;
    @JSONField(name = "TABLEPARAMS", label = "tableParams")
    private String tableParams;
    @JSONField(name = "TICKET_ID", label = "ticketID")
    private String ticket_id;
    @JSONField(name = "DAMAGECODE", label = "damageCode")
    private String damageCode;
    @JSONField(name = "DAMAGEEMEMO", label = "damageEmemo")
    private String damageEmemo;
}
