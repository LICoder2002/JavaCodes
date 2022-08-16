package priv.lhf.demo05.Lambda;

import java.util.ArrayList;

/*
    Lambda表达式：可以推导，可以省略
    凡是根据上下文推导出来的内容，都可以省略书写
    可以省略的内容：
        1. （参数列表）: 括号中参数列表的数据类型，可以省略
        2. （参数列表）: 括号中的参数如果只有一个，那么类型和（）都可以省略
        3. {一些代码}: 如果{}中的代码只有一行，无论是否有返回值，都可以省略 ： {}， return ;
            注意：要省略必须：  {}， return ;   一起省略
 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        //JDK1.7之前，创建集合对象必须把前后的泛型都写上
        ArrayList<String> list01 = new ArrayList<String>();

        //JDK1.7之后，=后面的泛型可以省略，后面的泛型可以根据前面的泛型推导出来
        ArrayList<String> list02 = new ArrayList<>();



    }
}
