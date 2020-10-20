package com.module.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.module.parser.reflect.FieldReflect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class Navigator {
    @Autowired protected FieldReflect reflect;

    protected String getRequestBodyStr(Object requestObject){
        String requestStr1 = JSON.toJSONString(requestObject, SerializerFeature.PrettyFormat, SerializerFeature.UseSingleQuotes);
        String requestStr2 = requestStr1.replaceAll("\'(\\w+)\'(\\s*:\\s*)", "$1$2");
        String requestStr3 = requestStr2.substring(1, requestStr2.lastIndexOf("}")).replaceAll("\\s*", "");
        System.out.println("------------final input string----------" + requestStr3);
        return requestStr3;
    }

    protected Object getResultObject(String responseBodyStr, Class responseClass){
        String ctosResponseStr = getCTOSResultString(responseBodyStr);
        System.out.println("------------final output string----------" + ctosResponseStr);

        Object returnObject = null;
        try{
            StringReader reader = new StringReader(ctosResponseStr);
            JAXBContext context = JAXBContext.newInstance(responseClass);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            returnObject = unmarshaller.unmarshal(reader);
        } catch (Exception e){
            e.printStackTrace();
        }

        return returnObject;
    }

    protected String getCTOSResultString(String xmlString){
        String regex = "<CTOSRESULT>(.*?)</CTOSRESULT>";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(xmlString);
        String result = null;
        if(matcher.find()){
            result = matcher.group(1);
        }
        result = "<CTOSRESULT>" + result + "</CTOSRESULT>";
        return result;
    }

}
