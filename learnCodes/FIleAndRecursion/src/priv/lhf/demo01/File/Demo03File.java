package priv.lhf.demo01.File;
/*
    File判断功能的方法
        boolean exists():  表示文件或者目录是否存在
        boolean isDirectory():  表示File是否为目录
        boolean isFile():  表示File是否为文件
 */

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {
        show03();
    }
    //boolean isFile():  表示File是否为文件
    private static void show03() {
        File f1 = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion\\src\\priv\\lhf\\demo01\\File");
        System.out.println(f1.isFile());
        File f2 = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion\\src\\priv\\lhf\\demo01\\File\\Demo02File.java");
        System.out.println(f2.isFile());
    }

    //boolean isDirectory():  表示File是否为目录
    private static void show02() {
        File f1 = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion\\src\\priv\\lhf\\demo01\\File");
        System.out.println(f1.isDirectory());
        File f2 = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion\\src\\priv\\lhf\\demo01\\File\\Demo02File.java");
        System.out.println(f2.isDirectory());

    }

    //boolean exists():  表示文件或者目录是否存在
    private static void show01() {
        File f1 = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion\\src\\priv\\lhf\\demo01\\File\\Demo02File.java\\a.txt");
        System.out.println(f1.exists());
        File f2 = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion\\src\\priv\\lhf\\demo01\\File\\Demo02File.java");
        System.out.println(f2.exists());
    }
}
