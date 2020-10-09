package com.module.parser.entity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class EntityApplicationWebTest {
    RestClientUtil restClientUtil = new RestClientUtil();

    @Test
    void test(){
        restClientUtil.test0();
    }

    @Test
    void test1(){
        restClientUtil.test00();
    }

}
