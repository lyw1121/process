package com.algorithom;

import org.junit.Test;

import java.util.Arrays;

public class Demo04 {
    
    //简单的选择排序
    public static void main(String[]args){
        int i;
        int j;
        int k;
        int arry[] = {8,3,12,6,21,1,7};
        System.out.println("排序之前:");
        System.out.println(Arrays.toString(arry));
        for( i= 0; i<arry.length-1; i++){
            int index = i;
            for( j= i+1; j<arry.length; j++){
                if(arry[j]<arry[index]){
                    index = j;
                }
            }

            k = arry[i];
            arry[i] = arry[index];
            arry[index] = k;
        }
        System.out.println("排序之后:");
        System.out.println(Arrays.toString(arry));
    }
    private static int a;
    @Test
    public void test(){
        Integer b=0;
        System.out.println(b.equals("a"));
    }
}
