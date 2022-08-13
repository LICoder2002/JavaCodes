package priv.lhf.demo02.WaitAndNotify;
/*
    进入到了TimeWaiting（计时等待）有两种方法
        1、使用sleep(long m) 方法，在毫秒值结束之后，线程唤醒进入到Runnable/Blocked状态
        2、使用wait(long m) 方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自动醒来进入到Runnable/Blocked状态

        唤醒方法：
            void notify（）唤醒在此对象监视器上等待的单线程。
            void notifyAll（）唤醒在此对象监视器上等待的所有线程。
 */
public class Demo02WaitAndNotify {
    public static void main(String[] args) {
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
                        System.out.println("顾客 1 告知老板要的包子和数量。");
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经好了，顾客 1 开吃");
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
                        System.out.println("顾客 2 告知老板要的包子和数量。");
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经好了，顾客 2 开吃");
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
                       //obj.notify();
                        obj.notifyAll();

                    }
                }
            }
        }.start();
    }
}
