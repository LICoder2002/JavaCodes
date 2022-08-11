package priv.lhf.demo03.Debug;

/*
    Debug 调试
        f8: 逐行执行程序
        f7: 进入方法中
        shift+f8: 跳出方法
        f9: 跳到下一个断点，如果没有，则结束程序
        ctrl+f2: 退出debug模式，停止程序
        Console: 切换到控制台
*/

public class Demo01Debug {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int sum = a + b;
//        System.out.println(sum);

//        for(int i = 0; i < 5; i++)
//        {
//            System.out.println(i);
//        }
        print();
    }

    private static void print()
    {
        System.out.println("hello world!");
        System.out.println("hello world!");
        System.out.println("hello world!");
        System.out.println("hello world!");
        System.out.println("hello world!");
        System.out.println("hello world!");
    }
}
