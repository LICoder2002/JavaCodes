package priv.lhf.demo01.FunctionalInterface;
/*
    函数式接口的使用: 一般作为方法的参数和返回值类型
 */
public class Demo {
    public static void show(MyFunctionalInterface myInter){
        myInter.method1();
    }
    public static void main(String[] args) {
        //调用show方法，方法参数是一个接口，所以可以传递接口的实现类对象
        MyFunctionalInterfaceImpl impl = new MyFunctionalInterfaceImpl();
        show(impl);

        //调用show方法，方法参数是一个接口，所以我们可以传递接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类");
            }
        });


        //调用show方法，方法参数是一个接口，所以我们可以使用Lambda表达式
        show(()->{
            System.out.println("使用Lambda表达式重写接口中的抽象方法");
        });

        //简化
        show(()-> System.out.println("使用Lambda表达式重写接口中的抽象方法，简化"));
    }
}
