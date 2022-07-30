package priv.lhf.demo05;
/*
当final关键字修饰一个类时，格式：
public final class 类名称{

    //...
}
含义：当前这个类不能有任何子类。所有成员函数无法覆盖重写。
 */
public  final class MyClass /*extends Object*/{
    public void method (){
        System.out.println("方法执行");
    }
}
