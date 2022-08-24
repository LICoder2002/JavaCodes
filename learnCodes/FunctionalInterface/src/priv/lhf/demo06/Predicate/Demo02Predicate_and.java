package priv.lhf.demo06.Predicate;

import java.util.function.Predicate;

public class Demo02Predicate_and {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2)
    {
        //return pre1.test(s) && pre2.test(s);
        return pre1.and(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "bcdef";

        boolean b = checkString(s, (str) -> {
            return str.length() > 5;
        }, (str) -> {
            return str.contains("a");
        });

        System.out.println(b);
    }
}
