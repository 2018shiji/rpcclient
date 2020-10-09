package com.module.parser;

import com.module.parser.asmxclient.ShipmentDownClient;
import com.module.parser.asmxclient.ShipmentUpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderDispatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderDispatchApplication.class, args);
    }

}
