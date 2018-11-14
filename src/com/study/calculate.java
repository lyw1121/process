package com.study;

import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        double k;
        System.out.println("请输入两个数：");
        Scanner word = new Scanner(System.in);
        double a = word.nextDouble();
        String code = word.next();
        char j = code.charAt(0);
        double b = word.nextDouble();
        switch (j) {
            case '+':
                k = a + b;
                System.out.print("=" + k);
                break;
            case '-':
                k = a - b;
                System.out.print("=" + k);
                break;
            case '*':
                k = a * b;
                System.out.print("=" + k);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("除数不能为0");
                }
                else {
                    k = a / b;
                    System.out.print("=" + k);
                }
        }


    }
}
