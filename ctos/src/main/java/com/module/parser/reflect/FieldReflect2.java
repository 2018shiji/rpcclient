package com.module.parser.reflect;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

@Component
public class FieldReflect2 {
    static List<Format2> format2s;

    public List<Format2> getFieldReflect(Class clazz) {
        format2s = new ArrayList<>();
        search(clazz);
        System.out.println(format2s);

        List<String> results = new ArrayList<>();
        for(int i = 0; i < format2s.size(); i++){
            results.add("{label:'" + format2s.get(i).label + "', key:'" + format2s.get(i).key + "', value:'" + format2s.get(i).value + "'}");
        }
        System.out.println(results);
        return format2s;
    }

    public boolean isJdkClass(Class clazz){
        if(clazz.equals(String.class))
            return true;
        return false;
    }

    public void search(Class clazz){
        while(!isJdkClass(clazz)){
            for(int i = 0; i < clazz.getDeclaredFields().length; i++){
                String name = clazz.getDeclaredFields()[i].getName();
                System.out.println("yyyyyyyyy" + name);
                if(clazz.getDeclaredFields()[i].isAnnotationPresent(JSONField.class)){
                    JSONField annotation = clazz.getDeclaredFields()[i].getAnnotation(JSONField.class);
                    format2s.add(new Format2(name, annotation.label(), ""));
                }
                if(clazz.getDeclaredFields()[i].getType() == java.util.List.class){
                    ParameterizedType genericType = (ParameterizedType) clazz.getDeclaredFields()[i].getGenericType();
                    search((Class<?>)genericType.getActualTypeArguments()[0]);
                } else {
                    search(clazz.getDeclaredFields()[i].getType());
                }
            }
            break;
        }
    }

    @Data
    @ToString
    @AllArgsConstructor
    public class Format2{
        private String key;
        private String label;
        private String value = "";
    }
}
