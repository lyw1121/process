package com.algorithom;


/**
 * 一个整数加上100后是一个完全平方数，加上168又是一个完全平方数，请问该数是多少？
 * 完全平方数：1、4、9、16......
 */
public class Demo14 {
    public static void main(String[] args) {
        int number;
        for(number= 0 ; ;number++){          //Math.sqrt()方法是求一个数的开方；
            if (Math.sqrt(number+100)%1==0)
                if (Math.sqrt(number+168)%1==0)
                    System.out.println("这个数是："+number);
        }
    }
}
