package com.algorithom;

      /**
       * 有1、2、3、4 几个数字，能组成多少种互不相同且无重复数字的三位数，都是多少？
       * 用到排列组合 4*3*2
       * */
public class Demo12 {
    public static void main(String[] args) {
        int i;
        int j = 0;
        int k = 0;
        int count=0;
        for (i=1;i<=4;i++) {
            for (j = 1; j <= 4; j++) {
                for (k = 1; k <= 4; k++) {
                    if (i != j && j != k && i != k) {
                        count++;
                        int outCount = i * 100 + j * 10 + k;
                        System.out.println("第"+count+"种：" + outCount);
                    }
                }
            }
        }
        System.out.println("共有：" + count + "种");
    }
}
