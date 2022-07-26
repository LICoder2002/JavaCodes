package priv.lhf.test3;

public class Fu {

    int num = 20;

    public void method()
    {
        System.out.println("父类方法");
    }

    public Fu(int num)
    {
        System.out.println("父类有参构造！");
    }

    public Fu()
    {
        System.out.println("父类无参构造！");
    }
}
