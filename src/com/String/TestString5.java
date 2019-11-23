package com.String;

/**
 * @author wangyl
 * @date 2019/6/25 22:07
 */
public class TestString5 {
    private static String a = "ab";
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s = s1 + s2;
        System.out.println(s == a);                       // false  引用变量还没进行编译为对应的字符串
        System.out.println(s.intern() == a);              // true  s会在常量池中找是否有"ab"这个常量，若有则返回引用，否则创建新的对象
    }
}
