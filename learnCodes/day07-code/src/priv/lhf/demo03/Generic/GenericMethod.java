package priv.lhf.demo03.Generic;
/*
    定义含有泛型的方法
 */
public class GenericMethod {
    public <M> void method01(M m)
    {
        System.out.println(m);
    }

    //含有泛型的静态方法
    public static <S> void method02(S s)
    {
        System.out.println(s);
    }
}
