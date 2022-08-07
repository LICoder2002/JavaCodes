package priv.lhf.demo03.Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
        //show01();
        show02();
    }

    /*
        创建集合对象，使用泛型
        好处：
            1、避免了类型转换的麻烦
            2、把运行期异常，提升到了编译期
        弊端：
            只能存储一种类型

     */
    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abc");
        list.add("abc");
        list.add("abc");
//        list.add(1);//直接报错

        for (String s : list) {
            System.out.println(s);
            System.out.println(s.length());
        }
    }

    /*
        创建集合对象，不使用泛型
        好处：
            集合不使用泛型，默认的类型是Object类型，可以存储任意类型的数据
        弊端：
            不安全，会引异常
     */
    private static void show01() {
        ArrayList list = new ArrayList();

        list.add("abc");
        list.add(1);

        Iterator it = list.iterator();
        while(it.hasNext())
        {
            Object obj = it.next();
            System.out.println(obj);

            //想要使用String类特有的方法，length获取字符串长度；不能使用 多态 Object obj = "abc" 需要向下转型
            //会抛出类型转换异常ClassCastException，不能把Integer类型转换为String类型
            String s = (String) obj;
            System.out.println(s.length());
        }
    }
}
