package priv.lhf.demo01.OutputStream;
/*
    java.io.OutputStream: 此抽象类是表示输出字节流的所有类的超类
    定义了一些子类的共性的成员方法：
        void close(): 关闭此输出流并释放与此流相关的任何系统资源
        void flush(): 刷新此输出流并强制任何缓冲的输出字节被写出
        void write（byte[] b): 将b.length字节从指定的字节数组写入此输出流。
        void write（byte[] b, int off, int len): 从指定的字节数组写入len字节，从偏移量off开始输出到此输出流
        abstract void write(int b): 将指定的字节输出流

    java.io.FileOutputStream extends OutputStream
    FileOutputStream: 文件字节输出流
    作用: 把内存中的数据写入到硬盘的文件中

    构造方法:
        FileOutputStream(String name)创建一个向具有指定名称的文件中写入数据的输出文件流
        FileOutputStream(File file) 创建一个向指定file对象表示的文件中写入数据的文件输出流

        参数：写入数据的目的
            String name: 目的是一个文件的路径
            File file: 目的是一个文件
        构造方法的作用：
            1. 创建一个FileOutputStream对象
            2. 会根据构造方法中传递的文件/文件路径，创建一个空文件
            3. 会把FileOutputStream对象指向创建好文件


    写入数据的原理（内存--->硬盘）
    java程序--->JVM(Java虚拟机)--->OS(操作系统)--->OS调用写数据的方法--->把数据写入到文件中

    步骤：
        1. 创建一个FileOutputStream对象，构造方法中传入写入数据的目的地
        2. 调用FileOutputStream对象中的方法write，把数据写入到文件中
        3. 释放资源（流使用会占据一定的内存，使用完毕要把内存清空，提高程序效率）
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个FileOutputStream对象，构造方法中传入写入数据的目的地
        FileOutputStream fos = new FileOutputStream("D:\\JavaCodes\\learnCodes\\IOAndProperties\\a.txt");
        //2. 调用FileOutputStream对象中的方法write，把数据写入到文件中
        fos.write(97);
        fos.write(20);
        //3. 释放资源（流使用会占据一定的内存，使用完毕要把内存清空，提高程序效率）
        fos.close();
    }
}
