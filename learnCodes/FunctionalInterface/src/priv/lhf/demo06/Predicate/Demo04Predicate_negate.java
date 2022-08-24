package priv.lhf.demo06.Predicate;

import java.util.function.Predicate;

public class Demo04Predicate_negate {
    public static boolean checkString(String s, Predicate<String> pre)
    {
        return pre.negate().test(s);
    }

    public static void main(String[] args) {
        String s = "bdgiuef";

        boolean b = checkString(s, (str) -> {
            return str.length() > 5;
        });

        System.out.println(b);
    }
}
