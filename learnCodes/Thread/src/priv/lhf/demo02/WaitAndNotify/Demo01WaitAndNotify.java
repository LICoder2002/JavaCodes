package priv.lhf.demo02.WaitAndNotify;
/*
    等待唤醒案例：线程之间的通信
        创建一个顾客线程：告知老板要的包子种类和数量，调用wait方法，放弃cpu执行，进入WAIRTING状态（无限等待状态）
        创建一个老板线程：花费5秒做包子，做好之后调用notify方法，唤醒顾客
 */

import java.util.Objects;

public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象
        Object obj = new Object();
        //创建一个顾客线程
        new Thread()
        {
            @Override
            public void run() {
                while(true)
                {
                    //保证等待和唤醒的线程只有一个在执行
                    synchronized (obj)
                    {
                        System.out.println("告知老板要的包子和数量。");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经好了，开吃");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("====================");
                    }
                }
            }
        }.start();

        //创建一个老板线程
        new Thread(){
            @Override
            public void run() {
                while(true)
                {
                    //花费5秒做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //保证等待和唤醒的线程只有一个在执行
                    synchronized (obj)
                    {
                        System.out.println("老板做好包子之后，告知顾客");
                        //做好之后调用notify方法，唤醒顾客
                        obj.notify();

                    }
                }
            }
        }.start();
    }
}
