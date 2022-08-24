package priv.lhf.demo06.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
    集合信息筛选
 */
public class Demo05Test {
    public static ArrayList<String> filter (String[] arr, Predicate<String> pre1, Predicate<String> pre2)
    {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b = pre1.and(pre2).test(s);
            if(b){
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] array = {"张三，男", "王二麻子，男", "王五，男", "李四，女"};

        ArrayList<String> list = filter(array, (s) -> {
            return s.split("，")[1].equals("男");
        }, (s) -> {
            return s.split("，")[0].length() == 2;
        });

        for (String s : list) {
            System.out.println(s);
        }
//        System.out.println(list);
    }
}
