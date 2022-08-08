package priv.lhf.demo02.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    java.util.Set
    特点：
        1、 不允许存储重复元素
        2、没有索引，没有带索引的方法，也不能使用普通for循环遍历

    java.util.HashSet集合 inplements Set 接口
    HashSet特点：
        1、不允许重复元素
        2、没有索引，没有带索引的方法，也不能使用普通for循环遍历
        3、是一个无序集合，存储元素和取出元素的顺序可能不一样
        4、底层是一个哈希表结构，查询速度非常快
 */
public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(5);
        set.add(1);
        set.add(3);
        //迭代器遍历
        Iterator<Integer> it = set.iterator();
        while(it.hasNext())

        {
            System.out.println(it.next());
        }
        System.out.println("===============");

        //增强for
        for (Integer i : set) {
            System.out.println(i);
        }

    }
}
