package priv.lhf.demo01.File;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
        //File的构造方法
        //show02("c:\\", "a.txt");
        show03();
    }

    private static void show03() {
        File parent = new File("C:\\");
        File file = new File(parent, "hello.java");
        System.out.println(file);
    }

    //File(String parent, String child)
    private static void show02(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    //File(String pathname)
    private static void show01() {
        File f1 = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion\\src\\priv\\lhf\\demo01\\File\\a.txt");
        System.out.println(f1);

        File f2 = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion\\src\\priv\\lhf\\demo01\\File");
        System.out.println(f2);

        File f3 = new File("b.txt");
        System.out.println(f3);


    }
}
