package priv.lhf.demo05;
/*
final 关键字代表最终、不可改变的。

常见四种用法：
1、可以用来修饰一个类。
2、可以用来修饰一个方法。
3、可以用来修饰一个局部变量。
4、可以用来修饰一个成员函数
 */
public class Demo01Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);

        //一旦final关键字用来修饰局部变量，那么这个变量就不能进行改变。
        //一次赋值，终生不变
        final int num2 = 30;
        System.out.println(num2);

        //num2 = 40; //错误写法
        //num2 = 30  //错误写法

        final int num3;
        num3 = 100; //正确写法

        //对于基本类型来说，不可变说的是变量当中的数据不可变。
        //对于引用类型来说，不可变说的是变量当中的地址值不可变。
        Student stu1 = new Student("张三");
        System.out.println(stu1.getName());
        System.out.println(stu1);

        stu1 = new Student("李四");
        System.out.println(stu1.getName());
        System.out.println(stu1);

        final Student stu2 = new Student("王五");
        System.out.println(stu2.getName());
        System.out.println(stu2);

        //stu2 = new Student("翠花"); //错误写法，变量当中的地址值不可变。

        stu2.setName("老王");
        System.out.println(stu2.getName());
        System.out.println(stu2);

    }
}
