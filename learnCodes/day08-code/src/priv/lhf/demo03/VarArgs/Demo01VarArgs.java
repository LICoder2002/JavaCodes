package priv.lhf.demo03.VarArgs;

import java.util.Objects;

/*
    可变参数：是JDK1.5之后出现的特性
    使用前提：
        当方法的参数列表数据类型已经确定，但是参数的个数不确定的时候，可以使用
    使用格式：
        修饰符  返回值类型  方法名（数据类型 ... 变量名）{}
    可变参数原理：
        可变参数底层是一个数组，根据传递参数的个数，会创建不同长度1数组来存储这些参数
 */
public class Demo01VarArgs {
    public static void main(String[] args) {
//        int res = add();
        int res = add(10, 20);
        System.out.println(res);

//        method(10, 10.0, "str", "abc");
    }
    /*
        可变参数注意事项：
            1. 一个方法的参数列表只能有一个可变参数
            2. 如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
     */
//
//    public static void method(int ... a, String ... s)
//    {
//
//    }



//    public static void method(int ... a, String s, double d)
//    {
//
//    }


//    public static void method(int a, double d, String ... s)
//    {
//
//    }

    //可变参数的特殊写法
    public static void method(Objects ... obj)
    {}





    /*
        定义计算（0~n）个整数的和
     */
    public static int add(int ... arr)
    {
        int res = 0;
//        System.out.println(arr);
        for (int i : arr) {
            res = res + i;
        }
        System.out.println("arrLen = "+arr.length);
        return res;
    }

//    public static int add(int a, int b, int c)
//    {
//        return a + b + c;
//    }
}
