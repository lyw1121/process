package com.algorithom;
import java.util.Scanner;
/*
   正整数分解质因数，example:输入90  打印90 = 2*5*3*3
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入N的值：");
        int N = in.nextInt();
        System.out.print( "分解质因数：" + N +"=");
        new Demo01().fenjie(N);
    }
    public Demo01() {
        super();
    }
    public void fenjie(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i);
                if(n!=i){
                    System.out.print("*");
                }
                fenjie(n/i);       //递归调用fenjie()方法
            }
        }
        System.exit(0);         //回到最上层，正常在JVM中结束程序的运行
    }

}