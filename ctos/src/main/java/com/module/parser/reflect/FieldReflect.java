package com.module.parser.reflect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.lang.reflect.ParameterizedType;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class FieldReflect {
    static List<VueResponseFormat> vueResponseFormats;

    public List<VueResponseFormat> getRespFieldReflect(Class clazz){
        vueResponseFormats = new ArrayList<>();
        searchField(clazz, "");

        List<String> results = new ArrayList<>();
        for(int i = 0; i < vueResponseFormats.size(); i++){
            results.add("{key:'" + vueResponseFormats.get(i).key + "', label:'" + vueResponseFormats.get(i).label + "', field:'" + vueResponseFormats.get(i).key + "', sortable:'" + vueResponseFormats.get(i).sortable + "'}");
        }
        System.out.println(results);
        return vueResponseFormats;
    }

    public Map<String, List<VueResponseFormat>> getMapRespFieldReflect(Class clazz) {
        vueResponseFormats = new ArrayList<>();
        searchField(clazz, "");
        Map<String, List<VueResponseFormat>> resultMap = vueResponseFormats.stream().collect(Collectors.groupingBy(format -> format.group));
        System.out.println(resultMap);
        return resultMap;
    }

    public boolean isJdkClass(Class clazz){
        if(clazz.equals(String.class))
            return true;
        return false;
    }

    public void searchField(Class clazz, String prefix){
        while(!isJdkClass(clazz)){
            for(int i = 0; i < clazz.getDeclaredFields().length; i++){
                String name = prefix + "." + clazz.getDeclaredFields()[i].getName();
                if(clazz.getDeclaredFields()[i].isAnnotationPresent(VueField.class)) {
                    VueField annotation = clazz.getDeclaredFields()[i].getAnnotation(VueField.class);
                    String[] splits = name.split("[.]");
                    List<String> splitList = Arrays.asList(splits);
                    vueResponseFormats.add(new VueResponseFormat(splitList.get(1), splitList.get(splitList.size()-1), annotation.label(), splitList.get(splitList.size()-1), annotation.sortable()));
                }
                if(clazz.getDeclaredFields()[i].getType() == java.util.List.class) {
                    ParameterizedType genericType = (ParameterizedType) clazz.getDeclaredFields()[i].getGenericType();
                    searchField((Class<?>) genericType.getActualTypeArguments()[0], name);
                } else {
                    searchField(clazz.getDeclaredFields()[i].getType(), name);
                }
            }
            break;
        }
    }

    @Data
    @ToString
    @AllArgsConstructor
    public class VueResponseFormat {
        private String group;
        private String key;
        private String label;
        private String field;
        private boolean sortable;
    }

}
