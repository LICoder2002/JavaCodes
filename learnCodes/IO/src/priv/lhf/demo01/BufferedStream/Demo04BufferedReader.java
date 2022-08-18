package priv.lhf.demo01.BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
    java.io.BufferedReader extends Reader
    BufferedReader: 字符缓冲输入流

    继承来自父类的成员方法:
        int read()
        int read(byte[] b)
        void close()

    构造方法:
        BufferedReader(Reader in) 创建一个BufferedReader 并保存其参数，以便使用
        BufferedReader(Reader in, int size) 创建指定缓冲区大小的BufferedReader 并保存其参数，以便使用

    特有的成员方法:
        String readLine() 读取一行文本。
            行的终止符号: 换行（\n）、回车（\r）、或回车后直接换行（\r\n）
    使用步骤:
        1. 创建字符缓冲输入流对象，构造方法中传递字符输入流
        2. 使用字符缓冲输入流对象中的方法read/readLine 读取文件
        3. 释放资源
 */
public class Demo04BufferedReader {
    public static void main(String[] args) throws IOException {
        //1. 创建字符缓冲输入流对象，构造方法中传递字符输入流
        BufferedReader br = new BufferedReader(new FileReader("IO\\b.txt"));

        //2. 使用字符缓冲输入流对象中的方法read/readLine 读取文件
//        String line = br.readLine();
//        System.out.println(line);
//
//        line = br.readLine();
//        System.out.println(line);
//
//        line = br.readLine();
//        System.out.println(line);
//
//        line = br.readLine();
//        System.out.println(line);

        String line = null;
        while((line = br.readLine())!=null)
        {
            System.out.println(line);
        }

        //3. 释放资源
        br.close();
    }
}
