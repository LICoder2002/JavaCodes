package priv.lhf.test4;

/*
super关键字用来访问父类内容，而this关键字用来访问本类内容。用法也有三种：
1. 在本类的成员方法中，访问本类的成员变量。
2. 在本类的成员方法中，访问本类的另一个成员方法。
3. 在本类的构造方法中，访问本类的另一个构造方法。
在第三种用法当中的注意事项：
A. this(...)调用也必须是构造方法的第一个语句，并且只有唯一一个。
B. super和this两种构造调用，不能同时使用。
 */
public class Zi extends Fu{
    int num = 20;

    public Zi()
    {
//        super(); //这一行不在赠送
        this(123); //本类的无参构造调用本类的有参构造
    }

    public Zi(int num)
    {
        this(1,2);
        this.num = num;
    }

    public Zi(int n, int m)
    {
//        this(); //构造死循环
    }

    public void showNum()
    {
        int num = 10;
        System.out.println("局部变量" + num);
        System.out.println("本类中的变量" + this.num);
        System.out.println("父类中的变量" + super.num);
    }

    public void methodA()
    {
        System.out.println("AAA");
    }

    public void methodB()
    {
        this.methodA();
        System.out.println("BBB");
    }
}
