package com.algorithom;

public class Demo10 {

    //一个数恰好等于它的因子之和，这个数称为“完数”>>  6=1+2+3  找出1000以内的完数
    public static void main(String[] args) {
        for (int i=1 ; i<1000; i++){
            int j=0;                                    //第一种方法
            int k=0;
            int sum=0;
            k=i;
            while (k>1){
               if (i%k==0){
                     j=i/k;
                     sum+=j;
                }
                k--;
            }
            if (i==sum){
               System.out.println(i);
            }
        }
        test02();
        test03();
    }


        public static void test02() {                            //第二种方法
            int s;
            for (int i = 1; i <= 1000; i++) {
                s = 0;
                for (int j = 1; j < i; j++)
                    if (i % j == 0)
                        s = s + j;
                if (s == i)
                    System.out.print(i + " " );
            }
            System.out.println();
        }

        public static void test03(){                              //第三种方法
            int i,j,sum;
            for(i=1;i<1000;i++)
            {
                sum = 0;
                for(j=1;j<=i/2;j++)
                {
                    if(i%j==0)
                    {
                        sum+=j;
                    }
                }
                if(sum==i)
                {
                    System.out.print(i+" its factors are:   ");
                    for(j=1;j<=i/2;j++)
                    {
                        if(i%j==0)
                            System.out.print(j+", ");
                    }
                    System.out.println();
                }
            }
        }
    }

