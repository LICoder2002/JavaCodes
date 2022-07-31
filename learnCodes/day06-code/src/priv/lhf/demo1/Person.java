package priv.lhf.demo1;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "Person{ name = " + name + " , age = " + age + " }";
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    Object类的equals方法，默认比较的是地址值，所以没有意义
    所以我们重写equals方法，比较两个对象的属性
    问题：隐含着一个多态
    多态的弊端：无法使用子类特有的属性和方法
    Object obj = p2 = new Person("张三" , 12);
    解决：向下转型。
     */

//    @Override
//    public boolean equals(Object obj) {
//        if(obj==null){
//            return false;
//        }
//
//        if(obj==this){
//            return true;
//        }
//        //向下转型
//        //增加一个判断，防止类型转换一次 ClassCastException
//        if(obj instanceof Person)
//        {
//            Person p = (Person) obj;
//            //比较两个对象的属性
//            return this.name.equals(p.name)&&this.age == p.age;
//        }
//
//        //不是Person类型
//        return false;
//
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
