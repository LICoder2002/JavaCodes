package priv.lhf.demo04.Lambda;
/*
    Lambda表达式有参数有返回值练习
    需求：
        给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
        使用Lambda的标准格式调用invokeCalc方法，完成120和130的相加计算
 */
public class Demo01Calculator {
    public static void main(String[] args) {
        //匿名内部类
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        //使用Lam表达式
        invokeCalc(120, 130, (int a, int b) -> {
            return a + b;
        });

        //优化省略Lambda
        //1. （参数列表）: 括号中参数列表的数据类型，可以省略
        //3. {一些代码}: 如果{}中的代码只有一行，无论是否有返回值，都可以省略 ： {}， return ;
        invokeCalc(120, 130, (a, b) ->
                a + b
        );
    }

    /*
        定义一个方法
        参数传递两个整数
        参数传递Calculator接口
        方法内部调用Calculator中的方法calc计算两个整数的和
     */
    public static void invokeCalc(int a, int b, Calculator c)
    {
        int sum = c.calc(a, b);
        System.out.println(sum);
    }
}
