package priv.lhf.demo02.Test.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
    java.util.LinkedHashSet集合 extends HashSet集合
    LinkedHashSet集合特点：
        底层是一个哈希表（数组+链表/红黑树）+链表； 多了一条链表（记录元素的顺序），保证元素有序
 */
public class Demo05LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("itcast");
        System.out.println(set); //[abc, www, itcast] 无序，不允许重复

        LinkedHashSet<String> linked = new LinkedHashSet<>();

        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("itcast");//[www, abc, itcast] 有序，不重复
        System.out.println(linked);
    }
}
