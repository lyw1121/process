package com.study;

public class reserves {
    public static void main(String[]args){
        String str = reserver("hello world");
        System.out.println(str);
        String ko = reversel("welcome to this");
        System.out.println(ko);
    }
    //实现对字符串的反转输出
    public static String reserver(String s){
        int length = s.length();
        StringBuffer result = new StringBuffer(length);
        for(int i=length-1;i>=0;i--){
          result.append(s.charAt(i));

        }
        return result.toString();
    }
    //通过reverse()方法实现
    public static String reversel(String k){
        return new StringBuffer(k).reverse().toString();
    }

}
