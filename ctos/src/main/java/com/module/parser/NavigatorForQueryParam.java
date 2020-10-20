package com.module.parser;

import com.module.parser.entity.request.*;
import com.module.parser.reflect.FieldReflectForQueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class NavigatorForQueryParam {
    @Autowired
    FieldReflectForQueryParam reflect2;

    @ResponseBody
    @RequestMapping("getBoxPositionInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getBoxInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(Box.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getFindBoxOrderInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getFindBoxOrderInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(FindBoxOrder.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getBoxByNumInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getFindBoxInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(FindBox.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getBerthMsgInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getBerthMsgInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(GetBerthMsg.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getContractorInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getContractorInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(GetContractor.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getRoleUserInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getRoleUserInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(GetRoleUser.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getWorkOrderListInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getWorkOrderListInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(GetWorkOrderList.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getLoginInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getLoginInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(Login.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getLogoutInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getLogoutInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(Logout.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getQueryMainBoxInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getQueryMainBoxInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(QueryMainBox.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getQueryShipUpInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getQueryShipUpInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(QueryShipUp.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getRegisterOutInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getRegisterOutInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(RegisterOut.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getRegisterInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getRegisterInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(Register.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getShipmentDownRegInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getShipmentDownRegInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(ShipmentDownReg.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getShipmentTaskInitInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getShipmentTaskInitInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(ShipmentTaskInit.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getShipmentTaskQuitInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getShipmentTaskQuitInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(ShipmentTaskQuit.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getShipmentUpRegInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getShipmentUpRegInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(ShipmentUpReg.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getShipWorkLoadInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getShipWorkLoadInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(ShipWorkLoad.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getUnloadOrderListInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getUnloadOrderListInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(UnloadOrderList.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getUnloadOrderInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getUnloadOrderInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(UnloadOrder.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getUpdateDamageBoxInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getUpdateDamageBoxInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(UpdateDamageBox.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getVesselScheduleInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getVesselScheduleInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(VesselSchedule.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getVesselStructInputParams")
    public List<FieldReflectForQueryParam.VueQueryParamFormat> getVesselStructInputParams(){
        List<FieldReflectForQueryParam.VueQueryParamFormat> fieldReflect = reflect2.getQueryParamFieldReflect(VesselStruct.class);
        return fieldReflect;
    }

}
