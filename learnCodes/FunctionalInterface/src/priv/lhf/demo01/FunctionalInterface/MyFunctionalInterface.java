package priv.lhf.demo01.FunctionalInterface;
/*
    函数式接口: 有且只有一个抽象方法的接口，称之为函数式接口
    接口中可以包含其他的方法（默认、静态、私有）

    @FunctionalInterface注解
    作用: 可以检测接口是否是一个函数式接口
    是: 编译成功
    否: 编译失败（接口中没有抽象方法或者抽象方法的数量大于1）
 */
@FunctionalInterface
public interface MyFunctionalInterface {
    //定义一个抽象方法
    public abstract void method1();

//    void method2();


}
