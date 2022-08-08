package priv.lhf.demo01.List;
/*
    java.util.LinkedList集合 implement List接口
    特点：
        1、底层链表，查询慢，增删快
        2、包含大量操作首尾元素的方法
        注意：使用LinkedList特有的方法，不能使用多态
 */

import java.util.LinkedList;

public class Demo02LinkedList {
    public static void main(String[] args) {
        //show01();
        //show02();
        show03();
    }
    /*
        E removeFirst();
        E RemoveLast();
        E pop(); == E removeFirst();

     */
    private static void show03() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("c");
        linked.add("c");
        System.out.println(linked);

        String rmF = linked.removeFirst();
        System.out.println(rmF);

        String rmL = linked.removeLast();
        System.out.println(rmL);

        System.out.println(linked);
        String p = linked.pop();
        System.out.println(linked);

    }

    /*
        getFirst() 返回第一个元素
        getLast() 返回最后一个元素
     */
    private static void show02() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        linked.clear();
        //抛异常NoSuchElementException
        if(!linked.isEmpty())
        {
            String f = linked.getFirst();
            System.out.println(f);

            String l = linked.getLast();
            System.out.println(l);
        }

    }

    /*
        addFirst(E e)
        addLast(E e)
        push(E e)
     */
    private static void show01() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        linked.addFirst("www");
        System.out.println(linked);

        linked.push("abc");
        System.out.println(linked);

        linked.addLast("xxx");
        System.out.println(linked);
    }
}
