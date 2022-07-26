package priv.lhf.test3;

public class Zi extends Fu{

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
