package reflect;

import domain.Person;

import java.lang.reflect.Field;

/**
 * Class对象功能
 * 1. 获取成员变量
 * 2. 获取构造方法
 * 3. 获取成员方法
 * 4. 获取类名
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws Exception {
        //1. 获取Person的Class对象
        Class<Person> personClass = Person.class;

        //获取成员变量
        Field[] fields = personClass.getFields(); //获取public 成员变量
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("-----------");
        Field a = personClass.getField("a");
        System.out.println(a);
        Person p =new Person();
        Object value = a.get(p);
        System.out.println(value);

        System.out.println(p);

        System.out.println("------------------");
        Field[] declaredFields = personClass.getDeclaredFields();//获取所有成员变量
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        Field d = personClass.getDeclaredField("d");
        //忽略访问权限修饰符的安全检查
        d.setAccessible(true);//暴力反射
        Object value2 = d.get(p);
        System.out.println(value2);


    }
}
