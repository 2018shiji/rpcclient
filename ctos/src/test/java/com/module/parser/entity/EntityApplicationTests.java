package com.module.parser.entity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.module.parser.entity.launch.Register;
import com.module.parser.entity.launch.RegisterOut;
import com.module.parser.entity.result.RegisterResult;
import com.module.parser.entity.result.ReturnInfo;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

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

    @Test
    void testCTOS(){
        Register register = new Register("DYW", "123456", "1");

        System.out.println(JSON.toJSONString(register));
        System.out.println("kIX5VnobHrR9KTFSI8orJn5rKiRsd5lPmqbxDxUxV8Oy4LQF9GIMoCciV1PAwwthKA06337mvc6NsY1uE518i5NxtoKonB5IIsiSiZXHgU/ywZD6CYXbaFOLqRE9sDiOKr5jv3m2Da44kdP/anvc1RGVHkga4tFAD+FAhd0LPsXi2Q5N5meZKIEcaJRNzluSHMayBYHmp0VBDZ5EvVqI2PG4xbttNhElnlQLrOb0Ws=");
        RegisterOut out = new RegisterOut("DYW", "kIX5VnobHrR9KTFSI8orJn5rKiRsd5lPmqbxDxUxV8Oy4LQF9GIMoCciV1PAwwthKA06337mvc6NsY1uE518i5NxtoKonB5IIsiSiZXHgU/ywZD6CYXbaFOLqRE9sDiOKr5jv3m2Da44kdP/anvc1RGVHkga4tFAD+FAhd0LPsXi2Q5N5meZKIEcaJRNzluSHMayBYHmp0VBDZ5EvVqI2PG4xbttNhElnlQLrOb0Ws=");
        System.out.println(JSON.toJSONString(out));
    }

    @Test
    void testPrintString(){
        System.out.println("1234");
    }

    @Test
    void testMarshaller(){
        StringWriter writer = new StringWriter();
        try{
            JAXBContext context = JAXBContext.newInstance(RegisterResult.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "GBK");
            marshaller.marshal(getRegisterResult(), writer);
            System.out.println(writer.toString());
        }catch(JAXBException e){e.printStackTrace();}
    }

    @Test
    void testUnmarshaller(){
        try {
            StringReader reader = new StringReader("<CTOSRESULT>\n" +
                    "    <RETURNINFO>\n" +
                    "        <ERROR_CODE>100</ERROR_CODE>\n" +
                    "        <ERROR_MSG>unknown error</ERROR_MSG>\n" +
                    "    </RETURNINFO>\n" +
                    "    <SM001001>\n" +
                    "        <TICKET_ID>34567890ertyuiuiop</TICKET_ID>\n" +
                    "    </SM001001>\n" +
                    "</CTOSRESULT>");
            JAXBContext context = JAXBContext.newInstance(RegisterResult.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            RegisterResult unmarshal = (RegisterResult)unmarshaller.unmarshal(reader);
        } catch (Exception e){e.printStackTrace();}
    }

    @Test
    void testFastJSONFormat(){
        RegisterOut dym = new RegisterOut("DYM", "123+=&^#");
        String result = JSON.toJSONString(dym, SerializerFeature.PrettyFormat, SerializerFeature.UseSingleQuotes);
        System.out.println(result);
        String finalResult = result.replaceAll("\'(\\w+)\'(\\s*:\\s*)", "$1$2");
        System.out.println(finalResult.substring(1, finalResult.lastIndexOf("}")));

        String json1 = "{\'name\':\'value\', \'user\':\'userValue#$2i%^#\'}";
        String t = json1.replaceAll("\'(\\w+)\'(\\s*:\\s*)", "$1$2");
        System.out.println(t);
    }

    private RegisterResult getRegisterResult(){
        RegisterResult result = new RegisterResult();

        ReturnInfo returnInfo = new ReturnInfo();
        returnInfo.setErrorCode("100");
        returnInfo.setErrorMsg("unknown error");
        result.setReturnInfo(returnInfo);

        RegisterResult.DataTable dataTable = new RegisterResult.DataTable();
        dataTable.setTicketId("34567890ertyuiuiop");
        result.setDataTable(dataTable);

        return result;
    }

}
