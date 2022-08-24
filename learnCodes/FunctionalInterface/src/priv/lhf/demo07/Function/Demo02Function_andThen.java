package priv.lhf.demo07.Function;

import java.util.function.Function;

public class Demo02Function_andThen {
    public static void change(String s, Function<String, Integer> fun1, Function<Integer, String> fun2)
    {
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }

    public static void main(String[] args) {
        String s = "123";
        change(s, (str)-> Integer.parseInt(str) + 10, (i)-> i + "");
    }
}
