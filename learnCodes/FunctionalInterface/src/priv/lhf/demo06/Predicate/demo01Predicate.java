package priv.lhf.demo06.Predicate;

import java.util.function.Predicate;

/*
    java.util.function.Predicate<T>接口
    对某种数据类型的数据进行判断，结果返回Boolean值

    boolean test(T t)
 */
public class demo01Predicate {
    public static boolean checkString(String s, Predicate<String> pre)
    {
        return pre.test(s);
    }

    public static void main(String[] args) {
        String s = "abcdef";

        boolean b = checkString(s, (String str)->{
            return str.length() > 5;
        });

        System.out.println(b);
    }
}
