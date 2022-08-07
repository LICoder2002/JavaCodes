package priv.lhf.demo03.Generic;

public class Demo02GenericClass {
    public static void main(String[] args) {
        //不写泛型，默认是Object类型
        GenericClass gc = new GenericClass();
        gc.setName("张三");
        System.out.println(gc.getName());

        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(123);
        System.out.println(gc2.getName());

        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("张三");
        System.out.println(gc3.getName());
    }
}
