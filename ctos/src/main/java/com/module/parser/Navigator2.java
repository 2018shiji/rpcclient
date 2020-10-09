package com.module.parser;

import com.module.parser.entity.launch.*;
import com.module.parser.entity.result.GetBerthMsgResult;
import com.module.parser.reflect.FieldReflect2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Navigator2 {
    @Autowired FieldReflect2 reflect2;

    @ResponseBody
    @RequestMapping("getBoxPositionInputParams")
    public List<FieldReflect2.Format2> getBoxInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(Box.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getFindBoxOrderInputParams")
    public List<FieldReflect2.Format2> getFindBoxOrderInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(FindBoxOrder.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getBoxByNumInputParams")
    public List<FieldReflect2.Format2> getFindBoxInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(FindBox.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getBerthMsgInputParams")
    public List<FieldReflect2.Format2> getBerthMsgInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(GetBerthMsg.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getContractorInputParams")
    public List<FieldReflect2.Format2> getContractorInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(GetContractor.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getRoleUserInputParams")
    public List<FieldReflect2.Format2> getRoleUserInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(GetRoleUser.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getWorkOrderListInputParams")
    public List<FieldReflect2.Format2> getWorkOrderListInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(GetWorkOrderList.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getLoginInputParams")
    public List<FieldReflect2.Format2> getLoginInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(Login.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getLogoutInputParams")
    public List<FieldReflect2.Format2> getLogoutInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(Logout.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getQueryMainBoxInputParams")
    public List<FieldReflect2.Format2> getQueryMainBoxInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(QueryMainBox.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getQueryShipUpInputParams")
    public List<FieldReflect2.Format2> getQueryShipUpInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(QueryShipUp.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getRegisterOutInputParams")
    public List<FieldReflect2.Format2> getRegisterOutInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(RegisterOut.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getRegisterInputParams")
    public List<FieldReflect2.Format2> getRegisterInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(Register.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getShipmentDownRegInputParams")
    public List<FieldReflect2.Format2> getShipmentDownRegInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(ShipmentDownReg.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getShipmentTaskInitInputParams")
    public List<FieldReflect2.Format2> getShipmentTaskInitInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(ShipmentTaskInit.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getShipmentTaskQuitInputParams")
    public List<FieldReflect2.Format2> getShipmentTaskQuitInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(ShipmentTaskQuit.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getShipmentUpRegInputParams")
    public List<FieldReflect2.Format2> getShipmentUpRegInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(ShipmentUpReg.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getShipWorkLoadInputParams")
    public List<FieldReflect2.Format2> getShipWorkLoadInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(ShipWorkLoad.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getUnloadOrderListInputParams")
    public List<FieldReflect2.Format2> getUnloadOrderListInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(UnloadOrderList.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getUnloadOrderInputParams")
    public List<FieldReflect2.Format2> getUnloadOrderInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(UnloadOrder.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getUpdateDamageBoxInputParams")
    public List<FieldReflect2.Format2> getUpdateDamageBoxInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(UpdateDamageBox.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getVesselScheduleInputParams")
    public List<FieldReflect2.Format2> getVesselScheduleInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(VesselSchedule.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getVesselStructInputParams")
    public List<FieldReflect2.Format2> getVesselStructInputParams(){
        List<FieldReflect2.Format2> fieldReflect = reflect2.getFieldReflect(VesselStruct.class);
        return fieldReflect;
    }

}
