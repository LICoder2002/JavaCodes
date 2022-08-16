package priv.lhf.demo01.File;

import java.io.File;

/*
    File获取功能的方法：
        getAbsolutePath(): 返回File的绝对路径名字字符串
        getPath(): 将此File转换为路径名字符串
        getName(): 返回由此File表示的文件夹或者目录的名称
        length(): 返回由此File表示的文件的长度
        文件夹没有大小概念
 */
public class Demo02File {
    public static void main(String[] args) {
        show04();
    }

    //length(): 返回由此File表示的文件的长度
    private static void show04() {
        //路径不存在返回0
        File f1 = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion\\src\\priv\\lhf\\demo01\\File\\Demo02File.java\\a.txt");
        long length1 = f1.length();
        System.out.println(length1);

        File f2 = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion\\src\\priv\\lhf\\demo01\\File\\Demo02File.java");
        long length2 = f2.length();
        System.out.println(length2);

        //文件夹没有大小概念
        File f3 = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion");
        System.out.println(f3.length());

    }

    //getName(): 返回由此File表示的文件夹或者目录的名称
    private static void show03() {
        File f1 = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion\\src\\priv\\lhf\\demo01\\File\\Demo02File.java\\a.txt");
        String name1 = f1.getName();
        System.out.println(name1);

        File f2 = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion\\src\\priv\\lhf\\demo01\\File");
        String name2 = f2.getName();
        System.out.println(name2);


    }

    //getPath(): 将此File转换为路径名字符串
    private static void show02() {
        File f1 = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion\\src\\priv\\lhf\\demo01\\File\\Demo02File.java\\a.txt");
        File f2 = new File("b.txt");
        String path1 = f1.getPath();
        String path2 = f2.getPath();
        System.out.println(path1);
        System.out.println(path2);

        System.out.println(f1);
        System.out.println(f1.toString());

    }

    //getAbsolutePath(): 返回File的绝对路径名字字符串
    private static void show01() {
        File f1 = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion\\src\\priv\\lhf\\demo01\\File\\Demo02File.java\\a.txt");
        String path1 = f1.getAbsolutePath();
        System.out.println(path1);

        File f2 = new File("b.txt");
        String path2 = f2.getAbsolutePath();
        System.out.println(path2);
    }
}
