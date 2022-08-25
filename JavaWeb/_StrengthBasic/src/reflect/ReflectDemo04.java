package reflect;

import domain.Person;

/*
    获取Class对象的方式
        1. Class.forName("全类名"): 将字节码文件加载进内存，返回Class对象 ---用于配置为文件
        2. 类名.class: 通过类名的属性class获取 --- 用于参数的传递
        3. 对象.getClass(): getClass()方法中Object类中定义 -- 用于对象获取字节码的方法
 */
public class ReflectDemo04 {
    public static void main(String[] args) throws Exception {
        // 1.
        Class cls1 = Class.forName("domain.Person");
        System.out.println(cls1);

        // 2.
        Class cls2 = Person.class;
        System.out.println(cls2);

        // 3.
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        //同一个字节码文件在一次程序运行的过程中是同一个
        System.out.println(cls1 == cls2);
        System.out.println(cls1 == cls3);
    }
}
