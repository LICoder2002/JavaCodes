package priv.lhf.demo5;
/*
    java.lang.StringBuilder类 ： 字符缓冲区，提高字符串的效率
 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu = new StringBuilder();
        //使用append添加数据
        //append方法返回的是this, 调用方法的对象是bu, this == bu
//        StringBuilder bu2 = bu.append("abcd");
//        System.out.println(bu);
//        System.out.println(bu2);
//        System.out.println(bu == bu2);

        bu.append("abc");
        bu.append(123).append(true).append(1.23);
        System.out.println(bu);

        /*
            链式编程
         */
        bu.append(12).append("hello").append(18.88).append(false);
        System.out.println(bu);
    }
}
