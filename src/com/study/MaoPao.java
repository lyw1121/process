package com.study;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaoPao {
    public static void main(String [] args){
        TestSort mp = new TestSort();
        mp.maopao();
    }
}
class TestSort{
    public void maopao(){
        int i;
        int j;
        int k;
        int [] array = {1 ,23 ,8 ,12 ,6 ,10 ,30 ,16};
        for(i = 0; i<array.length-1; i++){
            for (j = 0; j<array.length-i-1 ; j++){
                if(array[j+1]<array[j]){
                    k = array[j+1];
                    array[j+1] = array[j];
                    array[j] = k;
                }
            }
        }
        System.out.println("冒泡升序排列：");
        for(j = 0 ; j<array.length ; j++)
            System.out.print(array[j]+" ");
       // System.out.print(Arrays.toString(array));
    }

}
