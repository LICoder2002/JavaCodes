package priv.lhf.demo05.StaticMethodReference;
/*
    通过类名引用静态成员方法  类和静态成员方法都已经存在
 */

public class Demo01ObjectMethodReference {
    public static int method(int number, Calcable c)
    {
        return c.calsAbs(number);
    }

    public static void main(String[] args) {
        int num = method(-10, (n) -> {
            return Math.abs(n);
        });

        System.out.println(num);

        //方法引用优化Lambda表达式
        int num2 = method(-10, Math::abs);
        System.out.println(num2);

    }
}
