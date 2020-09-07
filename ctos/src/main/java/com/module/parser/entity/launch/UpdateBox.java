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
public class UpdateBox {
    @JSONField(name = "CONTAINERID")
    private String containerId;
    @JSONField(name = "TABLEPARAMS")
    private String tableParams;
    @JSONField(name = "TICKET_ID")
    private String ticket_id;
    @JSONField(name = "DAMAGECODE")
    private String damageCode;
    @JSONField(name = "DAMAGEEMEMO")
    private String damageEmemo;
}
