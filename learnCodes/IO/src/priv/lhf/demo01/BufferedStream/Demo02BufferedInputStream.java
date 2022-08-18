package priv.lhf.demo01.BufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
    java.io.BufferedInputStream extends InputStream
    BufferedInputStream: 字节缓冲输入流

    继承来自父类的成员方法:
        int read()
        int read(byte[] b)
        void close()

    构造方法:
        BufferedInputStream(InputStream in) 创建一个BufferedInputStream 并保存其参数，以便使用
        BufferedInputStream(InputStream in, int size) 创建指定缓冲区大小的BufferedInputStream 并保存其参数，以便使用

    使用步骤:
        1. 创建FileInputStream对象，构造方法中绑定要读取的数据源
        2. 创建BufferedInputStream对象，构造方法中传递FileInputStream对象
        3. 使用BufferedInputStream对象中的方法read 读取文件
        4. 释放资源
 */
public class Demo02BufferedInputStream {
    public static void main(String[] args) throws IOException {
        //1. 创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("D:\\JavaCodes\\learnCodes\\IO\\a.txt");
        //2. 创建BufferedInputStream对象，构造方法中传递FileInputStream对象
        BufferedInputStream bis = new BufferedInputStream(fis);
        //3. 使用BufferedInputStream对象中的方法read 读取文件
//        int len = 0;
//        while((len = bis.read())!=-1)
//        {
//            System.out.println(len);
//        }

        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = bis.read(bytes))!=-1)
        {
            System.out.println(new String(bytes, 0, len));
        }

        //4. 释放资源
        bis.close();
    }

}
