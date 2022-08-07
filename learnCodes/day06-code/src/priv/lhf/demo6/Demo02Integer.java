package priv.lhf.demo6;
/*
    自动装箱与拆箱：基本数据类型和包装类之间可以自动的互相转换
    JDK1.5之后出现的特性
 */

import java.util.ArrayList;

public class Demo02Integer {
    public static void main(String[] args) {
        //自动装箱
        Integer in = 1;
        System.out.println(in);

        //自动拆箱
        in = in+2;
        System.out.println(in);

        ArrayList<Integer> list = new ArrayList<>();
        /*
            Arraylist 集合无法直接存储整数，可以存储Integer包装类
         */
        list.add(1);  //自动装箱  list.add(new Integer(1))
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
    }
}
