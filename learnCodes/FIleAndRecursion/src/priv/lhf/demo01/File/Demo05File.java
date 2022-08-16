package priv.lhf.demo01.File;

import java.io.File;

/*
    File类遍历（文件夹）目录功能
        String[] list(): 返回一个String数组，表示该File目录中的所有子文件或者目录
        File[] listFile(): 返回一个File数组，表示该File目录中所有的子文件或目录

        注意：
            list方法和listFiles方法遍历的是构造方法中给出的目录
            如果构造方法中给出的目录的路径不存在，会抛出空指针异常
            如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
 */
public class Demo05File {
    public static void main(String[] args) {
        show02();
    }
    //File[] listFile(): 返回一个File数组，表示该File目录中所有的子文件或目录
    private static void show02() {
        File file = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }

    //String[] list(): 返回一个String数组，表示该File目录中的所有子文件或者目录
    private static void show01() {
        File file = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion\\1.txt");//Cannot read the array length because "<local2>" is null
        //File file = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion");
        String[] arr = file.list();
        for (String fileName : arr) {
            System.out.println(fileName);
        }
    }
}
