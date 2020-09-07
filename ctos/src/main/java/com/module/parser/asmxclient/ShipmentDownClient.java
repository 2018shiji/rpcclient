package com.module.parser.asmxclient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ShipmentDownClient extends Asmx8HttpClient {

    public List<CtosAccessor> accessors;

    public void accessShipmentDown(CtosAccessor... accessorList){
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
            accessors.add(new DeShipment());
            accessors.add(new UpdateBox());
            accessors.add(new UnLoad());
        } else {
            Arrays.stream(accessorList).forEach(item -> {accessors.add(item);});
        }
    }

    private class DeShipment implements CtosAccessor {
        @Override
        public void accessXXX(Map<String, String> nameValuePair) {
            accessDeShipment();
        }

        private synchronized void accessDeShipment(){
            String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                    "   <soap:Header/>\n" +
                    "   <soap:Body>\n" +
                    "      <tem:OP007031>\n" +
                    "         <!--Optional:-->\n" +
                    "         \n" +
                    "      <tem:paras></tem:paras></tem:OP007031>\n" +
                    "   </soap:Body>\n" +
                    "</soap:Envelope>";
            dispatch(endpointURL, content, "OP007031");
        }
    }

    private class UpdateBox implements CtosAccessor {
        @Override
        public void accessXXX(Map<String, String> nameValuePair) {
            accessUpdateBox();
        }

        private synchronized void accessUpdateBox(){
            String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                    "   <soap:Header/>\n" +
                    "   <soap:Body>\n" +
                    "      <tem:OP007095>\n" +
                    "         <!--Optional:-->\n" +
                    "         \n" +
                    "      <tem:paras></tem:paras></tem:OP007095>\n" +
                    "   </soap:Body>\n" +
                    "</soap:Envelope>";
            dispatch(endpointURL, content, "OP007095");
        }
    }

    private class UnLoad implements CtosAccessor {
        @Override
        public void accessXXX(Map<String, String> nameValuePair) {
            accessUnLoad();
        }
        private synchronized void accessUnLoad(){
            String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                    "   <soap:Header/>\n" +
                    "   <soap:Body>\n" +
                    "      <tem:OP007037>\n" +
                    "         <!--Optional:-->\n" +
                    "         \n" +
                    "      <tem:paras></tem:paras></tem:OP007037>\n" +
                    "   </soap:Body>\n" +
                    "</soap:Envelope>";
            dispatch(endpointURL, content, "OP007037");
        }
    }

}
