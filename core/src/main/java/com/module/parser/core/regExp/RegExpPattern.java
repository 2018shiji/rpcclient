package com.module.parser.core.regExp;

import java.util.regex.Pattern;


public class RegExpPattern {
    /**
     * 提取URL中的ip与端口号
     * MyPattern.GET_PORT.matcher(URL).group(1)
     * MyPattern.GET_PORT.matcher(URL).group(2)
     */
    public static final Pattern GET_PORT =
            Pattern.compile("(\\d+.\\d+.\\d+.\\d+):(\\d+)");

    /*
     ** 身份证号正则表达式
     ** 匹配身份证号，17个数字后面加一位大小写字母或数字
     ** 或者14位数字后面加一位大小写字母或数字
     */
    public static final Pattern ID_CARD =
            Pattern.compile("\\d{17}[0-9a-zA-Z]|\\d{14}[0-9a-zA-Z]");

    /*
     ** Email正则表达式
     ** QQ邮箱：7至10位的数字串加@qq.com字符串
     ** 1984415860@qq.com
     */
    public static final Pattern QQEmail =
            Pattern.compile("[1-9]\\d{7,10}@qq.com");

    /*
     ** Email正则表达式
     ** zhangsan-001@gmail.com
     ** [a-zA-Z0-9_-]+：任意多次若干字母，数字，下横线和中横线组成
     */
    public static final Pattern EMAIL_Y =
            Pattern.compile("^[a-zA-Z0-9_-]+@[a-zA-z0-9_-]+(.[a-zA-Z0-9_-]+)+$");

    /*
     ** Email正则表达式
     ** 李壮杰000Abc@lenovo.com.cn
     ** [\u4e00-\u9fa5]：汉字的正则范围
     */
    public static final Pattern EMAIL_Z =
            Pattern.compile("^[a-zA-Z0-9\u4e00-\u9fa5]+@[a-zA-z0-9_-]+(.[a-zA-Z0-9_-]+)+$");

    public static final Pattern ZHONG_WEN_ZI_FU =
            Pattern.compile("[\\u4E00-\\u9FA5]+");
}
