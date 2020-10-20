package com.module.parser.navigatorImpl;

import com.alibaba.fastjson.JSON;
import com.module.parser.asmxclient.Asmx8HttpClient;
import com.module.parser.entity.request.*;
import com.module.parser.entity.response.*;
import com.module.parser.Navigator;
import com.module.parser.reflect.FieldReflect;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class NavigatorWorkProc extends Navigator {

    @ResponseBody
    @RequestMapping("getQueryShipUpResultFormat")
    public List<FieldReflect.VueResponseFormat> getQueryShipUpResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(QueryShipUpResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getQueryShipUpResult")
    public String getQueryShipUpResult(@RequestBody QueryShipUp queryShipUp1){
        QueryShipUp queryShipUp = new QueryShipUp("1", "1", "ticketId");

        String responseBodyStr = Asmx8HttpClient.accessQueryShipUp(getRequestBodyStr(queryShipUp1));

        QueryShipUpResult returnResult = (QueryShipUpResult) getResultObject(responseBodyStr, QueryShipUpResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println(jsonString);
        return jsonString;
    }



    /** 确认卸船 */
    @ResponseBody
    @RequestMapping("getShipmentDownRegResultFormat")
    public List<FieldReflect.VueResponseFormat> getShipmentDownRegResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(ShipmentDownRegResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getShipmentDownRegResult")
    public String getShipmentDownRegResult(@RequestBody ShipmentDownReg shipmentDownReg1){
        ShipmentDownReg shipmentDownReg = new ShipmentDownReg();

        String responseBodyStr = Asmx8HttpClient.accessShipmentDownReg(getRequestBodyStr(shipmentDownReg1));

        ShipmentDownRegResult returnResult = (ShipmentDownRegResult) getResultObject(responseBodyStr, ShipmentDownRegResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println(jsonString);
        return jsonString;
    }


    /**装卸船作业初始化 OP007030*/
    @ResponseBody
    @RequestMapping("getShipmentTaskInitResultFormat")
    public List<FieldReflect.VueResponseFormat> getShipmentTaskInitResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(ShipmentTaskInitResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getShipmentTaskInitResult")
    public String getShipmentTaskInitResult(@RequestBody ShipmentTaskInit shipmentTaskInit1){
        ShipmentTaskInit shipmentTaskInit = new ShipmentTaskInit();

        String responseBodyStr = Asmx8HttpClient.accessShipmentTaskInit(getRequestBodyStr(shipmentTaskInit1));

        ShipmentTaskInitResult returnResult = (ShipmentTaskInitResult) getResultObject(responseBodyStr, ShipmentTaskInitResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println(jsonString);
        return jsonString;
    }


    /**装卸船作业退出 */
    @ResponseBody
    @RequestMapping("getShipmentTaskQuitResultFormat")
    public List<FieldReflect.VueResponseFormat> getShipmentTaskQuitResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(ShipmentTaskQuitResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getShipmentTaskQuitResult")
    public String getShipmentTaskQuitResult(@RequestBody ShipmentTaskQuit shipmentTaskQuit1){
        ShipmentTaskQuit shipmentTaskQuit = new ShipmentTaskQuit();

        String responseBodyStr = Asmx8HttpClient.accessShipmentTaskQuit(getRequestBodyStr(shipmentTaskQuit1));

        ShipmentTaskQuitResult returnResult = (ShipmentTaskQuitResult) getResultObject(responseBodyStr, ShipmentTaskQuitResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println(jsonString);
        return jsonString;
    }


    @ResponseBody
    @RequestMapping("getShipmentUpRegResultFormat")
    public List<FieldReflect.VueResponseFormat> getShipmentUpRegResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(ShipmentUpRegResult.class);
        return fieldReflect;
    }

    /** 确认装船 */
    @ResponseBody
    @RequestMapping("getShipmentUpRegResult")
    public String getShipmentUpRegResult(@RequestBody ShipmentUpReg shipmentUpReg1){
        ShipmentUpReg shipmentUpReg = new ShipmentUpReg("1", "1", "1", "1", "1", "1", "1", "DYW", "1", "1", "1");

        String responseBodyStr = Asmx8HttpClient.accessShipmentUpReg(getRequestBodyStr(shipmentUpReg1));

        ShipmentUpRegResult returnResult = (ShipmentUpRegResult) getResultObject(responseBodyStr, ShipmentUpRegResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println(jsonString);
        return jsonString;
    }


    /** 更新船上箱残损信息 */
    @ResponseBody
    @RequestMapping("getUpdateDamageBoxResultFormat")
    public List<FieldReflect.VueResponseFormat> getUpdateDamageBoxResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(UpdateDamageBoxResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getUpdateDamageBoxResult")
    public String getUpdateDamageBoxResult(@RequestBody UpdateDamageBox updateDamageBox1){
        UpdateDamageBox updateDamageBox = new UpdateDamageBox("containerId", "tableParams", "ticket_id", "damageCode", "damageEmemo");

        String responseBodyStr = Asmx8HttpClient.accessUpdateDamageBox(getRequestBodyStr(updateDamageBox1));

        UpdateDamageBoxResult returnResult = (UpdateDamageBoxResult) getResultObject(responseBodyStr, UpdateDamageBoxResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println("##############final json result##############" + jsonString);
        return jsonString;

    }


}
