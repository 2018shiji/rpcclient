package com.module.parser.xml.pojo;

import lombok.Data;
import com.module.parser.xml.pojo.orderBean.*;
import java.util.Date;
import java.util.List;

@Data
public class OrderBean {
    private long orderNumber;
    private Customer customer;


    /** Billing address information */
    private Address billTo;
    private Shipping shipping;

    /** Shipping address information. */
    private Address shipTo;
    private List<Item> items;

    /** Date order was placed with server */
    private Date orderDate;

    /** Date order was shipped. */
    private Date shipDate;
    private Float total;

}
