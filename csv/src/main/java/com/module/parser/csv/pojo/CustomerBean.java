package com.module.parser.csv.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerBean {
    private String customerNo;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Boolean married;
    private Integer numberOfKids;
    private String favouriteQuote;
    private String email;
    private Long loyaltyPoints;
}
