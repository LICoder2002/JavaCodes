package priv.lhf.demo01.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
    Stream中的常用方法count，统计Stream流中的元素个数
    long count() 是一个终结方法
 */
public class Demo05Stream_count {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);
    }
}
