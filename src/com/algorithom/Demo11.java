package com.algorithom;


      //一球从100米高度自由落下，每次落地后反弹原高度的一半，再落下，求第10次落地时共经过多少米，第10次反弹多高

public class Demo11 {
    public static void main(String[] args) {

        double sum = 100;
        double heigh = sum / 2;            //第一次反弹的高度
        for (int i = 2; i <= 10; i++) {
            sum = sum + heigh * 2;
            heigh /= 2;                        //第i次反弹的高度
        }
        System.out.println("第10次落地共经过：" + sum + "米");
        System.out.println("第10次反弹：" + heigh + "米");
    }
}
