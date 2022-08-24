package priv.lhf.demo01.Stream;

import java.util.*;
import java.util.stream.Stream;

/*
    java.util.stream.Stream<T>是java8新加入的最常用的流接口。（并不是一个函数式接口）
    获取一个流的方法
        所有的Collection集合都可以通过stream默认方法获取流
            default Stream<E> stream()
        Stream接口的静态方法of可以获取数组对于的流
            static <T> Stream<T> of(T ... values) 参数是一个可变参数，可以传递一个数组
 */
public class Demo01GetStream {
    public static void main(String[] args) {

        // 所有的Collection集合都可以通过stream默认方法获取流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String ,String> map = new HashMap<>();
        Set<String> keySet = map.keySet();
        Stream<String> stream3 = keySet.stream();

        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        //键值对（键与值的映射关系 entrySet）
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

        // Stream接口的静态方法of可以获取数组对于的流

        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);

        //可变参数可以传递数组
        Integer[] arr = {1, 2, 3, 4, 5};
        Stream<Integer> stream7 = Stream.of(arr);

        String[] arr2 = {"aa", "bbb", "cccc"};
        Stream<String> stream8 = Stream.of(arr2);


    }
}
