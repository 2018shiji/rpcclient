package com.module.parser.core.util;

import com.module.parser.core.regExp.RegExpPattern;
import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.iteye.com/blog/canrry-1344611
 * https://blog.csdn.net/qq_40083897/article/details/85779162
 */
public abstract class ChineseToSpellerUtil {

    /**获取中文汉字拼音 默认输出*/
    public static String getPinyin(String chinese){
        return getPinyinZh_CN(makekStringByStringSet(chinese));
    }

    /**拼音大写输出*/
    public static String getPinyinToUpperCase(String chinese){
        return getPinyinZh_CN(makekStringByStringSet(chinese)).toUpperCase();
    }

    /**拼音小写输出*/
    public static String getPinyinToLowerCase(String chinese){
        return getPinyinZh_CN(makekStringByStringSet(chinese)).toLowerCase();
    }

    /**首字母大写输出*/
    public static String getPinyinFirstToUpperCase(String chinese){
        return getPinyin(chinese);
    }

    /**拼音简拼输出*/
    public static String getPinyinJianPin(String chinese){
        return getPinyinConvertJianPin(getPinyin(chinese));
    }

    /**
     * @param chinese 中午汉字
     * @return
     */
    public static Set<String> makekStringByStringSet(String chinese) {
        char[] chars = chinese.toCharArray();
        if (chinese != null && !chinese.trim().equalsIgnoreCase("")) {
            char[] srcChar = chinese.toCharArray();
            String[][] temp = new String[chinese.length()][];
            for (int i = 0; i < srcChar.length; i++) {
                char c = srcChar[i];

                //是中文或者a-z或者A-Z转换拼音
                if (String.valueOf(c).matches(RegExpPattern.ZHONG_WEN_ZI_FU.pattern())) {
                    try {
                        temp[i] = PinyinHelper.toHanyuPinyinStringArray(chars[i], getDefaultOutputFormat());

                    } catch (BadHanyuPinyinOutputFormatCombination e) {
                        e.printStackTrace();
                    }
                } else if (((int) c >= 65 && (int) c <= 90) || ((int) c >= 97 && (int) c <= 122)) {
                    temp[i] = new String[]{String.valueOf(srcChar[i])};
                } else {
                    temp[i] = new String[]{String.valueOf(srcChar[i])};
                }
            }
            String[] pingyinArray = exchange(temp);
            Set<String> zhongWenPinYin = new HashSet<String>();
            for (int i = 0; i < pingyinArray.length; i++) {
                zhongWenPinYin.add(pingyinArray[i]);
            }
            return zhongWenPinYin;
        }
        return null;
    }

    /**
     * @return 默认输出格式
     */
    public static HanyuPinyinOutputFormat getDefaultOutputFormat() {
        HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
        format.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        format.setVCharType(HanyuPinyinVCharType.WITH_U_AND_COLON);
        return format;
    }

    public static String[] exchange(String[][] strJaggedArray) {
        String[][] temp = doExchange(strJaggedArray);
        return temp[0];
    }

    private static String[][] doExchange(String[][] strJaggedArray) {
        int len = strJaggedArray.length;
        if (len >= 2) {
            int len1 = strJaggedArray[0].length;
            int len2 = strJaggedArray[1].length;
            int newLen = len1 * len2;
            String[] temp = new String[newLen];
            int index = 0;
            for (int i = 0; i < len1; i++) {
                for (int j = 0; j < len2; j++) {
                    temp[index] = capitalize(strJaggedArray[0][i])
                            + capitalize(strJaggedArray[1][j]);
                    index++;
                }
            }
            String[][] newArray = new String[len - 1][];
            for (int i = 2; i < len; i++) {
                newArray[i - 1] = strJaggedArray[i];
            }
            newArray[0] = temp;
            return doExchange(newArray);
        } else {
            return strJaggedArray;
        }
    }

    /**
     * 首字母大写
     *
     * @param s
     * @return
     */
    public static String capitalize(String s) {
        char ch[];
        ch = s.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z')
            ch[0] = (char) (ch[0] - 32);
        String newString = new String(ch);
        return newString;
    }

    /**
     * 字符串集合转换字符串（逗号分隔）
     *
     * @param stringSet
     * @return
     */
    public static String getPinyinZh_CN(Set<String> stringSet) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        for (String s : stringSet) {
            if (i == stringSet.size() - 1) {
                str.append(s);
            } else {
                str.append(s + ",");
            }
            i++;
        }
        return str.toString();
    }

    /**
     * 获取每个拼音的简称
     * @param chinese
     * @return
     */
    public static String getPinyinConvertJianPin(String chinese) {
        String[] strArray = chinese.split(",");
        String strChar = "";
        for (String str : strArray) {
            char arr[] = str.toCharArray(); // 将字符串转化成char型数组
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] >= 65 && arr[i] < 91) || (arr[i] >= 48 && arr[i] <= 57)) { // 判断是否是大写字母 || 判断是否是数字
                    strChar += new String(arr[i] + "");
                }
            }
            strChar += ",";
        }
        return strChar;
    }

    public static String getPingyinNonMultiTone(String inputString) {

        //创建转换对象
        HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
        //转换类型（大写or小写）
        format.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        //定义中文声调的输出格式
        format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        //定义字符的输出格式
        format.setVCharType(HanyuPinyinVCharType.WITH_U_AND_COLON);

        //转换为字节数组
        char[] input = inputString.trim().toCharArray();
        // 用StringBuffer（字符串缓冲）来接收处理的数据
        StringBuffer output = new StringBuffer();

        try {
            for (int i = 0; i < input.length; i++) {
                //判断是否是一个汉子字符
                if (java.lang.Character.toString(input[i]).matches("[\\u4E00-\\u9FA5]+")) {
                    String[] temp = PinyinHelper.toHanyuPinyinStringArray(input[i], format);
                    output.append(temp[0]);
                } else {
                    // 如果不是汉字字符，直接拼接
                    output.append(java.lang.Character.toString(input[i]));
                }
            }
        } catch (BadHanyuPinyinOutputFormatCombination e) {
            e.printStackTrace();
        }
        return output.toString();
    }

    /**
     * 获取汉字串拼音，英文字符不变 【首字母大写】
     * @param chinese 汉字串
     * @return 汉语拼音
     */
    public static String getFullSpellNonMultiTone(String chinese) {
        // 用StringBuffer（字符串缓冲）来接收处理的数据
        StringBuffer sb = new StringBuffer();
        //字符串转换字节数组
        char[] arr = chinese.toCharArray();
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        //转换类型（大写or小写）
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        //定义中文声调的输出格式
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        //定义字符的输出格式
        defaultFormat.setVCharType(HanyuPinyinVCharType.WITH_U_AND_COLON);
        for (int i = 0; i < arr.length; i++) {
            //判断是否是汉子字符
            if (arr[i] > 128) {
                try {
                    sb.append(capitalize(PinyinHelper.toHanyuPinyinStringArray(arr[i], defaultFormat)[0]));
                } catch (BadHanyuPinyinOutputFormatCombination e) {
                    e.printStackTrace();
                }
            } else {
                // 如果不是汉字字符，直接拼接
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }


}
