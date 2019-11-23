package com.study;

import java.util.Arrays;
import java.util.Scanner;

/*
* 简单选择排序
* */
public class SelectSort {
    public static void main(String[] args) {
        int [] arry = new int[] {3,2,1,6,9,8,5,7,4};
      //  Scanner scanner = new Scanner(System.in);
        selectsort(arry);
        System.out.println(Arrays.toString(arry));
    }
    static void selectsort(int[] a){
        for (int i=0;i<a.length;i++){       //遍历数列元素
            int minIndex = i;           //     先假设第一个元素是最小的 依次和其他元素比较 把数组下标赋给minIndex
            for (int j=i+1;j<a.length;j++){           //此循环遍历其他元素找出最小的数组下标赋值给minIndex
                if (a[j] < a[minIndex]){
                    minIndex = j;
                }
            }
            if (i != minIndex){           //判断 每比较完一轮后如果i!=mindex 即：最小元素不是最初假设的元素  则交换元素
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }
}
