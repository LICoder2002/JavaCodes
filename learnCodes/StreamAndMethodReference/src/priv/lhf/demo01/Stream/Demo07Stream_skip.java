package priv.lhf.demo01.Stream;

import java.util.stream.Stream;

/*
    Stream中的常用方法skip: 用于跳过元素
    Stream<T> skip(long n)

 */
public class Demo07Stream_skip {
    public static void main(String[] args) {
        String[] arr = {"喜羊羊", "美羊羊", "灰太狼", "红太狼", "懒羊羊"};
        Stream<String> stream = Stream.of(arr);

        Stream<String> stream1 = stream.skip(3);

        stream1.forEach(s -> System.out.println(s));
    }
}
