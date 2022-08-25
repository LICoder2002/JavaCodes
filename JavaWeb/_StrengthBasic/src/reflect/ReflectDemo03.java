package reflect;

import domain.Person;

import java.lang.reflect.Method;

public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;

        //获取指定成员方法
        Method eat_method = personClass.getMethod("eat");
        Person person = new Person();
        eat_method.invoke(person);

        //获取public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
