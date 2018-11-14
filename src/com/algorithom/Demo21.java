package com.algorithom;

/**
 * 题目：求 1!+2!+3!+.....+20! 的和
 */
public class Demo21 {
    public static void main(String[] args) {
        long sum=0;
        long k = 1;
        for (int i = 1; i<=20; i++){
            k*=i;                          //累乘
            sum+=k;
        }
        System.out.println("结果："+sum);
    }
}
