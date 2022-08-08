package priv.lhf.demo04.Collections;

import java.util.ArrayList;
import java.util.Collections;

// public static <T> sort(List<T> list) //安装默认规则排序
// sort(List<T> list) 必须实现Comparable, 重写接口方法当中的compareTo定义排序规则
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(4);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);


        ArrayList<String> list02 = new ArrayList<>();

        list02.add("d");
        list02.add("c");
        list02.add("a");
        list02.add("b");
        System.out.println(list02);
        Collections.sort(list02);
        System.out.println(list02);


        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("张三", 17));
        list03.add(new Person("李四", 15));
        list03.add(new Person("王五", 19));
        list03.add(new Person("赵六", 18));
        System.out.println(list03);
        Collections.sort(list03);
        System.out.println(list03);


    }
}
