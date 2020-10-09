package com.module.parser.reflect;

import com.module.parser.entity.result.BoxResult;
import com.module.parser.entity.result.QueryShipUpResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class FieldReflect {
    static List<Format> formats;

    public List<Format> getFieldReflect(Class clazz){
        formats = new ArrayList<>();
        search(clazz, "");

        List<String> results = new ArrayList<>();
        for(int i = 0; i < formats.size(); i++){
            results.add("{key:'" + formats.get(i).key + "', label:'" + formats.get(i).label + "', field:'" + formats.get(i).key + "', sortable:'" + formats.get(i).sortable + "'}");
        }
        System.out.println(results);
        return formats;
    }

    public Map<String, List<Format>> getFieldReflect2(Class clazz) {
        formats = new ArrayList<>();
        search(clazz, "");
        Map<String, List<Format>> resultMap = formats.stream().collect(Collectors.groupingBy(format -> format.group));
        System.out.println(resultMap);
        return resultMap;
    }

    public boolean isJdkClass(Class clazz){
        if(clazz.equals(String.class))
            return true;
        return false;
    }

    public void search(Class clazz, String prefix){
        while(!isJdkClass(clazz)){
            for(int i = 0; i < clazz.getDeclaredFields().length; i++){
                String name = prefix + "." + clazz.getDeclaredFields()[i].getName();
                System.out.println("name: " + name);
                if(clazz.getDeclaredFields()[i].isAnnotationPresent(VueField.class)) {
                    VueField annotation = clazz.getDeclaredFields()[i].getAnnotation(VueField.class);
                    String[] splits = name.split("[.]");
                    List<String> splitList = Arrays.asList(splits);
                    formats.add(new Format(splitList.get(1), splitList.get(splitList.size()-1), annotation.label(), splitList.get(splitList.size()-1), annotation.sortable()));
                }
                if(clazz.getDeclaredFields()[i].getType() == java.util.List.class) {
                    ParameterizedType genericType = (ParameterizedType) clazz.getDeclaredFields()[i].getGenericType();
                    search((Class<?>) genericType.getActualTypeArguments()[0], name);
                } else {
                    search(clazz.getDeclaredFields()[i].getType(), name);
                }
            }
            break;
        }
    }

    @Data
    @ToString
    @AllArgsConstructor
    public class Format{
        private String group;
        private String key;
        private String label;
        private String field;
        private boolean sortable;
    }

}
