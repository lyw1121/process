package com.study;

import java.util.*;

public class ListTest {
    public static void main(String [] args){
        //创建list集合对象遍历输出
        List<String> sl = new ArrayList<String>();
        sl.add("hello");
        sl.add("this");
        sl.add("word");
        sl.add("word");
        for(String i : sl){
            System.out.println(i);
        }
        System.out.println("*******************************");
        //将集合转变为数组输出元素
        String [] arraylist = new String[sl.size()];
        sl.toArray(arraylist);
        for(int j = 0 ; j < arraylist.length;j++){
            System.out.println(arraylist[j]);
        }
        System.out.println("********************************");
        //创建迭代器 对集合进行遍历输出,创建iterator对象,调用其hasNext()方法查找集合迭代器容器中是否存在下一个元素
        Iterator<String> str = sl.iterator();
        while (str.hasNext()){
            System.out.println(str.next());
        }
        System.out.println("*************************************");     //使用list集合的contains方法
        if(sl.contains("nice")){
            System.out.println("成功找到对象！");
        }else {
            System.out.println("抱歉！");
        }
        System.out.println("<<<****************>>>");                    //set集合遍历
        Set<String> set = new HashSet<>(Arrays.asList("aa","bb","cc"));
        for (String e :set){
            System.out.println(e);
        }
        if (set.contains("bb")){
            System.out.println("set集合找到了！");
            System.out.println(set.contains("cc"));    //contains()方法是返回的是一个boolean类型的结果,即如果在集合中包含该对象则返回结果为true，反之为false
        }



    }
}
