
package com.module.parser.entity.test.orderbean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Customer information.
 */
@Data
@NoArgsConstructor
public class Customer
{
    private long customerNumber;
    
    /** Personal name. */
    private String firstName;
    
    /** Family name. */
    private String lastName;
    
    /** Middle name(s), if any. */
    private List<String> middleNames;
    
    private transient String a;
    
    private static String b;
    
    private final String c = "C";

    public Customer(long l){
        this.customerNumber = l;
    }
}