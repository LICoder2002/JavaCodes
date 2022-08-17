package priv.lhf.demo02.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
    java.io.InputStream:字节输入流
    此抽象类是表示字节输入流的所有类的超类

    定义了所有子类的共性方法：
        int read(): 从输入流中读取数据的下一个字节
        int read(byte[] b): 从输入流中读取一定数量的字节，并将其存储在缓冲区数组b当中
        void close(): 关闭此输入流并释放与该流关联的所有系统资源

    java.io.FileInputStream extends InputStream
    FileInputStream: 文件字节输入流
    作用: 读取磁盘文件中的内容，读取到内存中使用

    构造方法:
        FileInputStream(String name)  name: 文件的路径
        FileInputStream(File file) file: 文件

        构造方法的作用:
            1. 创建一个FileInputStream对象
            2. 会把FileInputStream对象指定构造方法中要读取的文件

        读取数据的原理（磁盘--->内存）
        Java程序--->JVM--->OS--->OS读取数据的方法--->读取文件

        字节输入流的使用方法
            1. 创建FileInputStream对象，构造方法中绑定要读取的数据源
            2. 使用FileInputStream对象中的方法read，读取文件
            3. 释放资源
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {

        //1. 创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("D:\\JavaCodes\\learnCodes\\IOAndProperties\\a.txt");

        //2. 使用FileInputStream对象中的方法read，读取文件
        //  int read(): 从输入流中读取数据的下一个字节,读取到文件末尾返回-1
//        int len = fis.read();
//        System.out.println(len);
//
//        len = fis.read();
//        System.out.println(len);
//
//        len = fis.read();
//        System.out.println(len);
        int len = 0;
        while((len = fis.read())!=-1)
        {
            System.out.print((char)len);
        }

        //3. 释放资源
        fis.close();

    }
}
