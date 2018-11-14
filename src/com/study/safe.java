package com.study;

class carry{
    String name;
    private int age;
    void isTure(){
        System.out.println("我的名字是："+name+"我今年"+age+"岁了");
    }
    void setAge(int a) {
        if (a > 0) {
            age = a;
        } else {
            System.out.println("输入信息有误");
        }
    }
}
public class safe {
    public static void main(String [] args){
        carry user = new carry();
        user.name = "nihao";

        user.setAge(-10);
        user.isTure();
    }
}
