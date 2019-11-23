package com.study;

import java.util.Arrays;


public class ChaRuSort {
    public static void main(String[] args) {
        int [] array = new int[] {2,1,4,8,6,7,9,6,8};
        System.out.println(Arrays.toString(array));
        System.out.println("进行插入排序");
        chaRuSort(array);
        System.out.println(Arrays.toString(array));
    }
    
    public static void chaRuSort(int [] array){
     // 插入排序从数组下标的第一位即第二个元素开始比较，因为默认前面的元素是有序的
        for(int i=1; i<array.length; i++){
            //如果当前的元素比前一个元素小则向前移动遍历，
            if (array[i]<array[i-1]){
                //将当前的元素赋值给中间变量
                int temp = array[i];
                int j;
                //开始遍历比较当前元素之前的元素
                for (j=i-1; j>=0&&array[j]>temp;j--){
                    array[j+1] = array[j];
                }
                array[j+1] = temp;
            }
        }
    }
}
