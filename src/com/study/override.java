package com.study;

public class override {
    public static void main(String [] args){
     A classb = new B();
     System.out.println(classb.i);
     classb.test();


}
 static class A{
    public int i = 0;
    static {
        System.out.println("这是A中的静态代码块");
    }
     {
         System.out.println("A类");
     }
     public void test(){
        System.out.println("A");
     }
}
static class B extends  A{
    public int i = 1;
    static {
        System.out.println("这是B中的静态代码块");
    }
    {
        System.out.println("B类");
    }
    public void test(){
        System.out.println("B");
    }
 }
}