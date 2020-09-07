package com.module.parser.asmxclient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ShipmentUpClient extends Asmx8HttpClient {

    public List<CtosAccessor> accessors;

    public void AccessShipmentUp(CtosAccessor... accessorList){
        Map<String, String> resultBefore = doSomeThingBefore();
        initAccessors(accessorList);
        accessors.forEach(item -> {item.accessXXX(resultBefore);});
        doSomeThingAfter();
    }

    public Map<String, String> doSomeThingBefore(){
        Map<String, String> resultBefore = super.doSomeThingBefore();
        return resultBefore;
    }

    public Map<String, String> doSomeThingAfter(){
        Map<String, String> resultAfter = super.doSomeThingAfter();
        return resultAfter;
    }

    private void initAccessors(CtosAccessor... accessorList){
        accessors = new ArrayList<>();
        if(accessorList == null || accessorList.length == 0){
            accessors.add(new FindBoxOrder());
            accessors.add(new Shipment());
        }else {
            Arrays.stream(accessorList).forEach(item -> {accessors.add(item);});
        }

    }

    private class FindBoxOrder implements CtosAccessor{
        @Override
        public void accessXXX(Map<String, String> nameValuePair) {
            accessFindBoxOrder();
        }

        private synchronized void accessFindBoxOrder(){
            String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                    "   <soap:Header/>\n" +
                    "   <soap:Body>\n" +
                    "      <tem:CP007032>\n" +
                    "         <!--Optional:-->\n" +
                    "         \n" +
                    "      <tem:paras></tem:paras></tem:CP007032>\n" +
                    "   </soap:Body>\n" +
                    "</soap:Envelope>";
            dispatch(endpointURL, content, "CP007032");
        }
    }

    private class Shipment implements CtosAccessor {
        @Override
        public void accessXXX(Map<String, String> nameValuePair) {
            accessShipment();
        }

        private synchronized void accessShipment(){
            String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                    "   <soap:Header/>\n" +
                    "   <soap:Body>\n" +
                    "      <tem:OP007036>\n" +
                    "         <!--Optional:-->\n" +
                    "         \n" +
                    "      <tem:paras></tem:paras></tem:OP007036>\n" +
                    "   </soap:Body>\n" +
                    "</soap:Envelope>";
            dispatch(endpointURL, content, "OP007036");
        }
    }

}
