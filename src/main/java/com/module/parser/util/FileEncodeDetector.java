package com.module.parser.util;

import info.monitorenter.cpdetector.io.*;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.*;
import java.nio.charset.Charset;

@Component
public class FileEncodeDetector {

    public static String getFileEncode(String path){
        CodepageDetectorProxy detector = CodepageDetectorProxy.getInstance();
        /**
         * ParsingDetector可用于检查HTML、XML等文件或字符流的编码
         * 构造方法中的参数用于指示是否显示探测过程的详细信息
         */
        detector.add(new ParsingDetector(true));
        /**
         * JChardetFacade封装了由Mozillaz组织提供的HJchardet，它可以完成大多数文件的编码测定。
         * 支持额外多加几个探测器，比如下面的ASCIIDetector、UnicodeDetector等
         */
        detector.add(JChardetFacade.getInstance());
        detector.add(ASCIIDetector.getInstance());
        detector.add(UnicodeDetector.getInstance());

        Charset charset = null;
        try{
            InputStream is = new BufferedInputStream(new FileInputStream(path));
            charset = detector.detectCodepage(is, 8);
        } catch (Exception e){e.printStackTrace();}

        String charsetName = null;
        if(charset != null){
            if(charset.name().equals("US-ASCII"))
                charsetName = "ISO_8859-1";
            else
                charsetName = charset.name();
        }
        return charsetName;
    }

    public static String changeISO8859ToUTF8(String str){
        try{
            if(str != null && str.equals(new String(str.getBytes("ISO-8859-1"), "ISO-8859-1"))){
                return new String(str.getBytes("ISO-8859-1"), "UTF-8");
            }
            return str;
        } catch (UnsupportedEncodingException e){
            throw new RuntimeException("字符串转换异常！");
        }
    }
}
