package com.algorithom;

import java.util.Scanner;

/**
 * 输入某年某月某日，判断这一天是这一年的第几天？
 */
public class Demo15 {
    public static void main(String[] args) {
        System.out.println("输入年月份：");
        Scanner years = new Scanner(System.in);
        Scanner month = new Scanner(System.in);
        Scanner days = new Scanner(System.in);
        int yn = years.nextInt();
        int mn = month.nextInt();
        int dn = days.nextInt();
        int counts =count(yn,mn,dn);
        System.out.println(yn+"年"+mn+"月"+dn+"日"+"是这年的第："+counts+"天");

    }
    public static int count(int years,int month,int day){
        int days=0;
        int sum=0;
        for (int i = 1; i<month ; i++){
            switch (i){
                case 1 :
                case 3 :
                case 5 :
                case 7 :
                case 8 :
                case 10 :
                case 12 :
                    days=31;
                    break;
                case 4 :
                case 6 :
                case 9 :
                case 11:
                    days=30;
                case 2 :
                    if (years%400==0||(years%4==0&years%100!=0)){         //判断闰年条件
                        days=29;                                          //闰年
                    }else{
                        days=28;                                          //平年
                    }
                    break;
            }
            sum+=days;
        }
         sum+=day;
        return sum;
    }
}
