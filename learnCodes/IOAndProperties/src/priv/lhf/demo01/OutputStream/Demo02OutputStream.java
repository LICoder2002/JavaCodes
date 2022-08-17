package priv.lhf.demo01.OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    一次写多个字节
    void write（byte[] b): 将b.length字节从指定的字节数组写入此输出流。
    void write（byte[] b, int off, int len): 从指定的字节数组写入len字节，从偏移量off开始输出到此输出流
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        //1. 创建一个FileOutputStream对象，构造方法中传入写入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("D:\\JavaCodes\\learnCodes\\IOAndProperties\\b.txt"));

        //2. 调用FileOutputStream对象中的方法write，把数据写入到文件中
        fos.write(49);
        fos.write(48);
        fos.write(48);

        /*
            void write（byte[] b): 将b.length字节从指定的字节数组写入此输出流。
            一次写入多个字节：
                如果写的第一个字节是正数（0-127），那么显示的时候会查询ASCII表
                如果写的第一个字节是负数，那第一个字节会和第二个字节组成一个中文显示，查询系统默认码表（GBK）
         */
        byte[] bytes = {65, 66, 67, 68, 69};
        //byte[] bytes = {-65, -66, -67, 68, 69};
        fos.write(bytes);

        /*
            void write（byte[] b, int off, int len): 把字节数组的一部分写入到文件中
                int off: 数组的开始索引
                int len: 字节个数
         */

        fos.write(bytes, 1, 2);

        /*
            写入字符的方法: 可以使用String类中的方法把字符串转换为字符数组
                byte[] getBytes(): 把字符串转换为字节数组
         */

        byte[] bytes1 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes1));
        fos.write(bytes1);

        //3. 释放资源（流使用会占据一定的内存，使用完毕要把内存清空，提高程序效率）
        fos.close();
    }
}
