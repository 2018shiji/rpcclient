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
public class NavigatorOrder extends Navigator {

    /** 按箱号检索装船箱指令信息 OP007032 */
    @ResponseBody
    @RequestMapping("getFindBoxOrderResultFormat")
    public List<FieldReflect.VueResponseFormat> getFindBoxOrderResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(FindBoxOrderResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getFindBoxOrderResult")
    public String getFindBoxOrderResult(@RequestBody FindBoxOrder findBoxOrder1){
        FindBoxOrder findBoxOrder = new FindBoxOrder("111", "1", "1", "ticket_id");

        String responseBodyStr = Asmx8HttpClient.accessFindBoxOrder(getRequestBodyStr(findBoxOrder1));

        FindBoxOrderResult returnResult = (FindBoxOrderResult) getResultObject(responseBodyStr, FindBoxOrderResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println(jsonString);
        return jsonString;
    }


    /** 获取指定岸桥下的作业指令 OP004039*/
    @ResponseBody
    @RequestMapping("getWorkOrderListResultFormat")
    public List<FieldReflect.VueResponseFormat> getWorkOrderListResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(GetWorkOrderListResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getWorkOrderListResult")
    public String getWorkOrderListResult(@RequestBody GetWorkOrderList getWorkOrderList1){
        GetWorkOrderList getRoleUser = new GetWorkOrderList("number", "queryvalue", "ticket_id");

        String responseBodyStr = Asmx8HttpClient.accessGetWorkOrderList(getRequestBodyStr(getWorkOrderList1));

        GetWorkOrderListResult returnResult = (GetWorkOrderListResult) getResultObject(responseBodyStr, GetWorkOrderListResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println(jsonString);
        return jsonString;
    }



    /** 指定船期岸桥下的作业量统计 OP004040 */
    @ResponseBody
    @RequestMapping("getShipWorkLoadResultFormat")
    public List<FieldReflect.VueResponseFormat> getShipWorkLoadResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(ShipWorkLoadResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getShipWorkLoadResult")
    public String getShipWorkLoadResult(@RequestBody ShipWorkLoad shipWorkLoad1){
        ShipWorkLoad shipmentUpReg = new ShipWorkLoad("velAliase", "ticket_id");

        String responseBodyStr = Asmx8HttpClient.accessShipWorkLoad(getRequestBodyStr(shipWorkLoad1));

        ShipWorkLoadResult returnResult = (ShipWorkLoadResult) getResultObject(responseBodyStr, ShipWorkLoadResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println(jsonString);
        return JSON.toJSONString(returnResult);
    }


    /** 卸船指令清单*/
    @ResponseBody
    @RequestMapping("getUnloadOrderListResultFormat")
    public List<FieldReflect.VueResponseFormat> getUnloadOrderListResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(UnloadOrderListResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getUnloadOrderListResult")
    public String getUnloadOrderListResult(@RequestBody UnloadOrderList unloadOrderList1){
        UnloadOrderList unloadOrderList = new UnloadOrderList("velAliase", "number", "ticket_id");

        String responseBodyStr = Asmx8HttpClient.accessUnloadOrderList(getRequestBodyStr(unloadOrderList1));

        UnloadOrderListResult returnResult = (UnloadOrderListResult) getResultObject(responseBodyStr, UnloadOrderListResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println(jsonString);
        return jsonString;
    }


    /** 根据箱号索卸船箱指令信息 */
    @ResponseBody
    @RequestMapping("getUnloadOrderResultFormat")
    public List<FieldReflect.VueResponseFormat> getUnloadOrderResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(UnloadOrderResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getUnloadOrderResult")
    public String getUnloadOrderResult(@RequestBody UnloadOrder unloadOrder1){
        UnloadOrder unloadOrder = new UnloadOrder("velAliase", "number", "ticket_id");

        String responseBodyStr = Asmx8HttpClient.accessUnloadOrder(getRequestBodyStr(unloadOrder1));

        UnloadOrderResult returnResult = (UnloadOrderResult) getResultObject(responseBodyStr, UnloadOrderResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println("##############final json result##############" + jsonString);
        return jsonString;

    }

}
