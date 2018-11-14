package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class qstop {
    public static void main(String[]args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char c ;
        do{
            c = (char)bufferedReader.read();
            System.out.println(c);
        }while (c !='q');
    }
}
