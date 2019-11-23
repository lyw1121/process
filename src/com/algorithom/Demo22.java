package com.algorithom;

import java.util.stream.Stream;

/**
 * @author wangyl
 * @date 2019/9/7 9:44
 */
public class Demo22 {

    /**
     * 利用递归方式求一个整形数的阶层
     * @param n
     * @return
     */

    public static long fac(int n) {
    long value = 0;
    if (n == 1 || n == 0) {
        value = 1;
    } else if (n > 1) {
        value = n * fac(n - 1);
    }
    return value;
}
    public static void main(String[] args) {
        System.out.println(9 + "的阶乘为：" + fac(9));
    }
}
