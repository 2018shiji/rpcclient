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

/**
 * 用户及用户行为
 */
@Controller
public class NavigatorUser extends Navigator {

    /** 获取承包商信息 SM003006*/
    @ResponseBody
    @RequestMapping("getContractorResultFormat")
    public List<FieldReflect.VueResponseFormat> getContractorResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(GetContractorResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getContractorResult")
    public String getContractorResult(@RequestBody GetContractor getContractor1){
        GetContractor getContractor = new GetContractor("ticket_id");
        String responseBodyStr = Asmx8HttpClient.accessGetContractor(getRequestBodyStr(getContractor1));

        GetContractorResult returnResult = (GetContractorResult) getResultObject(responseBodyStr, GetContractorResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println(jsonString);
        return jsonString;
    }


    /** 获取指定角色下的用户 SM001010*/
    @ResponseBody
    @RequestMapping("getRoleUserResultFormat")
    public List<FieldReflect.VueResponseFormat> getRoleUserResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(GetRoleUserResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getRoleUserResult")
    public String getRoleUserResult(@RequestBody GetRoleUser getRoleUser1){
        GetRoleUser getRoleUser = new GetRoleUser("userName", "ticket_id");
        String responseBodyStr = Asmx8HttpClient.accessGetRoleUser(getRequestBodyStr(getRoleUser1));

        GetRoleUserResult returnResult = (GetRoleUserResult) getResultObject(responseBodyStr, GetRoleUserResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println(jsonString);
        return jsonString;
    }


    /**无线终端登录 */
    @ResponseBody
    @RequestMapping("getLoginResultFormat")
    public List<FieldReflect.VueResponseFormat> getLoginResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(LoginResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getLoginResult")
    public String getLoginResult(@RequestBody Login login1){
        Login login = new Login("userName", "password", "123", "clientIp", "123");

        String responseBodyStr = Asmx8HttpClient.accessLogin(getRequestBodyStr(login1));

        LoginResult returnResult = (LoginResult) getResultObject(responseBodyStr, LoginResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println(jsonString);
        return jsonString;
    }


    /** 无线终端注销 */
    @ResponseBody
    @RequestMapping("getLogoutResultFormat")
    public List<FieldReflect.VueResponseFormat> getLogoutResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(LogoutResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getLogoutResult")
    public String getLogoutResult(@RequestBody Logout logout1){
        Logout logout = new Logout("userId","123", "clientIp");

        String responseBodyStr = Asmx8HttpClient.accessLogout(getRequestBodyStr(logout1));

        LogoutResult returnResult = (LogoutResult) getResultObject(responseBodyStr, LogoutResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println(jsonString);
        return jsonString;
    }


    /** 注册 */
    @ResponseBody
    @RequestMapping("getRegisterResultFormat")
    public List<FieldReflect.VueResponseFormat> getRegisterResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(RegisterResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getRegisterResult")
    public String getRegisterResult(@RequestBody Register register1){
        Register register = new Register("DYW", "123456", "1");

        String responseBodyStr = Asmx8HttpClient.accessRegister(getRequestBodyStr(register1));

        RegisterResult returnResult = (RegisterResult) getResultObject(responseBodyStr, RegisterResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println(jsonString);
        return jsonString;
    }


    /** 注销 */
    @ResponseBody
    @RequestMapping("getRegisterOutResultFormat")
    public List<FieldReflect.VueResponseFormat> getRegisterOutResultFormat(){
        List<FieldReflect.VueResponseFormat> fieldReflect = reflect.getRespFieldReflect(RegisterOutResult.class);
        return fieldReflect;
    }

    @ResponseBody
    @RequestMapping("getRegisterOutResult")
    public String getRegisterOutResult(@RequestBody RegisterOut registerOut1){
        RegisterOut registerOut = new RegisterOut("DYW", "ticketId");

        String responseBodyStr = Asmx8HttpClient.accessRegisterOut(getRequestBodyStr(registerOut1));

        RegisterOutResult returnResult = (RegisterOutResult) getResultObject(responseBodyStr, RegisterOutResult.class);

        String jsonString = JSON.toJSONString(returnResult);
        System.out.println(jsonString);
        return jsonString;
    }

}
