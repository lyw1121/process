package com.study;

/**
 * @author wangyl
 * @date 2019/6/26 21:23
 */

/**
 *  new一个子类对象,先按顺序调用父类中的static修饰的方法属性，再执行构造代码块和构造器
 */
class HelloA {

    public HelloA() {
        System.out.println("HelloA");
    }
    { System.out.println("I'm A class"); }
    static { System.out.println("static A"); }
}

public class TestStatic extends HelloA {
    public TestStatic() {
        System.out.println("HelloB");
    }
    { System.out.println("I'm B class"); }
    static { System.out.println("static B"); }
    public static void main(String[] args) {
        System.out.println("-------------------");
        new TestStatic();
        new TestStatic();
        System.out.println("-------------------");
    }
}
