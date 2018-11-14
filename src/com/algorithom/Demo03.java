package com.algorithom;

import java.util.Scanner;

public class Demo03 {

    //二分查找小算法

    public static void main(String[] args) {
        int[] arry = {1, 3, 5, 7, 9, 11};
        //int key = 4;
        System.out.println("输入一个数：");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        int position = twofen(arry, key);
        if (position == -1) {
            System.out.println("查找的是" + key + ",序列中没有该数！");
        } else {
            System.out.println("查找的是" + key + ",找到位置为：" + position);
        }
    }

    public static int twofen(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }
        while (low <= high) {              //while循环条件不能是：low<heigh 或 low!=heigh  因为 这样会取不到数组最后一个数
            mid = (low + high) / 2;        //  要为：[low,heigh]    两边都取闭区间
            if (arr[mid] > key) {
                high = mid - 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;        //最后仍然没有找到，则返回-1
    }
}
