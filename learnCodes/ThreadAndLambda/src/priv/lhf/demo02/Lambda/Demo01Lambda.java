package priv.lhf.demo02.Lambda;
/*
       需求：
        给定一个厨字Cook接口，内含唯一抽象方法makeFood，且无参数，无返回值。
        使用Lambda的标准格式调用invokeCook方法，打印出”吃饭了！“ 字样
 */

public class Demo01Lambda {
    public static void main(String[] args) {
        //调用invokeCook方法，参数是Cook接口，传递Cook接口的匿名对象
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了!");
            }
        });

        //使用lambda表达式，简化匿名内部类的书写
        invokeCook(()->{
            System.out.println("吃饭了！");
        });

        //优化省略Lambda        3. {一些代码}: 如果{}中的代码只有一行，无论是否有返回值，都可以省略 ： {}， return ;
        invokeCook(()->
            System.out.println("吃饭了！")
        );

    }

    //定义一个方法，传递参数Cook接口，方法内部调用Cook接口中的方法makeFood
    public static void invokeCook(Cook cook)
    {
        cook.makeFood();
    }
}
