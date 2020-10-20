package com.module.parser.reflect;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

@Component
public class FieldReflectForQueryParam {
    Logger logger = LoggerFactory.getLogger(FieldReflectForQueryParam.class);
    private List<VueQueryParamFormat> vueQueryParamFormats;

    public List<VueQueryParamFormat> getQueryParamFieldReflect(Class clazz) {
        vueQueryParamFormats = new ArrayList<>();
        searchField(clazz);

        List<String> results = new ArrayList<>();
        for(int i = 0; i < vueQueryParamFormats.size(); i++){
            results.add("{label:'" + vueQueryParamFormats.get(i).label + "', key:'" + vueQueryParamFormats.get(i).key + "', value:'" + vueQueryParamFormats.get(i).value + "'}");
        }
        System.out.println(results);
        logger.info(results.toString());
        return vueQueryParamFormats;
    }

    public boolean isJdkClass(Class clazz){
        if(clazz.equals(String.class))
            return true;
        return false;
    }

    public void searchField(Class clazz){
        while(!isJdkClass(clazz)){
            for(int i = 0; i < clazz.getDeclaredFields().length; i++){
                String name = clazz.getDeclaredFields()[i].getName();
                if(clazz.getDeclaredFields()[i].isAnnotationPresent(JSONField.class)){
                    JSONField annotation = clazz.getDeclaredFields()[i].getAnnotation(JSONField.class);
                    vueQueryParamFormats.add(new VueQueryParamFormat(name, annotation.label(), ""));
                }
                if(clazz.getDeclaredFields()[i].getType() == java.util.List.class){
                    ParameterizedType genericType = (ParameterizedType) clazz.getDeclaredFields()[i].getGenericType();
                    searchField((Class<?>)genericType.getActualTypeArguments()[0]);
                } else {
                    searchField(clazz.getDeclaredFields()[i].getType());
                }
            }
            break;
        }
    }

    @Data
    @ToString
    @AllArgsConstructor
    public class VueQueryParamFormat {
        private String key;
        private String label;
        private String value = "";
    }
}
