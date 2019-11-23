package com.study;

import java.util.Arrays;

/*
* 快速排序demo
* */
public class quickSort {
    public static void main(String args[]) {
        int []a = new int[] {13,19,9,5,12,8,7,4,21,2,6,11,0};
        improvedQuickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
//    static int partition(int[] a,int p,int r) {
//        int temp = a[r];
//        int i = p-1;
//        int swap = 0;
//        for(int j = p;j < r;j++) {
//            if(a[j]<temp) {
//                i++;
//                swap = a[i];   //交换,这里的交换用临时变量，因为可能要和自己做交换
//                a[i] = a[j];
//                a[j] = swap;
//            }
//        }
//        swap = a[i+1]; //交换
//        a[i+1] = a[r];
//        a[r] =swap;
//        return i+1;
//    }
//    static void improvedQuickSort(int[] a,int p,int r) {
//        while(p<r) {
//            int q = partition(a,p,r);
//            improvedQuickSort(a,p,q-1); //先对左子序列进行QuickSort
//            p = q + 1;                    //再对右子序列进行同样的操作
//        }
//    }

    static void improvedQuickSort(int[] b,int start,int end){
        if (start<end){      //做判断原因：避免死循环，作为递归的结束条件 即开始元素和结尾元素之间要有元素
         int low = start;     //将第一次排序的起始位置和结尾位置赋值给带标记的low、high位置
         int high = end;
         int standard = b[start];             //将数组的起始位置作为基准数，不能是b[0]，因为递归后将分成多个数列排序，每个数列的基准数不同
            while (low<high){       //当low和high没有指向同一个元素时，进入循环
                while (low<high && b[high]>=standard){         //high位置的元素比基准数大时循环 ，向前走一位
                    high--;
                }
                b[low] = b[high];                               //high位置的元素比基准数小时，替换
                while (low<high && b[low]<standard){           //替换之后 判断low位置元素与基准数比较
                    low++;
                }
                b[high]=b[low];
            }
            b[low] = standard;                         //循环一遍结束后，将基准数赋值给low或high位置，  因为此时low位置和high位置的元素是同一个
            improvedQuickSort(b,start,low);          //递归 前面的数列
            improvedQuickSort(b,low+1,end);     //递归 后面的数列
        }
    }
}


