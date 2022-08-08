package priv.lhf.demo02.Set;

import java.util.HashSet;

/*
    HashSet存储自定义类型元素
    Set集合保证元素的唯一性：
        存储元素（基本数据类型，自定义数据类型）， 必须重写HashCode方法 和 equals方法

        要求：
            同名同年龄的人只能存储一次
 */
public class Demo04HashSetSavePerson {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();

        Person p1 = new Person("张三", 18);
        Person p2 = new Person("李四", 19);
        Person p3 = new Person("张三", 18);
        Person p4 = new Person("王五", 20);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());

        System.out.println(p1 == p3);
        System.out.println(p1.equals(p3));

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        System.out.println(set);
    }
}
