package priv.lhf.demo04.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全的第三种方法：使用Lock锁
    java.util.concurrent.locks.lock接口
    方法：
        void lock() 获取锁
        void unlock() 释放锁
    java.util.concurrent.locks.ReentrantLock implements Lock接口
 */
public class RunnableImpl implements Runnable{
    //设置线程任务
    private int ticket = 100;
    // 1、在成员位置创建一个ReentrantLock对象
    Lock l = new ReentrantLock();

    @Override

    public void run() {
        while (true)
        {
            // 2、在可能出现安全问题的代码前调用lock接口中的方法lock获取锁
            l.lock();

            if(ticket > 0)
            {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "---> 正在卖第" + ticket + "张票。");
                    ticket--;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally {
                    // 3、在可能出现安全问题的代码后调用lock接口中的方法unlock释放锁
                    l.unlock();//无论程序释放异常都会释放锁
                }

            }

        }

    }
}


//    public void run() {
//        while (true)
//        {
//            // 2、在可能出现安全问题的代码前调用lock接口中的方法lock获取锁
//            l.lock();
//
//            if(ticket > 0)
//            {
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println(Thread.currentThread().getName() + "---> 正在卖第" + ticket + "张票。");
//                ticket--;
//            }
//            // 3、在可能出现安全问题的代码后调用lock接口中的方法unlock释放锁
//            l.unlock();
//        }
//
//    }
//}
