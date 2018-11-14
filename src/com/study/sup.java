package com.study;
class fat{
    private int age;
    private String name;
    fat(int age,String name){
        this.age = age;
        this.name = name;
    }
     public String  getname(){
        return name ;
    }
    public int getage(){
         return  age;
    }
}
public class sup extends fat {
    String coler;
    sup(String coler,int age,String name){
        super(10,"皮皮虾");
        this.coler = coler;
    }
    public static void main (String [] args){
        sup ni = new sup("黄色",10,"皮皮虾");
        System.out.println(ni.getname());
        System.out.println(ni.getage());
        System.out.println(ni.coler);




    }
}
