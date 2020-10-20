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
public class ShipmentTaskQuit { /** 装卸船作业退出 */
    @JSONField(name = "USER_ID", label = "userID")
    private String user_id;
    @JSONField(name = "DEVICENO", label = "deviceNO")
    private String deviceNo;
    @JSONField(name = "QCNO", label = "qcNo")
    private String qcNo;
    @JSONField(name = "QCDRIVER", label = "qcDriver")
    private String qcDriver;
    @JSONField(name = "CONTRACTORCODE", label = "contractorCode")
    private String contractorCode;
    @JSONField(name = "TICKET_ID", label = "ticketID")
    private String ticket_id;
}
