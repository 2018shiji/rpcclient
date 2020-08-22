package com.module.parser.entity.test.order;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private int orderNo;
//    private Customer customer;
    private List<String> foods;
//    private List<Customer> customerList;
}
