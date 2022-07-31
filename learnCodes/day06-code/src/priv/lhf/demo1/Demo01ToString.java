package priv.lhf.demo1;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo01ToString {
    public static void main(String[] args) {
        /*
        Person类默认继承了Object类，所以可以使用Object类中的ToString方法
        public String toString()
        返回该对象的字符串表示
         */
        Person p = new Person("张三", 17);
        String s = p.toString();
        System.out.println(s);
        System.out.println(p);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
    }
}
