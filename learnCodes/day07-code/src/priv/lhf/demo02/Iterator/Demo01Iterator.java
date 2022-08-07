package priv.lhf.demo02.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    java.util.Iterator接口：迭代器（对集合进行遍历）
    有两个常用方法：
        boolean hasNext() 如果有下一个元素可以迭代，则返回true，否则返回false
        E next 返回迭代的下一个元素

    Iterator迭代器是一个接口，我们无法直接使用，需要使用Iterator接口的实现类对象
    Collection接口中有一个方法叫做 iterator（），这个方法返回的就是迭代器的实现类对象。

    迭代器的使用步骤；
        1. 使用集合中的方法iterator()获取一个迭代器的实现类对象，使用Iterator接口接收（多态）
        2. 使用Iterator接口中的方法hasNext判断还有没有下一个元素
        3. 使用接口中的方法next取出集合中的下一个元素
 */
public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");

        //获取迭代器
        //接口  多态            实现类
        Iterator<String> it = coll.iterator();

//        boolean b = it.hasNext();
//        System.out.println(b);
//        String s = it.next();
//        System.out.println(s);

        while(it.hasNext())
        {
            String s = it.next();
            System.out.println(s);
        }
    }
}
