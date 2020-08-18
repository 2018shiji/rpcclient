package com.module.parser.entity.test;

import com.module.parser.entity.test.orderbean.Address;
import com.module.parser.entity.test.orderbean.Customer;
import com.module.parser.entity.test.orderbean.Item;
import com.module.parser.entity.test.orderbean.Shipping;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Order information.
 */
@Data
public class OrderBean
{
    private long orderNumber;
    
    private Customer customer;
    
    /** Billing address information. */
    private Address billTo;
    
    private Shipping shipping;
    
    /** Shipping address information. If missing, the billing address is also used as the
     shipping address. */
    private Address shipTo;
    
    private List<Item> items;
    
    /** Date order was placed with server. */
    private Date orderDate;
    
    /** Date order was shipped. This will be <code>null</code> if the order has not
     yet shipped. */
    private Date shipDate;
    
    private Float total;

}