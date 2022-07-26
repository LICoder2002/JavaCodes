package priv.lhf.test3;

public class Zi extends Fu{

    int num = 10;

    public void method()
    {
        super.method();
        System.out.println("子类方法");
    }

    public void methodZi()
    {
        System.out.println("子类num = " + num);
        System.out.println("父类num = "+super.num);
    }

    public Zi()
    {
//        super();
        super(10);
        System.out.println("子类无参构造！");
    }

    public Zi(int num)
    {
        super(10);
        System.out.println("子类有参构造");
    }
}
