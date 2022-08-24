package priv.lhf.demo07.Function;

import java.util.function.Function;

/*
    自定义函数模型拼接
 */
public class Demo03Test {
    public static int change(String s, Function<String, String> fun1, Function<String, Integer> fun2, Function<Integer, Integer> fun3)
    {
        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }

    public static void main(String[] args) {
        String s = "张三，20";

        int value = change(s, (s1) -> {
            return s1.split("，")[1];
        }, (s2) -> {
            return Integer.parseInt(s2);
        }, (i) -> {
            return i + 100;
        });

        System.out.println(value);
    }
}
