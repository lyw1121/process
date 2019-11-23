package com.String;

/**
 * @author wangyl
 * @date 2019/6/25 22:03
 */

/**
 * 当字符串字面值与String类型变量连接时，
 * 得到的新字符串不再保存在常量池中，而是在堆中新建一个String对象来存放。
 * 很明显常量池中要求的存放的是常量，有String类型变量当然不能存在常量池中了。
 */
public class TestString2 {
    public static void main(String[] args) {
        String a = "ab";
        String bb = "b";
        String b = "a" + bb;
        System.out.println(a == b);     // false  bb是引用变量
    }
}
