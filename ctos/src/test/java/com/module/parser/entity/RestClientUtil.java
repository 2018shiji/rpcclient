package com.module.parser.entity;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class RestClientUtil {
    public void test00() { test("http://127.0.0.1:8080/getBoxResultFormat", List.class); }

    public void test0() { test("http://127.0.0.1:8080/getBoxResult", String.class);}

    public void test1(){
        test("http://127.0.0.1:8080/getRegisterResult", String.class);
    }

    public void test2(){
        test("http://127.0.0.1:8080/getRegisterOut", String.class);
    }

    public void test3(){
        test("http://127.0.0.1:8080/getVesselSchedule", String.class);
    }

    public void test4(){
        test("http://127.0.0.1:8080/getShipmentUpReg", String.class);
    }

    public void test5(){
        test("http://127.0.0.1:8080/getQueryShipUp", String.class);
    }

    private void test(String url, Class clazz){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> requestEntity = new HttpEntity<>(headers);
        ResponseEntity exchange = restTemplate.exchange(url, HttpMethod.GET, requestEntity, clazz);
        List body = Arrays.asList(exchange.getBody());
        System.out.println(body);
    }
}
