package priv.lhf.demo01.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    java.util.List接口 extends Collection 接口
 */
public class Demo01List {
    public static void main(String[] args) {
        //创建 一个list集合， 多态
        List<String> list = new ArrayList<>();

        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("cc");
        list.add("dd");
        System.out.println(list);

        // pubilc void add (index , element);
        list.add(1,"ff");
        System.out.println(list);

        // public E remove(index)  // 移除并返回该元素
        list.remove(1);
        System.out.println(list);

        // public E set(index, element) //替换并返回原元素
        String setE = list.set(0,"AA");
        System.out.println(setE);
        System.out.println(list);

        //list遍历 三种方法
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("====================");

        Iterator<String> it = list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("====================");

        for(String s : list)
        {
            System.out.println(s);
        }
    }
}
