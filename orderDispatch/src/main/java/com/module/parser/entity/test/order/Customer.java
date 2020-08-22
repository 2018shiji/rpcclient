package com.module.parser.entity.test.order;

import lombok.Data;

import java.util.List;

@Data
public class Customer {
    private int age;
    private String name;
    private List<String> families;
}
