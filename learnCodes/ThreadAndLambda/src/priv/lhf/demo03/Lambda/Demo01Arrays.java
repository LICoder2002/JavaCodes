package priv.lhf.demo03.Lambda;
/*
    Lambda表达式有参数有返回值的练习;
    需求：
        使用数组存储多个Person对象
        对数组中的person对象使用Arrays的sort方法通过年龄升序排序
 */

import java.util.Arrays;
import java.util.Comparator;

public class Demo01Arrays {
    public static void main(String[] args) {
        //使用数组存储多个Person对象
        Person[] arr = {
                new Person("张三", 18),
                new Person("李四", 16),
                new Person("王五", 20),
                new Person("赵六", 8),
                new Person("张四", 15),
                new Person("赵三", 18)
        };
        //对数组中的person对象使用Arrays的sort方法通过年龄升序排序
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        //使用Lambda表达式简化匿名内部类
      /*  Arrays.sort(arr, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });

       */


        //优化省略Lambda
        //1. （参数列表）: 括号中参数列表的数据类型，可以省略
        //3. {一些代码}: 如果{}中的代码只有一行，无论是否有返回值，都可以省略 ： {}， return ;
        Arrays.sort(arr, (o1, o2) ->
                o1.getAge() - o2.getAge()
        );

        //遍历
        for (Person p : arr) {
            System.out.println(p);
        }

    }
}
