package priv.lhf.demo01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合第一种遍历方式：通过键找值
    Set<K> keySet
        返回次映射中包含的键的Set 视图
 */
public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 19);
        map.put("李四", 16);
        map.put("王五", 20);
        map.put("赵六", 17);

        // 1、
        Set<String> set = map.keySet();

        // 2、
        Iterator<String> it = set.iterator();
        while(it.hasNext())
        {
            String key = it.next();
            Integer val = map.get(key);
            System.out.println(key + " = " + val);
        }

        System.out.println("==============");
        for (String key : map.keySet()) {
            Integer val = map.get(key);
            System.out.println(key + " = " + val);
        }
    }
}
