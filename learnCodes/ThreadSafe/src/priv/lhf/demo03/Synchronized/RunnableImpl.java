package priv.lhf.demo03.Synchronized;
/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全的第二种方法：使用同步方法
        1、把访问了共享数据的代码抽取出来，放到一个方法中
        2、在方法上添加synchronized修饰符

    格式：
        修饰符 synchronized 返回值类型 方法名（参数列表）{
            代码
        }

 */
public class RunnableImpl implements Runnable{
    //设置线程任务
    private static int ticket = 100;
    @Override
    public void run() {
        while (true)
        {
            //payTicket();
            payTicketStatic();
        }

    }

    //静态的同步方法 锁对象是本类的class属性
    public static /*synchronized void*/ void payTicketStatic()
    {
        synchronized (RunnableImpl.class){
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

    //同步方法  锁对象是this 也就是run
    public /*synchronized*/ void payTicket()
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
