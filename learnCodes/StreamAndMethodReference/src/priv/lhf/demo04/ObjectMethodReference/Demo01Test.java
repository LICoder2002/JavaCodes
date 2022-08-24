package priv.lhf.demo04.ObjectMethodReference;
/*
    通过对象名引用常用方法 对象和成员方法存在
 */
public class Demo01Test {
    public static void printString(Printable p)
    {
        p.print("Hello");
    }

    public static void main(String[] args) {
        printString((s) -> {
            MethodRefObject obj = new MethodRefObject();
            obj.printUpperCaseString(s);
        });


        //方法引用优化
        MethodRefObject obj = new MethodRefObject();
        printString(obj::printUpperCaseString);

    }
}
