package com.module.parser.asmxclient;

import com.google.common.io.CharStreams;
import com.module.parser.logconfig.ConsoleLogRecorder;
import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.RequestEntity;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;


public class Asmx8HttpClient {
    private static final Logger logger = LoggerFactory.getLogger(Asmx8HttpClient.class);
    private static final CloseableHttpClient httpclient = HttpClients.createDefault();
    private static final String endpointURL = "http://10.128.13.27:6003/OCRService.asmx";


    public static synchronized String accessBox(String input){
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

    public static synchronized String accessFindBoxOrder(String input){
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

    public static synchronized String accessShipmentUpReg(String input){
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

    public static synchronized String accessQueryShipUp(String input){
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

    public static synchronized String accessFindBox(String input){
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

    public static synchronized String accessGetBerthMsg(String input){
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

    public static synchronized String accessGetContractor(String input){
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

    public static synchronized String accessGetRoleUser(String input){
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

    public static synchronized String accessGetWorkOrderList(String input){
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

    public static synchronized String accessLogin(String input) {
        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:OP007001>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:OP007001>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "OP007001");
    }

    public static synchronized String accessLogout(String input) {
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

    public static synchronized String accessQueryMainBox(String input) {
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

    public static synchronized String accessRegister(String input){
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

    public static synchronized String accessRegisterOut(String input){

        String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <tem:SM001002>\n" +
                "         <!--Optional:-->\n" +
                "         \n" +
                "      <tem:paras>" + input + "</tem:paras></tem:SM001002>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        return dispatch(endpointURL, content, "SM001002");

    }

    public static synchronized String accessShipmentDownReg(String input){

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

    public static synchronized String accessShipmentTaskInit(String input){

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

    public static synchronized String accessShipmentTaskQuit(String input){

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

    public static synchronized String accessShipWorkLoad(String input){

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

    public static synchronized String accessUnloadOrderList(String input){

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

    public static synchronized String accessUnloadOrder(String input){

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

    public static synchronized String accessUpdateDamageBox(String input){

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

    public static synchronized String accessVesselSchedule(String input){
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

    public static synchronized String accessVesselStruct(String input){
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


    public static String dispatch(String endpointURL, String content, String order){
        String result = null;
        try{
            HttpPost httpPost = new HttpPost(endpointURL);
            BasicNameValuePair charset = new BasicNameValuePair("charset", "UTF-8");
            BasicNameValuePair action = new BasicNameValuePair("action", "http://tempuri.org/" + order);
            httpPost.setEntity(new StringEntity(content, ContentType.create("application/soap+xml", charset, action)));

            CloseableHttpResponse execute = httpclient.execute(httpPost);
            recordDispatchTrack(execute);

            result = CharStreams.toString(new InputStreamReader(execute.getEntity().getContent(), StandardCharsets.UTF_8));
            System.out.println(result);
            result = result.replaceAll("&lt;", "<");
            result = result.replaceAll("&gt;", ">");


        } catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    private static void recordDispatchTrack(CloseableHttpResponse execute){
        if(execute == null)
            return;

        ConsoleLogRecorder consoleLogRecorder = ConsoleLogRecorder.withLogger(logger);
        consoleLogRecorder.info("++++++++++++++statusLine+++++++++++++++++++\n" + execute.getStatusLine());
        consoleLogRecorder.info("==============header=======================\n");
        for(int i = 0; i < execute.getAllHeaders().length; i++){
            consoleLogRecorder.infoNonWrapped(execute.getAllHeaders()[i] + "\t");
        }
        System.out.println();
        consoleLogRecorder.info("--------------contentLength----------------\n" + execute.getEntity().getContentLength());

    }

}
