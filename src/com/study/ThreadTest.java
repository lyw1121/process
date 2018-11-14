package com.study;

//两个线程的运行情况  先后顺序
public class ThreadTest {
    public static void main(String[] args){
        Pig pig = new Pig(10);
        Bird bird = new Bird(10);
        //启动线程
        Thread s1 = new Thread(pig);
        Thread s2 = new Thread(bird);
        s1.start();
        s2.start();
    }
 }

 //创建一个猪类打印
class Pig implements Runnable{
    int times = 0;
    int n = 0;
    public Pig(int n){
        this.n = n;
    }
    public void run(){
        while (true){
            try {
                //时间睡眠一秒
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            times++;
            System.out.println("我是一个线程，正在输出第"+times+"个 hellow world");
            if(times==n){
                break;
            }
        }
    }
}
class Bird implements Runnable{
    int times = 0;
    int res = 0;
    int n = 0;
    public Bird(int n){
        this.n = n;
    }
    public void run(){
        while (true){
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            res+=(++times);
            System.out.println("第"+times+"次计算结果："+res);
            if (times==n){
                System.out.println("最终结果是："+res);
                break;
            }
        }
    }
}



