package com.module.parser.csv;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CsvApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testCsvBeanWriter(){
        try {
            UseCsvWriter.writeWithCsvBeanWriter();
        }catch (Exception e){e.printStackTrace();}
    }

    @Test
    void testCsvBeanReader(){
        try{
            UseCsvReader.readWithCsvBeanReader();
        }catch (Exception e){e.printStackTrace();}
    }

    @Test
    void testPojoInfoReader(){
        try{
            UseCsvReader.readWithCsvBeanReader2();
        } catch (Exception e){e.printStackTrace();}
    }

}
