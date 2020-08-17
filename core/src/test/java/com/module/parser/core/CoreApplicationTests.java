package com.module.parser.core;

import com.module.parser.core.picocli.BindGenCli;
import com.module.parser.core.util.ChineseToSpellerUtil;
import com.module.parser.core.util.FileEncodeDetectorUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

@SpringBootTest
class CoreApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testFileEncodeDetector() {
        String fileEncode = FileEncodeDetectorUtil.getFileEncode("D:\\log\\v_port_plate.csv");
        System.out.println("该文件编码格式为: " + fileEncode);
    }

    @Test
    void testPinyin(){
        String str = "深圳银行";
        System.out.println("小写输出：" + ChineseToSpellerUtil.getPinyinToLowerCase(str));
        System.out.println("大写输出：" + ChineseToSpellerUtil.getPinyinToUpperCase(str));
        System.out.println("首字母大写输出：" + ChineseToSpellerUtil.getPinyinFirstToUpperCase(str));
        System.out.println("简拼输出：" + ChineseToSpellerUtil.getPinyinJianPin(str));
    }

    @Test
    void testIII() throws Exception{
        File sourceFile = new File("D:\\log\\v_port_plate.csv");
        File dsFile = new File("D:\\log\\v_port_plate_backup2.csv");
        FileReader reader = new FileReader(sourceFile, Charset.forName("GBK"));
        FileWriter writer = new FileWriter(dsFile);
        int result;
        while((result = reader.read()) != -1){
            if(result > Long.parseLong("4e00", 16) && result < Long.parseLong("9fa5", 16)){
                char[] chars = ChineseToSpellerUtil.getPingyinNonMultiTone(String.valueOf((char) result)).toCharArray();
                writer.write(chars);
                for (int i = 0; i < chars.length; i++) {
                    System.out.print(chars[i]);
                }
                System.out.println();
            } else {
                writer.write(result);
            }
        }
        reader.close();
        writer.close();
    }

    @Test
    void testBindGenCli(){
        String extJar = "-cp=D:\\software\\jars\\jibx1.3.3\\jibx\\lib\\jibx-tools.jar;bin org.jibx.binding.generator.BindGen";
        String output = "-t=C:\\Users\\lizhuangjie.chnet\\IdeaProjects\\parser\\xml\\src\\main\\resources\\jibx";
        String targetClass = "com.module.parser.xml.pojo.OrderBean11";
        new BindGenCli().executeCmd(extJar, output, targetClass);
    }

}
