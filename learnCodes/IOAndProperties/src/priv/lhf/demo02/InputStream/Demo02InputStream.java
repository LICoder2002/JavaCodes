package priv.lhf.demo02.InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*  字节输入流一次读取多个字节的方法:
        int read(byte[] b): 从输入流中读取一定数量的字节，并将其存储在缓冲区数组b当中
            byte[] 的作用: 起缓冲作用，存储每次读取到的多个字节。数组的长度一般定义为1024或者1024的整数倍
            int: 每次读取到的有效字节个数


    String类的构造方法
        String(byte[] bytes): 把字节数组转换为字符串
        String(byte[] bytes, int offset, int length): 把字节数组的一部分转换为字符串
 */
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        //1. 创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("IOAndProperties\\b.txt");

        //2. 使用FileInputStream对象中的方法read，读取文件
        //int read(byte[] b) 从输入流中读取一定量的字节，并将其存储在缓冲区数组b中

//        byte[] bytes = new byte[2];
//        int len = fis.read(bytes);
//        System.out.println(len);
//       // System.out.println(Arrays.toString(bytes));
//        System.out.println(new String(bytes));
//
//        len = fis.read(bytes);
//        System.out.println(len);
//        System.out.println(new String(bytes));
//
//        len = fis.read(bytes);
//        System.out.println(len);
//        System.out.println(new String(bytes));
//
//        len = fis.read(bytes);
//        System.out.println(len);
//        System.out.println(new String(bytes));

        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes))!=-1)
        {
            //String(byte[] bytes, int offset, int length): 把字节数组的一部分转换为字符串
            System.out.println(new String(bytes, 0 ,len));
        }

        //3. 释放资源
        fis.close();
    }
}
