package priv.lhf.demo01.ThreadSafe;
/*
    实现卖票案例
 */
public class RunnableImpl implements Runnable{
    //设置线程任务
    private int ticket = 100;
    @Override
    public void run() {
        while (true)
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
