package priv.lhf.demo01.Lambda;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "新的线程创建");
    }
}
