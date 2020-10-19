package com.module.parser.asmxclient;

import com.google.common.io.CharStreams;
import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.http.RequestEntity;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;


public class Asmx8HttpClient {
    public static String resultMap;
    public static CloseableHttpClient httpclient = HttpClients.createDefault();
    public static final String endpointURL = "http://10.128.13.27:6003/OCRService.asmx";

    public String doSomeThingBefore(){

        return resultMap;
    }

    public String doSomeThingAfter(){

        return resultMap;
    }

    public synchronized String accessBox(String input){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OTS001008>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:OTS001008>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "OTS001008");
    }

    public synchronized String accessFindBoxOrder(String input){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP007032>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:OP007032>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "OP007032");
    }

    public synchronized String accessShipmentUpReg(String input){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP007036>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:OP007036>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "OP007036");
    }

    public synchronized String accessQueryShipUp(String input){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP004042>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:OP004042>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "OP004042");
    }

    public synchronized String accessFindBox(String input){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:CM005001>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:CM005001>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "CM005001");
    }

    public synchronized String accessGetBerthMsg(String input){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:SM003007>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:SM003007>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "SM003007");
    }

    public synchronized String accessGetContractor(String input){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:SM003006>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:SM003006>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "SM003006");
    }

    public synchronized String accessGetRoleUser(String input){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:SM001010>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:SM001010>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "SM001010");
    }

    public synchronized String accessGetWorkOrderList(String input){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP004039>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:OP004039>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "OP004039");
    }

    public synchronized String accessLogin(String input) {
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP007001>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>CLIENTIP:'1',PASSWORD:'123456',USERNAME:'DYW',TERMINALNO:'1',TICKET_ID:'zkIX5VnobHrR9KTFSI8orJn5rKiRsd5lPmqbxDxUxV8Oy4LQF9GIMoCciV1PAwwthKA06337mvc6NsY1uE518s+wVCZ+jYnaOimLlhRSTNW1Z/d9ZXLcpdVVRYOrBQMoKMNZFd9V89E/zKF7nUITydgPFuPMyepZJZX249ZuIpn7IN0w1fgpndTlMDWjudi9n31ot7Sk52BzeC4PPVtyFmPG4xbttNhElnlQLrOb0Ws='</tem:paras></tem:OP007001>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "OP007001");
    }

    public synchronized String accessLogout(String input) {
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP007002>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:OP007002>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "OP007002");
    }

    public synchronized String accessQueryMainBox(String input) {
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:CM005009>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:CM005009>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "CM005009");
    }

    public synchronized String accessRegister(String input){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:SM001001>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:SM001001>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "SM001001");
    }

    public synchronized String accessRegisterOut(String input){

        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:SM001002>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>TICKET_ID:'zkIX5VnobHrR9KTFSI8orJn5rKiRsd5lPmqbxDxUxV8Oy4LQF9GIMoCciV1PAwwthKA06337mvc6NsY1uE518s+wVCZ+jYnaOimLlhRSTNW1Z/d9ZXLcpdVVRYOrBQMoKMNZFd9V89E/zKF7nUITydgPFuPMyepZJZX249ZuIpn7IN0w1fgpndTlMDWjudi9n31ot7Sk52BzeC4PPVtyFmPG4xbttNhElnlQLrOb0Ws=',USER_ID:'DYW'</tem:paras></tem:SM001002>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "SM001002");

    }

    public synchronized String accessShipmentDownReg(String input){

        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP007037>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:OP007037>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "OP007037");

    }

    public synchronized String accessShipmentTaskInit(String input){

        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP007030>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:OP007030>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "OP007030");

    }

    public synchronized String accessShipmentTaskQuit(String input){

        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP007006>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:OP007006>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "OP007006");

    }

    public synchronized String accessShipWorkLoad(String input){

        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP004040>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:OP004040>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "OP004040");

    }

    public synchronized String accessUnloadOrderList(String input){

        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP004041>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:OP004041>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "OP004041");

    }

    public synchronized String accessUnloadOrder(String input){

        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP007031>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:OP007031>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "OP007031");

    }

    public synchronized String accessUpdateDamageBox(String input){

        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP007095>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:OP007095>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "OP007095");

    }

    public synchronized String accessVesselSchedule(String input){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:VM002001>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:VM002001>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "VM002001");
    }

    public synchronized String accessVesselStruct(String input){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OTS001006>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:OTS001006>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "OTS001006");
    }

    public synchronized String accessDeShipment(String input){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP007031>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:OP007031>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "OP007031");
    }

    public synchronized String accessUpdateBox(String input){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP007095>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:OP007095>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "OP007095");
    }

    public synchronized String accessUnLoad(String input){
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP007037>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:OP007037>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "OP007037");
    }

    public String dispatch(String endpointURL, String content, String order){
        String result = null;
        try{
            HttpPost httpPost = new HttpPost(endpointURL);
            BasicNameValuePair charset = new BasicNameValuePair("charset", "UTF-8");
            BasicNameValuePair action = new BasicNameValuePair("action", "http://tempuri.org/" + order);
            httpPost.setEntity(new StringEntity(content, ContentType.create("application/soap+xml", charset, action)));

            CloseableHttpResponse execute = httpclient.execute(httpPost);
            System.out.println("++++++++++++++statusLine+++++++++++++++++++\n" + execute.getStatusLine());
            System.out.println("==============header=======================\n" + execute.getAllHeaders());
            System.out.println("--------------contentLength----------------\n" + execute.getEntity().getContentLength());
            result = CharStreams.toString(new InputStreamReader(execute.getEntity().getContent(), StandardCharsets.UTF_8));
            System.out.println(result);
            result = result.replaceAll("&lt;", "<");
            result = result.replaceAll("&gt;", ">");
//            System.out.println(result);

        } catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

}
