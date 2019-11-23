package com.study;

import java.util.ArrayList;
import java.util.List;

public class neiBuLei {
  /**  class information{
        private int age;
        private String location;
        information(int age,String location){
            this.age = age;
            this.location = location;
        }
        public void buk(){
            System.out.println(age+"welcome to the place:"+location);
        }

    }
    public void test(String info){
        information neif = new information(20,info);
        neif.buk();
    }

    public static void main(String[] args) {
        neiBuLei diaoy = new neiBuLei();
        diaoy.test("nanchang");
    }
   **/
  int logcal=9;
  class inner{
      int logcal=8;
      public void des(){
          int logcal = 7;
          System.out.println(logcal);                    // 7
          System.out.println(this.logcal);               // 8
          System.out.println(neiBuLei.this.logcal);      // 9  内部类中有外部类的一个引用 括号中即是调用格式
          test();                        //在一个外部类中可以调用private定义的方法
      }
  }
  private void test(){
      System.out.println("test");
  }

    public static void main(String[] args) {
                                                       //先new 外部类再new 内部类
        inner inn = new neiBuLei().new inner();        //若内部类inner 为static修饰 则 可写为：
        inn.des();//  new neiBuLei().new inner().des();即可
        neiBuLei nei = new neiBuLei();
        nei.test();
        System.out.println("内部类的方法实现:外部类与内部类的访问过程 即；");
        /**
         * 小结：
         *      外部类访问内部类：必须创建内部类的对象；
         *      内部类访问外部类：内部类可以访问外部类的的成员，包括private修饰的成员，因为外部类持有内部类的引用
         *      特例（内部类写在外部类的方法中（即局部变量的位置））:
         *          1.内部类和外部类均可定义变量和常量；
         *          2.只能被 final/abstact修饰；
         *          3.只能访问被 final/abstract修饰的变量；
         *          4.可以访问外部类的成员，因为还持有外部类的引用；
         *
         */
    }
}
