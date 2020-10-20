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
import java.util.Map;

@Controller
public class NavigatorVelBox extends Navigator {

    /** 船上箱位信息 OTS001008 */
    @ResponseBody
    @RequestMapping("getBoxPositionResultFormat")
    public List<FieldReflect.VueResponseFormat> getBoxResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(BoxResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getBoxPositionResult")
    public String getBoxResult(@RequestBody Box box1){
        Box box = new Box("111", "1", "ticket_id");

        String responseBodyStr = Asmx8HttpClient.accessBox(getRequestBodyStr(box1));

        BoxResult returnResult = (BoxResult) getResultObject(responseBodyStr, BoxResult.class);

        String result = JSON.toJSONString(returnResult);
        System.out.println("##############final json result##############" + result);

        return result;
    }

    /** 根据箱号查找箱 CM005001 */
    @ResponseBody
    @RequestMapping("getBoxByNumResultFormat")
    public Map<String, List<FieldReflect.VueResponseFormat>> getFindBoxResultFormat(){
        Map<String, List<FieldReflect.VueResponseFormat>> fieldReflect = reflect.getMapRespFieldReflect(FindBoxResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getBoxByNumResult")
    public String getFindBoxResult(@RequestBody FindBox findBox1){
        FindBox findBox = new FindBox("111","ticket_id");
        String responseBodyStr = Asmx8HttpClient.accessFindBox(getRequestBodyStr(findBox1));

        FindBoxResult returnResult = (FindBoxResult) getResultObject(responseBodyStr, FindBoxResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println(jsonString);
        return jsonString;
    }


    /** 获取泊位信息 SM003007*/
    @ResponseBody
    @RequestMapping("getBerthMsgResultFormat")
    public List<FieldReflect.VueResponseFormat> getBerthMsgResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(GetBerthMsgResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getBerthMsgResult")
    public String getBerthMsgResult(@RequestBody GetBerthMsg getBerthMsg1){
        GetBerthMsg getBerthMsg = new GetBerthMsg("ticket_id");

        String responseBodyStr = Asmx8HttpClient.accessGetBerthMsg(getRequestBodyStr(getBerthMsg1));

        GetBerthMsgResult returnResult = (GetBerthMsgResult) getResultObject(responseBodyStr, GetBerthMsgResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println(jsonString);
        return jsonString;
    }



    /** 根据子箱查询主箱信息 */
    @ResponseBody
    @RequestMapping("getQueryMainBoxResultFormat")
    public List<FieldReflect.VueResponseFormat> getQueryMainBoxResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(QueryMainBoxResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getQueryMainBoxResult")
    public String getQueryMainBoxResult(@RequestBody QueryMainBox queryMainBox1){
        QueryMainBox queryMainBox = new QueryMainBox("containerNo", "ticket_id");

        String responseBodyStr = Asmx8HttpClient.accessQueryMainBox(getRequestBodyStr(queryMainBox1));

        QueryMainBoxResult returnResult = (QueryMainBoxResult) getResultObject(responseBodyStr, QueryMainBoxResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println(jsonString);
        return jsonString;
    }


    /** 查询激活的船期 */
    @ResponseBody
    @RequestMapping("getVesselScheduleResultFormat")
    public List<FieldReflect.VueResponseFormat> getVesselScheduleResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(VesselScheduleResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getVesselScheduleResult")
    public String getVesselScheduleResult(@RequestBody VesselSchedule vesselSchedule1){
        VesselSchedule vesselSchedule = new VesselSchedule("ticketId");

        String responseBodyStr = Asmx8HttpClient.accessVesselSchedule(getRequestBodyStr(vesselSchedule1));

        VesselScheduleResult returnResult = (VesselScheduleResult) getResultObject(responseBodyStr, VesselScheduleResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println(jsonString);
        return jsonString;
    }


    /** 船结构 OTS001006 */
    @ResponseBody
    @RequestMapping("getVesselStructResultFormat")
    public Map<String, List<FieldReflect.VueResponseFormat>> getVesselStructResultFormat(){
        Map<String, List<FieldReflect.VueResponseFormat>> fieldReflect = reflect.getMapRespFieldReflect(VesselStructResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getVesselStructResult")
    public String getVesselStructResult(@RequestBody VesselStruct vesselStruct1){
        VesselStruct vesselStruct = new VesselStruct("velAliase","ticketId");

        String responseBodyStr = Asmx8HttpClient.accessVesselStruct(getRequestBodyStr(vesselStruct1));

        VesselStructResult returnResult = (VesselStructResult) getResultObject(responseBodyStr, VesselStructResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println("##############final json result##############" + jsonString);
        return jsonString;
    }


}
