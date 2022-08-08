package priv.lhf.demo04.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
    java.util.Collections 是集合工具类，用来对集合进行操作。部分如下：
        public static <T> boolean addAll(Collections<T> c, T ... elements) : 往集合中添加一些元素
        public static void shuffle(List<?> list) : 打乱集合顺序
 */
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
        Collections.addAll(list, "a", "b", "c", "d", "e");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
