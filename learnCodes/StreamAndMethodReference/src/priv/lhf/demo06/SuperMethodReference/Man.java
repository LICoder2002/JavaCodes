package priv.lhf.demo06.SuperMethodReference;
/*
    定义子类
 */
public class Man extends Human{
    //重写

    @Override
    public void sayHello() {
        System.out.println("Hello , 我是Man!");
    }

    public void method(Greetable g)
    {
        g.greet();
    }

    public void show(){
//        method(()->{
//            Human h = new Human();
//            h.sayHello();
//        });


//        method(()->{
//            super.sayHello();
//        });

        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
