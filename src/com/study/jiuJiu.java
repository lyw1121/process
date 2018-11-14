package com.study;

public class jiuJiu {
    public static void main(String[] args) {
        int i;
        int j;
        System.out.println("现在打印出九九乘法表：");
        for (i=1; i<10; i++){
            for (j=1 ;j<=i; j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");     //  \t是制表符
            }
            System.out.println();
        }
    }
}
