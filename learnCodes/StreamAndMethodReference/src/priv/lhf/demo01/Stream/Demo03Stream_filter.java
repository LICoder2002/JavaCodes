package priv.lhf.demo01.Stream;

import java.util.stream.Stream;

/*
    Stream流中常用的方法 filter : 用于对Stream流中的数据进行过滤
    Stream<T> filter(Predicate<? super T> predicate);
    filter方法的参数Predicate是一个函数式接口，可以传递Lambda表达式

 */
public class Demo03Stream_filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "周芷若", "赵敏", "张无忌");
        //对Stream流中得到数据进行过滤，只要姓张的
        Stream<String> stream2 = stream.filter((String name) -> {
            return name.startsWith("张");
        });

        stream2.forEach(name-> System.out.println(name));

        /*
            Stream属于管道流，只能被消费一次
            第一个Stream流调用完毕方法，数据就会流转到下一个Stream上
            而这时第一个Stream流已经使用完毕，就会关闭
            所有第一个Stream流就不能再使用
         */

        //stream.forEach(name-> System.out.println(name));//stream has already been operated upon or closed
    }
}
