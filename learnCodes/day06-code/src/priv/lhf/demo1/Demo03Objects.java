package priv.lhf.demo1;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1 = "abc";
        //String s1 = null;
        String s2 = "aBc";
        //boolean b = s1.equals(s2); //NullPointerException
        /*
        Objects类的equals方法: 对两个对象进行比较，防止空指针异常。
         */
        boolean b = Objects.equals(s1,s2);


        System.out.println(b);
    }
}
