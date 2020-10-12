package com.module.parser.entity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.common.io.Files;
import com.module.parser.entity.launch.*;
import com.module.parser.entity.order.CTOSRESULT;
import com.module.parser.entity.order.Response;
import com.module.parser.entity.result.*;
import com.module.parser.reflect.FieldReflect;
import lombok.ToString;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    void testUnmarshaller0(){
        try {
            StringReader reader = new StringReader(CTOSRESULT.SM001002);
            JAXBContext context = JAXBContext.newInstance(RegisterOutResult.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            RegisterOutResult unmarshal = (RegisterOutResult)unmarshaller.unmarshal(reader);
            System.out.println(JSON.toJSONString(unmarshal));
        } catch (Exception e){e.printStackTrace();}
    }

    @Test
    void testUnmarshaller(){
        try {
            StringReader reader = new StringReader(CTOSRESULT.VM002001);
            JAXBContext context = JAXBContext.newInstance(VesselScheduleResult.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            VesselScheduleResult unmarshal = (VesselScheduleResult)unmarshaller.unmarshal(reader);
            System.out.println(JSON.toJSONString(unmarshal));
        } catch (Exception e){e.printStackTrace();}
    }

    @Test
    void testUnmarshaller1(){
        try {
            StringReader reader = new StringReader(CTOSRESULT.OP007036);
            JAXBContext context = JAXBContext.newInstance(ShipmentUpRegResult.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            ShipmentUpRegResult unmarshal = (ShipmentUpRegResult)unmarshaller.unmarshal(reader);

            System.out.println(JSON.toJSONString(unmarshal));
        } catch (Exception e){e.printStackTrace();}
    }

    @Test
    void testUnmarshaller2(){
        try {
            StringReader reader = new StringReader(CTOSRESULT.OP004042);
            JAXBContext context = JAXBContext.newInstance(QueryShipUpResult.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            QueryShipUpResult unmarshal = (QueryShipUpResult)unmarshaller.unmarshal(reader);
            System.out.println(JSON.toJSONString(unmarshal));
        } catch (Exception e){e.printStackTrace();}
    }

    @Test
    void testFastJSONFormat(){
        Login login = new Login("userName", "password", "123", "clientIp", "123");
        String result = JSON.toJSONString(login, SerializerFeature.PrettyFormat, SerializerFeature.UseSingleQuotes);
        System.out.println(result);
        String finalResult = result.replaceAll("\'(\\w+)\'(\\s*:\\s*)", "$1$2");
        System.out.println(finalResult.substring(1, finalResult.lastIndexOf("}")).replaceAll("\\s*", ""));

//        String json1 = "{\'name\':\'value\', \'user\':\'userValue#$2i%^#\'}";
//        String t = json1.replaceAll("\'(\\w+)\'(\\s*:\\s*)", "$1$2");
//        System.out.println(t);
    }

    @Test
    void testRegex(){
        String xmlStr = Response.OP004042;
        String regex = "<CTOSRESULT>(.*?)</CTOSRESULT>";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(xmlStr);
        String result = null;
        if(matcher.find()){
            result = matcher.group(1);
        }
        result = "<CTOSRESULT>" + result + "</CTOSRESULT>";
        System.out.println(result);

    }

    private RegisterResult getRegisterResult(){
        RegisterResult result = new RegisterResult();

        ReturnInfo returnInfo = new ReturnInfo();
        returnInfo.setErrorCode("100");
        returnInfo.setErrorMsg("unknown error");
        result.setReturnInfo(returnInfo);

        RegisterResult.DataTable dataTable = new RegisterResult.DataTable();
        dataTable.setTicketId("34567890ertyuiuiop");
        result.setDataTable(Arrays.asList(dataTable));

        return result;
    }

    @Test
    void test(){
        String result = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Body><SM001001Response xmlns=\"http://tempuri.org/\"><SM001001Result>&lt;CTOSRESULT&gt;&lt;RETURNINFO&gt;&lt;ERRORCODE&gt;0&lt;/ERRORCODE&gt;&lt;ERRORMSG&gt;success&lt;/ERRORMSG&gt;&lt;/RETURNINFO&gt;&lt;SM001001&gt;&lt;TICKET_ID&gt;zkIX5VnobHrR9KTFSI8orJn5rKiRsd5lPmqbxDxUxV/KkX5b/Z5yCwLrnpWk30N1vyFRYCyZAcgQYoPd6cupNoKu+YyuGZ8NhSIx4B+4n+/kxWuPfOxD8rse/fReywYAk9H2xBbYFaG6teqdPC9SbKF5pIyVZbfB5t7Jn/TG1wIIeuDA/p2uZv6/Q90dVcPYxHSTU27uv1/PSK4iA6gfEIC7EiS8FnCKFJGm/P4N7GA=&lt;/TICKET_ID&gt;&lt;/SM001001&gt;&lt;/CTOSRESULT&gt;</SM001001Result></SM001001Response></soap:Body></soap:Envelope>";
//        String result = "<><>&lt;&lt;&gt;&gt;";
        result = result.replace("&lt;", "<");
        result = result.replace("&gt;", ">");
        System.out.println(result);

        String strXml = "&lt; nodes> … &lt;/nodes>";
        strXml = strXml.replace("&lt;", '<' + "");
        System.out.println(strXml);
    }

    @Test
    void testLargeFileUnmarshal(){
        VesselStructResult vesselStructResult = null;
        File file = new File("E:\\result\\subVesselStruct.txt");
        try{
            String result = Files.asCharSource(file, StandardCharsets.UTF_8).read();
            StringReader reader = new StringReader(result);
            JAXBContext context = JAXBContext.newInstance(VesselStructResult.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            vesselStructResult = (VesselStructResult) unmarshaller.unmarshal(reader);
            System.out.println(vesselStructResult);
        } catch (Exception e){
            e.printStackTrace();
        }
        String s = JSON.toJSONString(vesselStructResult);
        System.out.println(s);
    }

    @Autowired FieldReflect reflect;

    @Test
    void testFieldReflectFormat(){
        List<FieldReflect.Format> fieldReflect = reflect.getFieldReflect(VesselStructResult.class);
        System.out.println(fieldReflect);
    }

    @Test
    void testFieldReflectMultiFormat() {
        Map<String, List<FieldReflect.Format>> fieldReflect = reflect.getFieldReflect2(VesselStructResult.class);
        System.out.println(fieldReflect);
    }

    @Test
    void testReg(){
        String str = ".dataTable.result1.field1";
        String[] split = str.split("[.]");
        List<String> splitList = Arrays.asList(split);
        System.out.println(splitList.get(splitList.size()-2));
        System.out.println(splitList.get(splitList.size()-1));
    }
}
