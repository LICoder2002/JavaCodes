package reflect;

import domain.Person;

import java.lang.reflect.Constructor;

public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;

        //获取构造方法
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);

        //创建对象
        Person p = constructor.newInstance("张三", 23);
        System.out.println(p);

        Constructor<Person> constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        Person person = constructor1.newInstance();
        System.out.println(person);

        Person o = personClass.newInstance();
        System.out.println(o);

    }
}
