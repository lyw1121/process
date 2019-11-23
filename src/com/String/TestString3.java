package com.String;

/**
 * @author wangyl
 * @date 2019/6/25 22:04
 */
public class TestString3 {
    public static void main(String[] args) {
        String a = "ab";
        final String bb = "b";
        String b = "a" + bb;
        System.out.println(a == b);        // true   字符串字面值与String类型常量连接，得到的新字符串依然保存在常量池中。
    }
}
