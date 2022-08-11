package priv.lhf.demo01.Map;
/*
    java.util.Map<K,V>集合
    Map集合的特点：
        1、 Map集合是一个双列集合，一个元素包含两个值（key, value)
        2、Map集合中的元素，key和value的值可以相同也可以不同
        3、Map集合中的元素，key不允许重复，value可以重复
        4、Map集合中的元素，key和value一一对应

    java.util.HashMap<K,V> 集合 implements Map<k, v>接口
    HashMap特点
        1、HashMap集合底层是哈希表：查询速度快
            JDK1.8之前：数组+链表
            JDK1.8之后：数组+单向链表/红黑树（链表长度超过8）
        2、HashMap是无序集合

    java.util.LinkedHashMap<k,v> 集合 extends HashMap<k,v>集合
    特点：
        1、底层哈希表+链表
        2、有序
 */

import java.util.HashMap;
import java.util.Map;

public class Demo01Map {
    public static void main(String[] args) {
        show04();
    }
    /*
        boolean containsKey(key) 判断集合中是否包含指定的值
     */
    private static void show04() {
        Map<String,String> map = new HashMap<>();
        map.put("aa", "AA");
        map.put("cc", "AA");
        map.put("bb", "BB");

        System.out.println(map);

        boolean b1 = map.containsKey("aa");
        boolean b2 = map.containsKey("dd");
        System.out.println(b1);
        System.out.println(b2);
    }

    /*
        public V get(key) 返回对应的val, 不存在则返回null
     */
    private static void show03() {
        Map<String,String> map = new HashMap<>();
        map.put("aa", "AA");
        map.put("cc", "AA");
        map.put("bb", "BB");

        System.out.println(map);

        String v1 = map.get("aa");
        String v2 = map.get("dd");
        System.out.println(v1);
        System.out.println(v2);
    }

    /*
        public V remove(Object key): 把指定的键所对应的键值对元素在Map中删除，返回被删除的元素。存在返回V, 不存在返回null
     */
    private static void show02() {
        Map<String,String> map = new HashMap<>();
        map.put("aa", "AA");
        map.put("cc", "AA");
        map.put("bb", "BB");

        System.out.println(map);

        String s = map.remove("aa");
        String s2 = map.remove("aa");
        System.out.println(s);
        System.out.println(s2);
        System.out.println(map);
    }

    // public V put(key, value)
    // 返回值： V:
    //  存储键值对的时候，key 不重复，返回null; 重复，会使用新的value替换map中重复的value，并返回被替换的value.
    private static void show01() {
        Map<String,String> map = new HashMap<>();

        String v1 = map.put("abc", "abc");
        System.out.println("v1:" + v1);

        String v2 = map.put("abc", "ab");
        System.out.println("v2:" + v2);

        System.out.println(map);

        map.put("aa", "AA");
        map.put("cc", "AA");
        map.put("bb", "BB");

        System.out.println(map);

    }
}
