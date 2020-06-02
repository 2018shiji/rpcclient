package com.module.parser.input.pojo.order;

import com.module.parser.annotation.BindGenPojo;
import com.module.parser.input.pojo.IMain;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@BindGenPojo(name = "Order")
public class Order implements IMain {
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
