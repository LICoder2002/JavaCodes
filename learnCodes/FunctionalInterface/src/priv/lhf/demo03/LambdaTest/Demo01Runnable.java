package priv.lhf.demo03.LambdaTest;
/*
    例如java.lang.Runnable 接口就是一个函数式接口
    假设有一个startThread方法使用该接口作为参数，那么就可以使用Lambda进行传参
    这种情况和Thread类得到构造方法参数Runnable没有本质区别。
 */
public class Demo01Runnable {
    public static void startThread(Runnable run){
        //开启多线程
        new Thread(run).start();
    }

    public static void main(String[] args) {
        //匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "--->" + "线程启动了");
            }
        });

        //Lambda表达式
        startThread(()->{
            System.out.println(Thread.currentThread().getName() + "--->" + "线程启动了");
        });


        //Lambda表达式优化
        startThread(()-> System.out.println(Thread.currentThread().getName() + "--->" + "线程启动了"));
    }
}
