package com.algorithom;

import java.util.Scanner;

/**
 *  题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，
 *       低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；
 *       40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，
 *       高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润lirun，求应发放奖金总数sum？
  */

public class Demo13 {
    public static void main(String[] args) {
        double sum;
        System.out.println("输入当月利润：(万元)");
        Scanner in = new Scanner(System.in);
        double profit = in.nextDouble();
        if (profit <= 10) {
            sum = profit * 0.1;
        } else if (profit <= 20) {
            sum = 10*0.1 + (profit - 10) * 0.075;
        } else if (profit <= 40) {
            sum = 10*0.1 + 10*0.075 + (profit - 20) * 0.05;
        } else if (profit <= 60) {
            sum = 10*0.1 + 10*0.075 + 10*0.05 + (profit - 40) * 0.03;
        } else if (profit <= 100) {
            sum = 10*0.1 + 10*0.075 + 10*0.05 + 10*0.03 + (profit - 60) * 0.015;
        } else {
            sum = 10*0.1 + 10*0.075 + 10*0.05 + 10*0.03 + 10*0.015 + (profit - 100) * 0.01;
        }
        System.out.println("应发的奖金是："+sum+"(万元)");
    }
}
