package com.module.parser.webservice;

import com.module.parser.entity.launch.Login;
import com.module.parser.entity.result.LoginResult;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface ICTOSService {
    @WebMethod
    String doLogin(String login);
    @WebMethod
    String doLoginResultReal(String login);
    @WebMethod
    LoginResult doLoginResult(LoginResult loginResult);

}
