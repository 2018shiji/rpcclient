package com.module.parser.entity.launch;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class FindBox {
    @JSONField(name = "CONTAINERNO")
    private String containerNo;
    @JSONField(name = "TICKET_ID")
    private String ticket_id;
}
