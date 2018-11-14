package com.study;

public class ZhuangXiang {

    //整形装箱内部原理实现
    public static void main(String[] args) {
        Integer s1 = 100;
        Integer s2 = 100;
        Integer s3 = 200;
        Integer s4 = 200;
        /**
           上面装箱过程调用了valueOf()方法   Integer s1 = Integer.valueOf(100);
            源码：
              public static Integer valueOf(int i) {
                    return  i >= 128 || i < -128 ? new Integer(i) : SMALL_VALUES[i + 128];}
            三目运算符前者等价于：变量在<-128,128>之间 第一个首先会先创建一个对象，再初始化变量；第二个传入的是String类型变量，先把它转化成int型变量再初始化
            在内存中只创建了一个对象，占用了一个位置的内存
            三目运算符后者等价于：变量<-128 || 变量>128   它属于一个静态Integer 数组对象，返回的都是一个Integer对象，每new一个对象都占用内存一个位置



           当为浮点类型时 范围不确定 与上述不符 每次都创建一个不同的对象
         **/
        System.out.println(s1==s2);  //true
        System.out.println(s3==s4);  //false
        System.out.println("-----------------------------------------------------------------");

             /**public static Boolean valueOf(boolean b) {
                      return b ? Boolean.TRUE : Boolean.FALSE;
                  返回的都是相同的对象
                */
        Boolean i1 = false;
        Boolean i2 = false;
        Boolean i3 = true;
        Boolean i4 = true;
        System.out.println(i1==i2);//true
        System.out.println(i3==i4);//true
        System.out.println("-------------------------------------------------------------------");

        /**
         *    1.说明num1==num2 进行了拆箱操作;
         *    2.num1.equals(num2)操作：源码equals(object o）方法中参数是传入一个object 对象，在这里int类型要先进行装箱操作，然后进行比较，比较的是对象的内容;
         *    源码：
         *       public boolean equals(object o){
         *           return (o instanceof Integer)&&(((Integer) o).value==value);
         *       }
         */
        Integer num1 = 200;
        int num2 = 200;
        System.out.println(num1==num2);    //true
        System.out.println(num1.equals(num2));    //true
        /**
         * 对一个基本数据类型做==、+、-、*、/运算时 ，会将封装类进行拆箱，对基本数据类型进行运算
         *
         */
        Integer v1 = 100;
        int v2 = 100;
        Long v3 = 200L;
        Integer v4 = 100;
        System.out.println(v1+v2);   //200
        System.out.println(v3==(v1+v2));   //true
        System.out.println(v3.equals(v1+v2));    //false  ,原因：必须满足类型和内容相同
        System.out.println(v3==(v1+v4));   // true
    }
}
