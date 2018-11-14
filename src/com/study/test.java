package com.study;

public class test implements Runnable {
    int b=100;
    synchronized void m1() throws InterruptedException{             //实例锁synchronize并发下的内存可见性
        b=100;
        Thread.sleep(500);
        System.out.println("b="+b);
    }
    synchronized void m2() throws InterruptedException{
        Thread.sleep(250);
        b=2000;
    }
    public static void main(String[] args) throws InterruptedException{
        test tt = new test();         //创建一个对象tt
        Thread t = new Thread(tt);    //创建线程t 将对象tt传入到当线程中
        t.start();                    //启动线程
        tt.m2();
        System.out.println("main thread b ="+tt.b);
    }

    @Override
    public void run(){
        try{
            m1();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
