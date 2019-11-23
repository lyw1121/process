package com.String;

/**
 * @author wangyl
 * @date 2019/6/25 21:55
 */

/**
 * 关于String笔试题总结
 */
public class TestString1 {
    static String ss;
    public static void main(String[] args) {
        String k = new String("ddd");
        String f = k;
        String a = "a1";
        String b = "a"+1;
        System.out.println(k == f);      // true
        System.out.println(a == b);      // true ：b中两个都是常量拼接后和a相等，
        System.out.println(ss);
    }                                    // 当两个字符串字面值连接时（相加），得到的新字符串依然是字符串字面值，保存在常量池中
}
