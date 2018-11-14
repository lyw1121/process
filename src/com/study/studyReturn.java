package com.study;

import java.util.Random;

public class studyReturn {
    static int like(){
        Random it= new Random();
        int a = it.nextInt(100);
        return a;
    }
    static void mathStudy(){
        int i;
        int j;
        for(i=1;i<10;i++){
            for(j=1;j<=i;j++){
                System.out.print(j + "*" + i + "=" + i*j + " " );
            }
            System.out.println();
        }

    }

    public static void main( String [] args){
        int a= like();
        System.out.println(a);

        mathStudy();
    }
}
