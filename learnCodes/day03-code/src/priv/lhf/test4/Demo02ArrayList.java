package priv.lhf.test4;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
//        System.out.println(list);
        list.add("张三");
        list.add("李四");
        list.add("王五");
//        System.out.println(list);
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        String name = list.get(1);
        System.out.println();
        System.out.println(name);

        String remove = list.remove(2);
        System.out.println(remove);
        System.out.println(list);

        System.out.println(list.size());

    }
}
