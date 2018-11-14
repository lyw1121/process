package com.algorithom;

/**
 *  打印以‘*’构成的菱形
 */
public class Demo19 {
    public static void main(String[] args) {
        for (int i = 1; i<=8 ; i++){
            for (int j = 1; j<=8-i; j++){
                                                    // for(int j=4-i; j>=0 ; j--){  :此种写法是在每一行都多加了一个空格
                System.out.print(" ");
            }
            for (int k = 1 ; k<=2*i-1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=7 ;i>=1 ;i--){
            for (int j=1; j<=8-i ; j++){
                System.out.print(" ");
            }
            for (int k=2*i-1 ; k>=1 ;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
