package priv.lhf.demo03.LambdaTest;

import java.util.Arrays;
import java.util.Comparator;

/*
    如果一个方法的返回值是一个函数式接口，那么可以直接返回一个Lambda表达式
    当需要一个方法来获取一个java.util.Comparator接口类型的对象作为排序器时，可以调用该方法获取
 */
public class Demo02Comparator {
    public static Comparator<String> getComparator()
    {
        //匿名内部类
//        return new Comparator<String>()
//        {
//            @Override
//            public int compare(String o1, String o2)
//            {
//                //按照字符串降序排序
//                return o2.length() - o1.length();
//            }
//        };

        //Lambda表达式
//        return (String o1, String o2)->{
//            //按照字符串降序排序
//            return o2.length() - o1.length();
//        };

        return ( o1,  o2)-> o2.length() - o1.length();

    }

    public static void main(String[] args) {
        String[] arr = {"aaa", "bbbb", "cccccc", "d"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, getComparator());
        System.out.println(Arrays.toString(arr));

    }
}
