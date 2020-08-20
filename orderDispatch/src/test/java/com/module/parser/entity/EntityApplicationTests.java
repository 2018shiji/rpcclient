package com.module.parser.entity;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EntityApplicationTests {

    @Test
    void contextLoads() { }

    @Test
    void testJaxWsClient(){
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://127.0.0.1:8080/LoginResult/LoginResultPort?wsdl");
        //需要密码的情况下需要加上用户名和密码
        //client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASSWORD));
        Object[] objects = new Object[0];
        try{
            //invoke("方法名", 参数1，参数2...)
            objects = client.invoke("getUserName", "Jack");
            System.out.println("返回数据：" + objects[0]);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
