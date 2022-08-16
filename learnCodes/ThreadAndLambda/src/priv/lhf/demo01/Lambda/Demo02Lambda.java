package priv.lhf.demo01.Lambda;

/*
    lambda表达式的标准格式：
        由三部分组成：
            a. 一些参数
            b. 一个箭头
            c. 一段代码
        格式：
            （参数列表） -> {一些重写方法的代码};
        解释：
            (): 接口中抽象方法的参数列表，没有参数，就空着; 有参数就写出参数，多个参数用逗号隔开
            ->: 传递的意思，把参数传递给方法体{}
            {}: 重写接口1抽象方法的方法体

 */
public class Demo02Lambda {
    public static void main(String[] args) {
        //使用匿名内部类的方式实现多线程
        //继续简化
        new Thread( new Runnable(){

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新的线程创建");
            }
        }).start();

        //使用Lambda表达式实现多线程
        //继续简化
        new Thread(()->{
                System.out.println(Thread.currentThread().getName() + "新的线程创建");
            }
        ).start();

        //优化省略Lambda---  3. {一些代码}: 如果{}中的代码只有一行，无论是否有返回值，都可以省略 ： {}， return ;
        new Thread(()->
            System.out.println(Thread.currentThread().getName() + "新的线程创建")
        ).start();
    }
}
