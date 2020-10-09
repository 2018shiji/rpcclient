package com.module.parser.asmxclient;

import java.util.*;

public class ShipmentDownClient extends Asmx8HttpClient {

    public List<CtosAccessor> accessors;

    public String doSomeThingBefore(){
        String resultBefore = super.doSomeThingBefore();
        return resultBefore;
    }

    public String accessShipmentDown(CtosAccessor... accessorList){
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
            accessors.add(new DeShipment());
            accessors.add(new UpdateBox());
            accessors.add(new UnLoad());
        } else {
            Arrays.stream(accessorList).forEach(item -> {accessors.add(item);});
        }
    }

    public class DeShipment implements CtosAccessor {
        @Override
        public String accessXXX(String returnStr) {
            return accessDeShipment(returnStr);
        }

        public synchronized String accessDeShipment(String returnStr){
            String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                    "   <soap:Header/>\n" +
                    "   <soap:Body>\n" +
                    "      <tem:OP007031>\n" +
                    "         <!--Optional:-->\n" +
                    "         \n" +
                    "      <tem:paras>" + returnStr + "</tem:paras></tem:OP007031>\n" +
                    "   </soap:Body>\n" +
                    "</soap:Envelope>";
            dispatch(endpointURL, content, "OP007031");
            return returnStr;
        }
    }

    public class UpdateBox implements CtosAccessor {
        @Override
        public String accessXXX(String returnStr) {
            return accessUpdateBox(returnStr);
        }

        public synchronized String accessUpdateBox(String returnStr){
            String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                    "   <soap:Header/>\n" +
                    "   <soap:Body>\n" +
                    "      <tem:OP007095>\n" +
                    "         <!--Optional:-->\n" +
                    "         \n" +
                    "      <tem:paras>" + returnStr + "</tem:paras></tem:OP007095>\n" +
                    "   </soap:Body>\n" +
                    "</soap:Envelope>";
            dispatch(endpointURL, content, "OP007095");
            return returnStr;
        }
    }

    public class UnLoad implements CtosAccessor {
        @Override
        public String accessXXX(String returnStr) {
            return accessUnLoad(returnStr);
        }
        public synchronized String accessUnLoad(String returnStr){
            String content = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n" +
                    "   <soap:Header/>\n" +
                    "   <soap:Body>\n" +
                    "      <tem:OP007037>\n" +
                    "         <!--Optional:-->\n" +
                    "         \n" +
                    "      <tem:paras>" + returnStr + "</tem:paras></tem:OP007037>\n" +
                    "   </soap:Body>\n" +
                    "</soap:Envelope>";
            dispatch(endpointURL, content, "OP007037");
            return returnStr;
        }
    }

}
