package priv.lhf.demo06;
/*
内部类分类：
1、成员内部类
2、局部内部类（包含尼玛内部类）

成员内部类定义格式：
修饰符 class 外部类名称{
    修饰符 class 内部类名称{
        //...
    }
    //...
}
注意：内用外，随意访问；外用内，需要内部类对象。

//如何使用成员内部类？
1、间接方式：在外部类的方法当中使用内部类；然后main只是调用外部类的方法。
2、直接方式，公式：
类名称 对象名 = new 类名称();
外部类名称.内部类名称 对象名 = new 外部类名称.new 内部类名称();
 */
public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();
        //通过外部类对象，调用外部类方法，里面间接使用内部类Heart
        body.methodBody();

        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
