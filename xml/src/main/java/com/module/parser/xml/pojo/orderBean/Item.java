package com.module.parser.xml.pojo.orderBean;

import lombok.Data;

@Data
public class Item {
    /** identifier */
    private String id;
    /** text description of item. */
    private String description;
    /** Number of units ordered. */
    private int quantity;
    /** price per unit. */
    private float price;
}
