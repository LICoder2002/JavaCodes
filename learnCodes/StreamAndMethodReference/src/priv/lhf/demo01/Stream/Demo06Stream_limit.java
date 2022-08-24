package priv.lhf.demo01.Stream;

import java.util.stream.Stream;

/*
        Stream中的常用方法limit，用于截取Stream流中的元素
        limit方法可以对流进行截取，只取用前n个
        Stream<T> limit(long maxSize)

        limit方法是一个延迟方法，只是对流进行截取，返回的是一个新的流
 */
public class Demo06Stream_limit {
    public static void main(String[] args) {
        String[] arr = {"张三", "李四", "王五", "赵六"};
        Stream<String> stream = Stream.of(arr);

        Stream<String> stream1 = stream.limit(3);
        stream1.forEach((s -> System.out.println(s)));
    }
}
