package priv.lhf.demo01.WaitAndNotify;
/*
    生产者：包子铺类，是一个线程类，可以继承Thread
    设置线程任务run：生成包子
    true:有包子
        包子铺调用wait方法进入等待状态
    false：没有包子
        包子铺生产包子
        交替生产两种包子
    生产好包子修改状态为true，唤醒吃货进程，让其吃包子

    注意：
        包子铺线程和包子线程关系 ——通信（互斥）
        必须使用同步技术保证两个线程只有一个在执行
        锁对象必须保证唯一，可以使用包子对象作为锁对象
 */
public class BaoZiPu extends Thread{
    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while(true)
        {
            synchronized (bz) {
                if(bz.flag) {
                    //        包子铺调用wait方法进入等待状态
                    try{
                        bz.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }

                //被唤醒之后执行，生产包子
                //交替生产两种包子
                if(count%2==0){
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                }else{
                    bz.pi = "冰皮";
                    bz.xian = "牛肉馅";
                }

                count++;

                System.out.println("包子铺正在生产包子：" + bz.pi + bz.xian + "包子。");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                //修改包子状态
                bz.flag = true;
                //唤醒吃货线程
                bz.notify();
                System.out.println("包子铺已经生产好了：" + bz.pi + bz.xian + "包子，吃货可以开始吃了");

            }
        }

    }
}
