package com.study;

/**
 * @author wangyl
 * @date 2019/6/19 22:51
 */
public class Teacher extends Person {
    int var = 12;
    public Teacher() {
        super();
    }

    public Teacher(int a) {
        System.out.println(a);
    }

    public void func() {
        System.out.println("2,");
    }

    public static void main(String[] args) {
        Person t1 = new Teacher();
        System.out.println(t1.var);     // 调用的是父类的属性
      //  System.out.println(t1.func());
        Teacher t2 = new Teacher(3);
        int play=5;
       //1:   play++;
       //2:   play=play++;
        System.out.println("#################################");
        System.out.println(play);          // 1:   6
        System.out.println(play);          // 2:   5
        System.out.println(play++);        // 3:   5
        System.out.println("********************************");
        float x = 10/4;
        System.out.println(x);      // 2.0
    }
}

class Person {
    int var = 55;
    public Person() {
        func();
    }

    public void func() {
        System.out.println("1,");
    }
}

