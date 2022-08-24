package priv.lhf.demo03.MethodReference;

public class Demo01Printable {
    public static void printString(Printable p)
    {
        p.print("Hello World!");
    }

    public static void main(String[] args) {
        printString(s -> System.out.println(s));


    /*
        使用方法引用优化Lambda表达式
        可以使用System.out方法直接调用println方法
     */

    printString(System.out::println);
    }
}
