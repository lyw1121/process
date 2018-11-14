package com.study;

import java.util.Arrays;

public class quickSort {
    public static void main(String args[]) {
        int []a = new int[] {13,19,9,5,12,8,7,4,21,2,6,11};
        improvedQuickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    static int partition(int[] a,int p,int r) {
        int temp = a[r];
        int i = p-1;
        int swap = 0;
        for(int j = p;j < r;j++) {
            if(a[j]<temp) {
                i++;
                swap = a[i];   //交换,这里的交换用临时变量，因为可能要和自己做交换
                a[i] = a[j];
                a[j] = swap;
            }
        }
        swap = a[i+1]; //交换
        a[i+1] = a[r];
        a[r] =swap;
        return i+1;
    }
    static void improvedQuickSort(int[] a,int p,int r) {
        while(p<r) {
            int q = partition(a,p,r);
            improvedQuickSort(a,p,q-1); //先对左子序列进行QuickSort
            p = q + 1;                    //再对右子序列进行同样的操作
        }
    }
}

