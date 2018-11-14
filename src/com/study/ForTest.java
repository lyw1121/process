package com.study;

import java.util.LinkedList;
import java.util.List;

public class ForTest {

    public static void main(String[] args) {


        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 50000; i++) {
            list.add(11);
        }

        int resutl = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            resutl = list.get(i);
        }
        System.out.println("普通循环使用了"+ (System.currentTimeMillis() - start)+"毫秒");


        start = System.currentTimeMillis();
        for (int c2 : list) {
        }
        System.out.println("增强for循环使用了"+ (System.currentTimeMillis() - start)+"毫秒");
    }

}