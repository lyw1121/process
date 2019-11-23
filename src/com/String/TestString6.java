package com.String;

/**
 * @author wangyl
 * @date 2019/6/25 22:11
 */
public class TestString6 {
    private static String a = new String("ab");
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s = s1 + s2;
        System.out.println(s == a);                         // false
        System.out.println(s.intern() == a);                // fase   新new的对象
        System.out.println(s.intern() == a.intern());       // true
    }
}
