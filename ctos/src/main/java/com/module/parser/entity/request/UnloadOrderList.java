package com.module.parser.entity.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UnloadOrderList {/** 卸船指令清单 */
    @JSONField(name = "VELALIASE", label = "velAliase")
    private String velAliase;
    @JSONField(name = "QCNO", label = "qcNo")
    private String qcNo;
    @JSONField(name = "TICKET_ID", label = "ticketID")
    private String ticket_id;
}
