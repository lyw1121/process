package com.algorithom;
import java.util.Scanner;
/*
   最大公约数和最小公倍数的求解——————》利用辗除法
 */
public class Demo02 {
    public static void main(String[] args){
        int a;
        int b;
        int m;
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        a=in.nextInt();
        System.out.println("再输入一个正整数：");
        b=in.nextInt();
        commonDivisor use=new commonDivisor();
        m=use.changeOn(a,b);
        n=a*b/m;
        System.out.println("最大公约数："+m);
        System.out.println("最小公倍数："+n);
    }
}
class commonDivisor{
    public int changeOn(int x,int y){
        if(x<y){
            int t=x;
            x=y;
            y=t;
        }
        while(y!=0){
            if(x==y)
                return x;
            else{
                int k=x%y;    // 6  4  辗除法->最大公约数：以判断y为主当y=0时跳出循环，当x能整除y时 即k=0跳出循环 否则继续循环直至y=0跳出循环
                x=y;
                y=k;
            }
        }
        return x;
    }
}