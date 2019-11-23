package com.study;

/**
 * @author wangyl
 * @date 2019/6/26 21:45
 */
public class ZhiChuangDi {

    String str = new String("good");
    char[] ch = { 'a', 'b', 'c' };
    public static void main(String args[]) {
        ZhiChuangDi ex = new ZhiChuangDi();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }
    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'g';
    }
}
