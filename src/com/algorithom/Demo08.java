package com.algorithom;

import java.util.Scanner;

//输入一个字符串对字符串中的字符进行遍历分类计算总和输出，分为数字、字母、空格、其他字符

public class Demo08 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] sentens = word.toCharArray();       //将字符串转换为字符赋给数组sentens
        count oc = new count();
        oc.counts(sentens);

    }
}
     //创建一个类计算出各个类比的总个数并打印
class count{
    public  void counts(char[] arrs) {
        int digital = 0;
        int characters = 0;
        int blank = 0;
        int others = 0;
        for (int i = 0; i <= arrs.length - 1; i++)
            if (arrs[i]>='0' && arrs[i]<='9'){
            digital++;
            }else if(arrs[i]>='a'&&arrs[i]<='z'||arrs[i]>='A'&&arrs[i]<='Z'){
                characters++;
            }else if(arrs[i]==' '){
                blank++;
            }else {
                others++;
            }
        System.out.println("数字的个数为："+digital);
        System.out.println("字母的个数为："+characters);
        System.out.println("空格的个数为："+blank);
        System.out.println("其他的字符个数为："+others);
    }
}

