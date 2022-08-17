package priv.lhf.demo04.Reader;

import java.io.FileReader;
import java.io.IOException;

/*
    java.io.Reader: 字符输入流，是字符输入流的最顶层的父类，定义了一些共性的成员方法，是一个抽象类

    共性成员方法:
        int read() 读取单个字符并返回。
        int read(char[] cbuf) 一次读取多个字符，将字符读入数组。
        void close() 关闭该流并释放与之关联的所有资源

    java.io.FileReader extends InputStreamReader extends Reader
    FileReader: 文件字符输入流
    作用: 把硬盘中的数据以字符的方式读取到内存中

    构造方法:
        FileReader(String fileName)
        FileReader(File file)
        参数: 读取文件的数据源
            String fileName: 文件的路径
            File file: 文件
        FileReader构造方法的作用:
            1. 创建一个FileReader对象
            2. 会把FileReader对象指向要读的文件
    字符输入流使用步骤:
        1. 创建FileReader对象，构造方法中绑定要读取的数据
        2. 使用FileReader对象中的方法read读取文件
        3. 释放资源
 */
public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        //1. 创建FileReader对象，构造方法中绑定要读取的数据
        FileReader fr = new FileReader("D:\\JavaCodes\\learnCodes\\IOAndProperties\\c.txt");

        //2. 使用FileReader对象中的方法read读取文件
        //int read() 读取单个字符并返回。
//        int len = 0;
//        while((len = fr.read())!=-1)
//        {
//            System.out.print((char)len);
//        }

        //int read(char[] cbuf) 一次读取多个字符，将字符读入数组。
        char[] cs = new char[1024];
        int len = 0;
        while((len = fr.read(cs))!=-1)
        {
            /*
                String类的构造方法
                String(char[] value)
                String(char[] value, int offset, int length)
             */
            System.out.println(new String(cs, 0, len));
        }

        //3. 释放资源
        fr.close();
    }
}
