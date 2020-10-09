package com.module.parser.entity.order;

public class Request {
    public static final String[] header = {
            "POST http://10.128.13.27:6001/Service.asmx HTTP/1.1",
            "Content-Type: application/soap+xml;charset=UTF-8;action=\"http://tempuri.org/SM001001\"",
            "Content-Length: XXX",
            "Host: 10.128.13.27:6001",
            "Connection: Keep-Alive"
    };

    public static final String body =
            "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">" +
            "<soap:Header/>" +
            "<soap:Body>" +
            "<tem:SM001001>" +
            "<!--Optional:-->" +
            "<tem:paras>CLIENTIP:'1',PASSWORD:'123456',USER_ID:'DYW'</tem:paras>" +
            "</tem:SM001001>" +
            "</soap:Body>" +
            "</soap:Envelope>";

}
