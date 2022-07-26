package priv.lhf.demo01;
/*
接口当中也可以定义“成员变量”，但必须使用public static final三个关键字进行修饰。
出效果上看，这其实就是【常量】
格式；
public static final 数据类型 常量名称 = 数据值;
备注：一旦使用final关键字进行修饰，说明不可以改变。

注意事项：
1. 接口当中的变量，可以省略public static final。
2. 接口当中的常量，必须进行赋值。
3. 接口中常量的名称，使用完全大写的字母，用下划线进行分隔。
 */
public interface MyInterfaceConst {
    public static final int NUM_OF_AGE = 10;
}
