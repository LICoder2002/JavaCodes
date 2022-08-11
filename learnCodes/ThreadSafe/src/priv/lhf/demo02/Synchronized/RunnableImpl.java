package priv.lhf.demo02.Synchronized;

import java.util.Objects;

/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    第一种解决方法：同步代码块
        synchronized(锁对象){
            可能出现线程安全的代码（访问了共享数据）
        }
    注意：
        1、通过代码块中的锁对象，可以使用任意对象
        2、但是必须保证多个线程使用的锁对象是同一个
        3、锁对象的作用是把同步代码块锁住，只让一个线程在同步代码块中执行
 */
public class RunnableImpl implements Runnable{
    //设置线程任务
    private int ticket = 100;

    //创建一个锁对象
    Object obj = new Object();

    @Override
    public void run() {
        while (true)
        {
            //同步代码块
            synchronized (obj)
            {
                if(ticket > 0)
                {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "---> 正在卖第" + ticket + "张票。");
                    ticket--;
                }
            }

        }

    }
}
