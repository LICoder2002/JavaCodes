package priv.lhf.demo01.WaitAndNotify;
/*
    消费者（吃货）类：是一个线程类，可以继承Thread
    设置线程任务run：吃包子
    false:没有包子，吃货调用wait方法进入等待状态
    true: 有包子，吃包子，吃完修改包子的状态为false，唤醒包子铺线程，生产包子
 */
public class ChiHuo extends Thread{
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true)
        {
            //使用同步技术保证两个线程只能有一个执行
            synchronized (bz)
            {
                if(!bz.flag)
                {
                    //    false:没有包子，吃货调用wait方法进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                //被唤醒之后，吃包子
                System.out.println("吃货正在吃：" + bz.pi + bz.xian + "包子。");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                bz.flag = false;
                //唤醒包子铺线程，生产包子
                bz.notify();
                System.out.println("吃货已经把：" + bz.pi + bz.xian + "的包子吃完了，包子铺已经开始生产包子了。");
                System.out.println("==============================================================");
            }
        }
    }
}
