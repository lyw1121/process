package com.study;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Heapsort {
    /*
    * 堆排序demo
    * */
    static String str;
    public static void main(String[] args) throws IOException {
        int i=12;


        int total=0;
        for (int g=0;g<4;g++) {
            if (g == 1) continue;
            if (g == 2) break;
            total += g;
        }
        System.out.println(total);


            System.out.println(4 & 7);         //4
        System.out.println(12 - 11.9 == 0.1);//false
        System.out.println(args.length); //0
        Scanner scanner = new Scanner(System.in);
       /** BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        *String readLine = bufferedReader.readLine();  即为在键盘输入一个数的方法
        */
        System.out.println("输入一个数：");
        int i1 = scanner.nextInt();
        int [] array = new int[10];
        int j;
        for ( j=0;j<array.length;j++){
            array[j]= (int) (Math.random()*900+100);
            System.out.print(array[j]+" ");
        }
        System.out.println("*************************");
        System.out.println(i1);
        Random random = new Random();
        System.out.println("输出一个限定范围的数");
        int nextInt = random.nextInt(1000);
        System.out.println(nextInt);
        System.out.println("--------------------------");
        System.out.println(i+=i-=i*=i);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
        //String str;       //将报错，在方法中必须设置初始值，在类成员变量时属性会自动有默认的值；
        System.out.println("str:"+str);
        System.out.println("65"+2);
        int ss = 12;
        Integer integer = Integer.valueOf(ss);
        System.out.println(integer.toString());
        Double aDouble = Double.valueOf(ss);
        System.out.println(aDouble);
        double aa=-12.51;
        System.out.println(Math.round(aa));    //对于负数的四舍五入是逆向取值的，因为负数的数越大而值越小
        System.out.println(Math.sqrt(16));     //对值进行平方根
        System.out.println(Math.pow(2,6));     //求 2 的 6次方
        int  ui=13;
        System.out.println(ui/(2.0));           //两个数相除 结果的类型是由除数决定的
        switch ("di"){
            case "di":
                System.out.println("我就是啊");break;
            case "dd":
                System.out.println("不是我");break;
                                                    //在java8中switch中的变量可以是byte、boolean、short、int、string
        }
        int ki=12;
        System.out.println((++ki));
        int z=0;
        for (z++;z++<10;z++){
            System.out.println(++z);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("cdefg");
        System.out.println(stringBuffer.charAt(2)+"  "+stringBuffer.indexOf("g"));

        StringBuffer reverse = stringBuffer.reverse();
        System.out.println(reverse.toString());

    }
}
