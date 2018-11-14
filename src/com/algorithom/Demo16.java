package com.algorithom;

import java.util.Scanner;

/**
 * 输入三个整数，X,Y,Z 请把这三个数按从小到大的顺序输出
 */
public class Demo16 {
    public static void main(String[] args) {
        System.out.println("输入三个数分别为：");
        Scanner one = new Scanner(System.in);
        Scanner two = new Scanner(System.in);
        Scanner three = new Scanner(System.in);
        int oneInt = one.nextInt();
        int twoInt = two.nextInt();
        int threeInt = three.nextInt();
        compare(oneInt,twoInt,threeInt);
    }
    public static void compare(int oneInt,int twoInt,int threeInt){
        int [] array ={oneInt,twoInt,threeInt};
        int i;
        int k;
        int j;
        for ( j=0;j<array.length-1;j++) {
            for (i = 0; i < array.length -j- 1; i++) {
                if (array[i] > array[i + 1]) {
                    k = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = k;
                }
            }
        }
        System.out.println("升序排列：");
        for (i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
