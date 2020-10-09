package com.module.parser.asmxclient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShipmentUpClient extends Asmx8HttpClient {

    public List<CtosAccessor> accessors;

    public String doSomeThingBefore(){
        String resultBefore = super.doSomeThingBefore();
        return resultBefore;
    }

    public String AccessShipmentUp(CtosAccessor... accessorList){
        initAccessors(accessorList);
        accessors.forEach(item -> {item.accessXXX(resultMap);});
        return resultMap;
    }

    public String doSomeThingAfter(){
        String resultAfter = super.doSomeThingAfter();
        return resultAfter;
    }

    private void initAccessors(CtosAccessor... accessorList){
        accessors = new ArrayList<>();
        if(accessorList == null || accessorList.length == 0){
            accessors.add(new FindBoxOrderClient());
            accessors.add(new ShipmentUpRegClient());
        }else {
            Arrays.stream(accessorList).forEach(item -> {accessors.add(item);});
        }

    }

    public class FindBoxOrderClient implements CtosAccessor{
        @Override
        public String accessXXX(String returnStr) {
            return accessFindBoxOrder(returnStr);
        }

        public synchronized String accessFindBoxOrder(String returnStr){
            String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                    "   <soap:Header/>\n" +
                    "   <soap:Body>\n" +
                    "      <tem:CP007032>\n" +
                    "         <!--Optional:-->\n" +
                    "         \n" +
                    "      <tem:paras>" + returnStr + "</tem:paras></tem:CP007032>\n" +
                    "   </soap:Body>\n" +
                    "</soap:Envelope>";
            dispatch(endpointURL, content, "CP007032");
            return returnStr;
        }
    }

    public class ShipmentUpRegClient implements CtosAccessor {
        @Override
        public String accessXXX(String returnStr) {
            return accessShipmentUpReg(returnStr);
        }

        public synchronized String accessShipmentUpReg(String returnStr){
            String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                    "   <soap:Header/>\n" +
                    "   <soap:Body>\n" +
                    "      <tem:OP007036>\n" +
                    "         <!--Optional:-->\n" +
                    "         \n" +
                    "      <tem:paras>" + returnStr + "</tem:paras></tem:OP007036>\n" +
                    "   </soap:Body>\n" +
                    "</soap:Envelope>";
            dispatch(endpointURL, content, "OP007036");
            return returnStr;
        }
    }

    public class QueryShipUpClient implements CtosAccessor {
        @Override
        public String accessXXX(String returnStr) {
            return accessQueryShipUp(returnStr);
        }

        public synchronized String accessQueryShipUp(String returnStr){
            String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                    "   <soap:Header/>\n" +
                    "   <soap:Body>\n" +
                    "      <tem:OP004042>\n" +
                    "         <!--Optional:-->\n" +
                    "         \n" +
                    "      <tem:paras>" + returnStr + "</tem:paras></tem:OP004042>\n" +
                    "   </soap:Body>\n" +
                    "</soap:Envelope>";
            dispatch(endpointURL, content, "OP004042");
            return returnStr;
        }
    }
    

}
