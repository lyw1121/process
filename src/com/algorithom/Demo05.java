package com.algorithom;

import java.util.Scanner;

public class Demo05 {

    //简单的递归算法例子
    public static void main(String[]args){
        //求出 10!的值，即10*9*8*7*.......*1
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=a ;i>0 ;i--) {
            if( i==1){
                System.out.print(i);
        }else {
            System.out.print(i + "*");
        }
        }
        System.out.println("="+digui(a));
    }
    public static int  digui(int k){
        if(k == 1){
            return 1;
        }else{
            int sum;
            sum = k*digui(k-1);
            return sum;

        }
    }
}
