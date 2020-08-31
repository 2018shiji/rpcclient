package com.module.parser.control;

import com.alibaba.fastjson.JSON;
import com.module.parser.entity.launch.*;

public class CTOSOrderSupply {
    public String getLoginOrder(){
        return JSON.toJSONString(Login.class);
    }

    public String getLogoutOrder(){
        return JSON.toJSONString(Logout.class);
    }

    public String getRegisterOrder(){
        return JSON.toJSONString(Register.class);
    }

    public String getRegisterOutOrder(){
        return JSON.toJSONString(RegisterOut.class);
    }

    public String getVesselScheduleOrder(){
        return JSON.toJSONString(VesselSchedule.class);
    }

}
