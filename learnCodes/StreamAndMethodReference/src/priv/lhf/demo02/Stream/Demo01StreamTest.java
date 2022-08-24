package priv.lhf.demo02.Stream;

import java.util.ArrayList;

public class Demo01StreamTest {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        one.add("张三");
        one.add("李四");
        one.add("王五");
        one.add("王二麻子");
        one.add("赵六");

        //第一个集合只有名字为两个字的
        ArrayList<String> one1 = new ArrayList<>();
        for (String name : one) {
            if (name.length() == 2) {
                one1.add(name);
            }
        }

        //只有前三个
        ArrayList<String> one2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            one2.add(one1.get(i));
        }

        ArrayList<String> two = new ArrayList<>();
        two.add("张三丰");
        two.add("赵云");
        two.add("三元桥");
        two.add("张无忌");
        two.add("张强");
        two.add("赵敏");
        two.add("老子");
        //第二个集合只有姓张的
        ArrayList<String> two1 = new ArrayList<>();
        for (String name : two) {
            if (name.startsWith("张")) {
                two1.add(name);
            }
        }

        ArrayList<String> two2 = new ArrayList<>();
        //不要前两个
        for (int i = 2; i < two1.size(); i++) {
            two2.add(two1.get(i));
        }

        //合并
        ArrayList<String> all = new ArrayList<>();

        all.addAll(one2);
        all.addAll(two2);

        //Person
        ArrayList<Person> list = new ArrayList<>();
        for (String name : all) {
            list.add(new Person(name));
        }

        for (Person person : list) {
            System.out.println(person);
        }

    }
}
