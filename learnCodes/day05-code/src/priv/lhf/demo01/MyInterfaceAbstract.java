package priv.lhf.demo01;
/*
在任何版本的Java中， 接口都能定义抽象方法。
格式：
public abstract 返回值类型 方法名称（参数列表）;

注意事项：
1. 接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
2. 这两个关键字修饰符，可以选择性的省略。
3. 方法的三要素可以随意定义。
 */

/*
接口使用步骤：
1. 接口不能直接使用，必须有一个“实现类” 来 “继承” 接口。
格式：
public class 实现类名称 implements 接口名称{
       // ...
}
2. 接口的实现类必须覆盖重写（实现）接口中的所有抽象方法。
3. 创建实现类对象，进行使用。

注意事项：
如果实现类没有覆盖重写所有的抽象方法，那么这个类必须是抽象类。
 */
public interface MyInterfaceAbstract {

    //以下都是抽象方法
    public abstract void methodAbs1();
    public void methodAbs2();
    abstract void methodAbs3();
    void methodAbs4();
}
