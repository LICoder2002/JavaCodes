package priv.lhf.demo04.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(4);
        System.out.println(list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
                return o2 - o1;
            }
        });
        System.out.println(list);

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("b张三", 17));
        list03.add(new Person("a李四", 17));
        list03.add(new Person("王五", 19));
        list03.add(new Person("赵六", 18));
        System.out.println(list03);
//        Collections.sort(list03, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
////                return o1.getAge() - o2.getAge();
//                return o2.getAge() - o1.getAge();
//            }
//        });

        Collections.sort(list03, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int ret = o1.getAge() - o2.getAge();
                if(ret == 0)
                {
                    ret = o1.getName().charAt(0)- o2.getName().charAt(0);
                }
                return ret;

            }
        });
        System.out.println(list03);


    }
}
