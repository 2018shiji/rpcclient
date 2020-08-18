package com.module.parser.xml;


import com.module.parser.entity.test.OrderBean;
import com.module.parser.entity.test.orderbean.Address;
import com.module.parser.entity.test.orderbean.Customer;
import com.module.parser.entity.test.orderbean.Item;
import com.module.parser.entity.test.orderbean.Shipping;
import org.jibx.runtime.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Date;

@SpringBootTest
class XmlApplicationTests {
    String absolutePath = "C:\\Users\\lizhuangjie.chnet\\IdeaProjects\\parser\\xml\\src\\main";

    @Test
    void contextLoads() throws Exception {
        OrderBean order = new OrderBean();
        order.setOrderNumber(11011101);
        order.setCustomer(new Customer(12334));

        order.setBillTo(new Address("普宁大道"));
        order.setShipping(Shipping.DOMESTIC_EXPRESS);

        Address shipTo = new Address("普宁大道");
        shipTo.setCountry("潮汕市");
        order.setShipTo(shipTo);
        order.setItems(Arrays.asList(new Item(12), new Item(14), new Item(17)));

        order.setOrderDate(new Date());
        order.setShipDate(new Date());
        order.setTotal((float)558.9);

        testJiBxParser(order);
    }

    @Test
    void testXml() throws Exception {
        IBindingFactory bfact = BindingDirectory.getFactory(OrderBean.class);
        IUnmarshallingContext context = bfact.createUnmarshallingContext();
        FileInputStream inputStream = new FileInputStream(absolutePath + "\\java\\com\\module\\parser\\xml\\xmlfile\\data1.xml");
        OrderBean order = (OrderBean) context.unmarshalDocument(inputStream, null);

        System.out.println(order);
    }

    private String testJiBxParser(OrderBean order) throws JiBXException, IOException {
        IBindingFactory factory = BindingDirectory.getFactory(OrderBean.class);
        StringWriter writer = new StringWriter();
        IMarshallingContext mctx = factory.createMarshallingContext();
        mctx.setIndent(2);
        mctx.marshalDocument(order, "UTF-8", null, writer);
        String xmlStr = writer.toString();
        writer.close();
        System.out.println(xmlStr);
        return xmlStr;
    }

}
