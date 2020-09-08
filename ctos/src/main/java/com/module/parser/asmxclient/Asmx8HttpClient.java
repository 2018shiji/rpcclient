package com.module.parser.asmxclient;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.http.RequestEntity;

import java.util.HashMap;
import java.util.Map;


public class Asmx8HttpClient {
    public static Map<String, String> resultMap;
    public static CloseableHttpClient httpclient = HttpClients.createDefault();
    public static final String endpointURL = "http://10.128.13.27:6001/Service.asmx";
    public static final String endpointURLTest = "http://10.128.13.27:6003/Service.asmx";

    public Map<String, String> doSomeThingBefore(){
        resultMap = new HashMap();

        return resultMap;
    }

    public Map<String, String> doSomeThingAfter(){

        return resultMap;
    }

    public synchronized void accessCTOS(){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:SM001001>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>CLIENTIP:'1',PASSWORD:'123456',USER_ID:'DYW'</tem:paras></tem:SM001001>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        dispatch(endpointURL, content, "SM001001");
    }

    public synchronized void deAccessCTOS(){

        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:SM001002>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>TICKET_ID:'zkIX5VnobHrR9KTFSI8orJn5rKiRsd5lPmqbxDxUxV8Oy4LQF9GIMoCciV1PAwwthKA06337mvc6NsY1uE518s+wVCZ+jYnaOimLlhRSTNW1Z/d9ZXLcpdVVRYOrBQMoKMNZFd9V89E/zKF7nUITydgPFuPMyepZJZX249ZuIpn7IN0w1fgpndTlMDWjudi9n31ot7Sk52BzeC4PPVtyFmPG4xbttNhElnlQLrOb0Ws=',USER_ID:'DYW'</tem:paras></tem:SM001002>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        dispatch(endpointURL, content, "SM001002");

    }

    public synchronized void accessQuery(){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:VM002001>\n" +
                "         <!--Optional:-->\n" +
                "         <tem:paras>TICKET_ID:'zkIX5VnobHrR9KTFSI8orJn5rKiRsd5lPmqbxDxUxV8Oy4LQF9GIMoCciV1PAwwthKA06337mvc6NsY1uE518s+wVCZ+jYnaOimLlhRSTNW1Z/d9ZXLcpdVVRYOrBQMoKMNZFd9V89E/zKF7nUITydgPFuPMyepZJZX249ZuIpn7IN0w1fgpndTlMDWjudi9n31ot7Sk52BzeC4PPVtyFmPG4xbttNhElnlQLrOb0Ws='</tem:paras>\n" +
                "      </tem:VM002001>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        dispatch(endpointURL, content, "VM002001");
    }

    public synchronized void accessLogin(){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP007001>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>CLIENTIP:'1',PASSWORD:'123456',USERNAME:'DYW',TERMINALNO:'1',TICKET_ID:'zkIX5VnobHrR9KTFSI8orJn5rKiRsd5lPmqbxDxUxV8Oy4LQF9GIMoCciV1PAwwthKA06337mvc6NsY1uE518s+wVCZ+jYnaOimLlhRSTNW1Z/d9ZXLcpdVVRYOrBQMoKMNZFd9V89E/zKF7nUITydgPFuPMyepZJZX249ZuIpn7IN0w1fgpndTlMDWjudi9n31ot7Sk52BzeC4PPVtyFmPG4xbttNhElnlQLrOb0Ws='</tem:paras></tem:OP007001>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        dispatch(endpointURL, content, "OP007001");
    }

    public synchronized void accessVesselInit(){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP007030>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>CLIENTIP:'1',PASSWORD:'123456',USERNAME:'DYW',TERMINALNO:'1',TICKET_ID:'zkIX5VnobHrR9KTFSI8orJn5rKiRsd5lPmqbxDxUxV8Oy4LQF9GIMoCciV1PAwwthKA06337mvc6NsY1uE518s+wVCZ+jYnaOimLlhRSTNW1Z/d9ZXLcpdVVRYOrBQMoKMNZFd9V89E/zKF7nUITydgPFuPMyepZJZX249ZuIpn7IN0w1fgpndTlMDWjudi9n31ot7Sk52BzeC4PPVtyFmPG4xbttNhElnlQLrOb0Ws='</tem:paras></tem:OP007030>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        dispatch(endpointURL, content, "OP007030");
    }

    public synchronized void accessFindBox(){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:CM005001>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras></tem:paras></tem:CM005001>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        dispatch(endpointURL, content, "CM005001");
    }

    public synchronized void deAccessLogin(){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP007002>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>USER_ID:'DYW',TERMINALNO:'1',TICKET_ID:''</tem:paras></tem:OP007002>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        dispatch(endpointURL, content, "OP007002");
    }

    public synchronized void accessQueryVessel(){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OTS001006>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>VELALIASE:'',TICKET_ID:''</tem:paras></tem:OTS001006>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        dispatch(endpointURL, content, "OTS001006");
    }

    public synchronized void accessShipmentQuit(){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP007006>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras></tem:paras></tem:OP007006>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        dispatch(endpointURL, content, "OP007006");
    }

    public void dispatch(String endpointURL, String content, String order){
        try{
            HttpPost httpPost = new HttpPost(endpointURL);
            BasicNameValuePair charset = new BasicNameValuePair("charset", "UTF-8");
            BasicNameValuePair action = new BasicNameValuePair("action", "http://tempuri.org/" + order);
            httpPost.setEntity(new StringEntity(content, ContentType.create("application/soap+xml", charset, action)));

            CloseableHttpResponse execute = httpclient.execute(httpPost);

            System.out.println(execute.getEntity().getContent());
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
