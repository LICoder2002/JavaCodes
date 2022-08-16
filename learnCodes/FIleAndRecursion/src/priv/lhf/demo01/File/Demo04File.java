package priv.lhf.demo01.File;

import java.io.File;
import java.io.IOException;

/*
    File类创建删除功能的方法
        boolean createNewFile(): 当且仅当具有该名称文件不存在时，创建一个新的空文件
        boolean delete(): 删除由此File表示的文件或者目录
        boolean mkdir(): 创建由此File表示的目录
        boolean mkdirs(): 创建由此File表示的目录，包括任何必须但不必要的父目录
 */
public class Demo04File {
    public static void main(String[] args) throws IOException {
        show03();
    }
    /*
        boolean delete(): 删除由此File表示的文件或者目录 直接在磁盘删除，不进回收站
     */
    private static void show03() {
        File f1 = new File("FIleAndRecursion\\aaa");
        boolean b1 = f1.delete();
        System.out.println("b1 = " + b1);

    }

    /*
            boolean mkdir(): 创建单极文件夹
            boolean mkdirs(): 既可以创建单级文件夹，也可以创建多级文件夹

           注意：
                此方法只能创建文件夹，不能创建文件
     */
    private static void show02() {
        File f1 = new File("FIleAndRecursion\\aaa");
        boolean b1 = f1.mkdir();
        System.out.println("b1 = " + b1);

        File f2 = new File("FIleAndRecursion\\111\\222\\333\\444\\555\\666");
        boolean b2 = f2.mkdirs();
        System.out.println("b2 = " + b2);

        File f3 = new File("FIleAndRecursion\\abc.txt");
        boolean b3 = f3.mkdirs();//看类型，不看名称
        System.out.println("b3 = " + b3);

        File f4 = new File("FIle\\aaa.txt");
        boolean b4 = f4.mkdirs(); //不会抛异常，路径不存在，不会创建
        System.out.println("b4 = " + b4);


    }

    /*
    boolean createNewFile(): 当且仅当具有该名称文件不存在时，创建一个新的空文件
    注意：
        1. 此方法只能创建文件，不能创建文件夹
        2. 创建文件的路径必须存在，否则会抛异常
     */
    private static void show01() throws IOException {
        File f1 = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion\\1.txt");
        boolean b1 = f1.createNewFile();
        System.out.println("b1 = " + b1);

        File f2 = new File("FIleAndRecursion\\2.txt");
        boolean b2 = f2.createNewFile();
        System.out.println("b2 = " + b2);

        File f3 = new File("FIleAndRecursi\\3.txt");//Exception in thread "main" java.io.IOException: 系统找不到指定的路径。
        boolean b3 = f3.createNewFile();
        System.out.println("b3 = " + b3);
    }
}
