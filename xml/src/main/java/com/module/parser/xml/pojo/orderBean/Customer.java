package com.module.parser.xml.pojo.orderBean;

import lombok.Data;

import java.util.List;

/**
 * Customer information
 */
@Data
public class Customer {
    private long customerNumber;
    /** Personal name. */
    private String firstName;
    /** Family name. */
    private String lastName;
    /** Middle name(s). */
    private List<String> middleNames;
}
