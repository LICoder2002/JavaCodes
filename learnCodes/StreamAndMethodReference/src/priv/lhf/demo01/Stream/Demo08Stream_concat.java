package priv.lhf.demo01.Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法concat，把流组合到一起

    static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 */
public class Demo08Stream_concat {
    public static void main(String[] args) {
        String[] arr1 = {"张三", "李四", "王五", "赵六"};
        Stream<String> stream1 = Stream.of(arr1);

        String[] arr2 = {"喜羊羊", "美羊羊", "灰太狼", "红太狼", "懒羊羊"};
        Stream<String> stream2 = Stream.of(arr2);

        Stream<String> stream = Stream.concat(stream1, stream2);

        stream.forEach(s -> System.out.println(s));
    }
}
