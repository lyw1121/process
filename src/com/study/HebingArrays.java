package com.study;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author wangyl
 * @date 2019/7/3 23:34
 */
public class HebingArrays {
    public static void main(String[] args) {
        String[] array01 = {"hello","good","evening"};
        String[] array02 = {"yam","very","nice"};
        int array01Length = array01.length;
        int array02Length = array02.length;
        array01 = Arrays.copyOf(array01,array01Length+array02Length);  // 数组扩容

        // arraycopy(原数组，从元数据的起始位置开始，目标数组，目标数组开始起始位置，要copy的数组长度)
        System.arraycopy(array02,0,array01,array01Length,array02Length);
        System.out.println(Arrays.toString(array01));
        System.out.println("-----------------------");
        System.out.printf("%d",array01Length);
        //String[] newArrays = new String[array01.length+array02.length];
    }
}
