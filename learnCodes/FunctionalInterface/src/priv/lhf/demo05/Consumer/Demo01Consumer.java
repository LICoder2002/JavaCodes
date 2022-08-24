package priv.lhf.demo05.Consumer;

import java.util.function.Consumer;

/*
    java.util.function.Consumer<T> 接口与Supplier相反
        是消费一个数据，其数据类型由泛型决定‘】
    Consumer接口中包含一个抽象方法void accept(T t), 意为消费一个指定的数据类型

 */
public class Demo01Consumer {
    public static void method(String name, Consumer<String> con)
    {
        con.accept(name);
    }

    public static void main(String[] args) {
        method("张三", (String name)->{
            //System.out.println(name);

            String reName = new StringBuilder(name).reverse().toString();
            System.out.println(reName);

        });
    }
}
