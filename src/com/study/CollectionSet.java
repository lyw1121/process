package com.study;

import java.util.HashSet;

public class CollectionSet {
    public static void main(String[]args){
        HashSet<Integer> result = new HashSet<Integer>();
        HashSet<Integer> set1 = new HashSet<Integer>(){
           private static final long serialVersionUID = 1L;

            {
                add(1);
                add(2);
                add(5);
                add(10);
            }
        };
        HashSet<Integer> set2 = new HashSet<Integer>(){
            private  static final  long serialVersionUID = 1L;

            {
                add(1);
                add(5);
                add(8);
                add(12);
            }
        };
        //求交集
        result.addAll(set1);
        result.retainAll(set2);
        System.out.println("交集："+result);
        //求差集
        result.addAll(set1);
        result.removeAll(set2);
        System.out.println("差集："+result);
        //求并集
        result.addAll(set1);
        result.addAll(set2);
        System.out.print("并集："+result);
    }
}
