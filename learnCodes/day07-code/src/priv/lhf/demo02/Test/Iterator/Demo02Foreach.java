package priv.lhf.demo02.Test.Iterator;
/*
    增强for循环：底层也是使用迭代器，只是简化了迭代器的书写
    是JDK1.5之后的特性
    Collection<E> extends Iterable<E>: 所有的单列集合都可以使用增强for
    public interface Interable<T>实现这个接口允许对象成为“foreach"语句的目标

    增强for:用来遍历集合和数组

    格式：
    for(集合/数组的数据类型 变量名 : 集合名/数组名)
    {
        sout(变量名);
    }

 */

import java.util.ArrayList;

public class Demo02Foreach {
    public static void main(String[] args) {
//        demo01();
        demo02();
    }

    //增强for遍历集合
    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        for(String s : list)
        {
            System.out.println(s);
        }
    }

    //增强for遍历数组
    private static void demo01() {
        int[] arr = {1, 2, 3, 4, 5};
        for(int e: arr)
        {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
