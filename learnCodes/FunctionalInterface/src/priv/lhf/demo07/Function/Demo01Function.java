package priv.lhf.demo07.Function;

import java.util.function.Function;

/*
    java.util.function.Function<T,R>接口用来根据一个类型的数据得到另一个类型的数据
    R apply(T t)
 */
public class Demo01Function {
    public static void change(String s, Function<String ,Integer> func){
        System.out.println(func.apply(s));
    }

    public static void main(String[] args) {
        String s = "1234";

        change(s, (str)-> Integer.parseInt(str));
    }
}
