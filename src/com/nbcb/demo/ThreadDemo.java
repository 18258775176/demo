package com.nbcb.demo;

//这是一个多线程测试程序
class ThreadTest implements Runnable{
    private Thread t;
    private String ThreadName;


    public ThreadTest(String name){
        System.out.println("creat thread:" + name);
        this.ThreadName = name;
    }
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(ThreadName + ":" + i);
                Thread.sleep(5);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void start(){
        System.out.println("start thread:" + ThreadName);
        if(t == null){
            t = new Thread(this, ThreadName);
            t.start();
        }
    }
}

//主程序入口
public class ThreadDemo {
    //main
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest("111111");
        t1.start();

        ThreadTest t2 = new ThreadTest("222222");
        t2.start();
    }
}