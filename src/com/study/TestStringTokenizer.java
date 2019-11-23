package com.study;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author wangyl
 * @date 2019/6/25 20:23
 */
public class TestStringTokenizer {
    public static void main(String[] args) {

        // 构造一个用来解析str的StringTokenizer对象，并提供一个指定的分隔符
        StringTokenizer stringTokenizer = new StringTokenizer("www.baidu.com", ".");
        int i=0;
        String[] array = new String[stringTokenizer.countTokens()];

        // 以下调用两种不同的遍历方法产生的结果是一样的，不同的是因为：hasMoreElements()方法是StringTokenizer实现了Enumeration接口的产物
       while (stringTokenizer.hasMoreTokens()){

           // 将取得的字符存放到数组中
           for (i = 0; i < array.length; i++){
               array[i] = stringTokenizer.nextToken();
           }
           System.out.println(Arrays.toString(array));
        }


//        while (stringTokenizer.hasMoreElements()){
//            System.out.println("token2:"+stringTokenizer.nextElement());
//        }
    }
}
