package priv.lhf.demo03.Generic;

public class Demo03GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();

        gm.method01(10);
        gm.method01("abc");
        gm.method01(true);

        gm.method02("静态方法，不建议创建对象使用");

        //静态方法，通过类名.方法名直接使用
        GenericMethod.method02("静态方法");
    }
}
