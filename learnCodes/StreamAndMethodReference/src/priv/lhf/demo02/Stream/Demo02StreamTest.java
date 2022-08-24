package priv.lhf.demo02.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo02StreamTest {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        one.add("张三");
        one.add("李四");
        one.add("王五");
        one.add("王二麻子");
        one.add("赵六");

        //第一个集合只有名字为两个字的
        //只有前三个
        Stream<String> oneStream = one.stream().filter(name -> name.length() == 2).limit(3);


        ArrayList<String> two = new ArrayList<>();
        two.add("张三丰");
        two.add("赵云");
        two.add("三元桥");
        two.add("张无忌");
        two.add("张强");
        two.add("赵敏");
        two.add("老子");
        //第二个集合只有姓张的
        //不要前两个
        Stream<String> twoStream = two.stream().filter(name -> name.startsWith("张")).skip(2);


        //合并
        //转换为Person
        Stream.concat(oneStream, twoStream).map(name -> new Person(name)).forEach(person -> System.out.println(person));


    }
}
