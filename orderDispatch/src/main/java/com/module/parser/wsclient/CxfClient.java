package com.module.parser.wsclient;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.module.parser.entity.launch.Login;
import com.module.parser.webservice.ICTOSService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class CxfClient {
    private static String USER_NAME = "admin";
    private static String PASS_WORD = "123456";

    public static void main(String[] args){
        client2();
    }

    public static void client1(){
        try{
            String address = "http://127.0.0.1:8080/CTOS/CTOSResult?wsdl";
            JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
            factoryBean.setAddress(address);
            factoryBean.setServiceClass(ICTOSService.class);
            /** 创建一个代理接口实现*/
            ICTOSService cs = (ICTOSService) factoryBean.create();
            String result = cs.doLogin("login");
            System.out.println(result);
        } catch (Exception e){e.printStackTrace();}
    }

    public static void client2(){
        //创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://127.0.0.1:8080/CTOS/CTOSResult?wsdl");
        //需要密码的情况下，应该添加以下代码
//        client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));

//        testDoLogin(client);
        testDoLoginResultReal(client);
    }

    private static void testDoLogin(Client client){
        try{
            Login login = new Login("111", "222", 123, "333");
            String loginJsonStr = JSON.toJSONString(login);
            Object[] objects = client.invoke("doLogin", loginJsonStr);
            System.out.println("返回数据：" + objects[0]);
            Login login1 = JSONObject.parseObject((String) objects[0], Login.class);
            System.out.println(login1);
        } catch (Exception e){e.printStackTrace();}
    }

    private static void testDoLoginResultReal(Client client){
        try{
            Login login = new Login();
            String loginJsonStr = JSON.toJSONString(login);
            Object[] objects = client.invoke("doLoginResultReal", login);
            System.out.println("返回数据：" + objects[0]);

        } catch (Exception e){e.printStackTrace();}
    }


}
