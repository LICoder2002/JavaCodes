package priv.lhf.demo8;

/*
如果接口的实现类（或者父类的子类）只需要使用唯一的一次，
那么这种情况下就可以省略该类的定义，而改为使用【匿名内部类】。

匿名内部类的定义格式：
接口名称 对象名 = new 对象名{
    // 覆盖重写所有抽象方法
}
 */
public class DemoMain {
    public static void main(String[] args) {
//        MyInterface obj = new MyInterfaceImpl();
//        obj.method();

        //使用匿名内部类
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        obj.method();

    }
}
