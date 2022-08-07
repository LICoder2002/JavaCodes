package priv.lhf.demo03.Generic;
/*
    含有泛型的接口，第一种使用方法：接口定义的实现类，实现接口，指定接口泛型

    例如：
    public interface Iterator<E>{}
    Scanner类实现了Iterator接口，并指定了接口的泛型为String, 所以重写的next方法泛型类型默认就是String
    public final class Scanner implements Iterator<String>{
        public String next();
    }
 */

public class GenericInterfaceImpl1 implements GenericInterface<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
