package com.module.parser.csv;

import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ParseBool;
import org.supercsv.cellprocessor.ParseDate;
import org.supercsv.cellprocessor.ParseInt;
import org.supercsv.cellprocessor.constraint.LMinMax;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.constraint.StrRegEx;
import org.supercsv.cellprocessor.constraint.UniqueHashCode;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class UseCsvReader {

    private static CellProcessor[] getProcessors(){
        final String emailRegex = "[a-z0-9\\._]+@[a-z0-9\\.]+";
        StrRegEx.registerMessage(emailRegex, "must be a valid email address");

        final CellProcessor[] processors = new CellProcessor[] {
                new UniqueHashCode(), // customerNo (must be unique)
                new NotNull(), // firstName
                new NotNull(), // lastName
                new ParseDate("dd/MM/yyyy"), // birthDate
                new Optional(new ParseBool()), // married
                new Optional(new ParseInt()), // numberOfKids
                new NotNull(), // favouriteQuote
                new StrRegEx(emailRegex), // email
                new LMinMax(0L, LMinMax.MAX_LONG) // loyaltyPoints
        };

        return processors;
    }

    public static void readWithCsvBeanReader() throws Exception {
        ICsvBeanReader beanReader = null;
        try{
            beanReader = new CsvBeanReader(new FileReader("D:\\log\\writeWithCsvBeanWriter.csv"),
                    CsvPreference.STANDARD_PREFERENCE);

            // the header elements are used to map the values to the bean (names must match)
            final String[] header = beanReader.getHeader(true);
            final CellProcessor[] processors = getProcessors();

            CustomerBean customer;
            while((customer = beanReader.read(CustomerBean.class, header, processors)) != null){
                System.out.println(String.format("lineNo=%s, rowNo=%s, customer=%s",
                        beanReader.getLineNumber(), beanReader.getRowNumber(), customer));
            }
        }finally{
            if(beanReader != null)beanReader.close();
        }
    }

    private static CellProcessor[] getPojoInfoProcessors(){
        final CellProcessor[] processors = new CellProcessor[]{
                new NotNull(),//字段名
                new NotNull(),//字段类型
                new Optional(),//是否为空
                new NotNull(),//备注说明
        };

        return processors;
    }

    public static void readPojoInfoWithCsvBeanReader() throws Exception {
        ICsvBeanReader beanReader = null;
        try{
            beanReader = new CsvBeanReader(new FileReader("D:\\log\\v_port_plate_test.csv"),
                    CsvPreference.EXCEL_PREFERENCE);

            // the header elements are used to map the values to the bean (names must match)
            final String[] header = beanReader.getHeader(true);
            final CellProcessor[] processors = getPojoInfoProcessors();

            PojoInfoBean pojoInfo;
            while((pojoInfo = beanReader.read(PojoInfoBean.class, header, processors)) != null){
                System.out.println(String.format("lineNo=%s, rowNo=%s, customer=%s",
                        beanReader.getLineNumber(), beanReader.getRowNumber(), pojoInfo));
            }
        }finally{
            if(beanReader != null)beanReader.close();
        }
    }
}