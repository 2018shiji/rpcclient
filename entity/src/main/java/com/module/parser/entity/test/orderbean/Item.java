package com.module.parser.entity.test.orderbean;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Order line item information.
 */
@Data
@NoArgsConstructor
public class Item
{
    /** Stock identifier. This is expected to be 12 characters in length, with two
     leading alpha characters followed by ten decimal digits. */
    private String id;
    
    /** Text description of item. */
    private String description;
    
    /** Number of units ordered. */
    private int quantity;
    
    /** Price per unit. */
    private float price;

    public Item(int i){
        this.price = i;
    }
}