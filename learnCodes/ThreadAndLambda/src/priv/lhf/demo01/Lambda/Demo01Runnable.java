package priv.lhf.demo01.Lambda;

public class Demo01Runnable {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();

        Thread t = new Thread(run);

        t.start();

        //简化代码，使用匿名内部类
       Runnable r =  new Runnable(){

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新的线程创建");
            }
        };

       new Thread(r).start();


       //继续简化
        new Thread( new Runnable(){

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新的线程创建");
            }
        }).start();

    }
}
