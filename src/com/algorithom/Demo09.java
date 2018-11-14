package com.algorithom;

import java.util.Scanner;

//计算几个数相加的和，相加个数、所要相加的数由键盘输入>>>>>>条件例如：s=1+11+111+1111+11111+......

public class Demo09 {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner digital_one = new Scanner(System.in);
        int firstDigital = digital_one.nextInt();
        System.out.println("请输入要计算的个数：");
        Scanner digital_two = new Scanner(System.in);
        int secondDigital = digital_two.nextInt();
        int sum=0;
        int dai = firstDigital;
        //循环相加求和
        for (int i =1;i<=secondDigital;i++){
            sum+= firstDigital;
            if(i==secondDigital){
                System.out.print(firstDigital);
            }else {
                System.out.print(firstDigital+"+");
                   }
           firstDigital= firstDigital*10 + dai;
        }
        System.out.println("="+sum);
    }
}
