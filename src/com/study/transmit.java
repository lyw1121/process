package com.study;

public class transmit {
    public static void main(String[] args) {
        int a=2;
        int result01 = trans(5,a++);
        int result02 = trans(5+a,++a);
        System.out.println(result01);
        System.out.println(result02);
    }
    public static int trans(int number01,int number02){
        return number01+number02;
    }
}
