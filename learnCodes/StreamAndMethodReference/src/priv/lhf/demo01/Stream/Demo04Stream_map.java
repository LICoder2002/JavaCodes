package priv.lhf.demo01.Stream;
/*
    如果要将流中的元素映射到另一个流中，可以使用map方法
    <R> Stream<R> map<Function<? super T, ? extends R> mapper)
 */
import java.io.Serializable;
import java.util.stream.Stream;

public class Demo04Stream_map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");

        Stream<Integer> stream1 = stream.map((s -> Integer.parseInt(s)));

        stream1.forEach(integer -> System.out.println(integer));
    }
}
