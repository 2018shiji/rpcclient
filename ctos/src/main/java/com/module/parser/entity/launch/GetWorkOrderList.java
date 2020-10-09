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
public class GetWorkOrderList {
    @JSONField(name = "QCNO", label = "qcNo")
    private String qcNo;
    @JSONField(name = "QUERYVALUE", label = "queryValue")
    private String queryValue;
    @JSONField(name = "TICKET_ID", label = "ticketID")
    private String ticket_id;
}
