package com.study;

import java.lang.reflect.Constructor;
/*
*  反射的基本小demo
* */
public class FlectTest {
    public static void main(String[]args) throws Exception{
        Class clazz = null;
        clazz = Class.forName("com.study.Fruit");
        Constructor<Fruit> constructor1 = clazz.getConstructor();
        Constructor<Fruit> constructor2 = clazz.getConstructor(String.class);
        Fruit fruit1 = constructor1.newInstance();
        Fruit fruit2 = constructor2.newInstance("aaaa");

    }
}
class Fruit {
    public Fruit(){
        System.out.println("无参构造器.....");
    }
    public Fruit(String name){
        System.out.println("有参构造器....."+ name);
    }

}
