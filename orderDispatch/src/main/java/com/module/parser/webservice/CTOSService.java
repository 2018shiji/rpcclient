package com.module.parser.webservice;

import com.alibaba.fastjson.JSONObject;
import com.module.parser.Transfer;
import com.module.parser.entity.launch.Login;
import com.module.parser.entity.result.LoginResult;
import com.module.parser.entity.result.ReturnInfo;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "com.module.parser.webservice.ICTOSService")
public class CTOSService implements ICTOSService {
    @Override
    public String doLogin(String loginJsonStr) {
        System.out.println("before: " + loginJsonStr);
        Login login = JSONObject.parseObject(loginJsonStr, Login.class);
        System.out.println("after: " + login);
        return loginJsonStr;
    }

    @Override
    public String doLoginResultReal(String login) {

        return Transfer.beanToXml(getLoginResult(), LoginResult.class);
    }

    @Override
    public LoginResult doLoginResult(LoginResult loginResult) {

        return getLoginResult();
    }


    private LoginResult getLoginResult(){
        LoginResult loginResult = new LoginResult();
        loginResult.setTicketId("111");

        ReturnInfo returnInfo = new ReturnInfo();
        returnInfo.setErrorCode("100");
        returnInfo.setErrorMsg("unknown error");
        loginResult.setReturnInfo(returnInfo);

        List<LoginResult.DataTable> tables = new ArrayList<>();
        LoginResult.DataTable dataTable = new LoginResult.DataTable();
        dataTable.setName("aaa");
        dataTable.setRecord(new LoginResult.Record("sanyi", "qizhongji", "qizhong", true, "10t"));
        tables.add(dataTable);
        LoginResult.DataTable dataTable1 = new LoginResult.DataTable();
        dataTable1.setName("bbb");
        dataTable1.setRecord(new LoginResult.Record("biyadi", "qizhongji", "qizhong", true, "100t"));
        tables.add(dataTable1);
        loginResult.setDataTables(tables);
        return loginResult;
    }

}
