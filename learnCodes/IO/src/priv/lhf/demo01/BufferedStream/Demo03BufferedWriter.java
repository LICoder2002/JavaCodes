package priv.lhf.demo01.BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.BufferedWriter extends Writer
    BufferedWriter: 字符缓冲输出流

    继承自父类的共性成员方法
        void write(int c)
        void write(char[] cbuf)
        void write(char[] cbuf, int off, int len)
        void write(String str)
        void write(String str, int off, int len)
        void flush()
        void close()
    构造方法:
        BufferedWriter(Writer out)
        BufferedWriter(Writer out, int size)

    特有的成员方法:
        void newLine() 写入一个行分隔符。会根据不同的操作系统，获取不同的行分隔符

    使用步骤:
        1. 创建一个字符缓冲输出流，构造方法中传递字符输出流
        2. 调用字符缓冲输出流中的方法write，把数据写入到内存缓冲区中
        3. 调用字符缓冲输出流中的方法flush，把内存缓冲区中的数据刷新到文件中
        4. 释放资源
 */
public class Demo03BufferedWriter {
    public static void main(String[] args) throws IOException {
        //1. 创建一个字符缓冲输出流，构造方法中传递字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("IO\\b.txt"));
        //2. 调用字符缓冲输出流中的方法write，把数据写入到内存缓冲区中
        for (int i = 0; i < 10; i++) {
            bw.write("你好，世界！");
            //bw.write("\r\n");
            bw.newLine();
        }
        //3. 调用字符缓冲输出流中的方法flush，把内存缓冲区中的数据刷新到文件中
        bw.flush();
        //4. 释放资源
        bw.close();
    }
}
