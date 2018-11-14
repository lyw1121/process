package com.algorithom;

/**
 * 题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
 *
 */
public class Demo20 {
    public static void main(String[] args) {
        double k = 2;
        double y = 1;
        double sum = 0;
        double a1 = k/y;
        for (int i =0; i<20; i++){
           sum+=a1;
           a1=(k+y)/k;
           double j=k+y;
           y=k;
           k=j;
        }
        System.out.println("此数列的和为："+sum);
    }
}
