package priv.lhf.demo02.CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    文件复制练习: 一读一写
    明确数据源，数据的目的地

    文件复制的步骤:
        1. 创建一个字节输入流对象，构造方法中绑定要读取的数据源
        2. 创建一个字节输出流对象，构造方法中绑定要写入的目的地
        3. 使用字节输入流对象中的方法read读取文件
        4. 使用字节输出流中的方法write，把读取到的字节写入到目的地的文件中
        5. 释放资源
 */
public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        //1. 创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("E:\\KuGou\\还在流浪.mkv");
        //2. 创建一个字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("D:\\JavaCodes\\learnCodes\\IO\\还在流浪.mkv");

        //3. 使用字节输入流对象中的方法read读取文件
        //4. 使用字节输出流中的方法write，把读取到的字节写入到目的地的文件中

//        int len = 0;
//        while((len = fis.read())!=-1)
//        {
//            fos.write(len);
//        }

        //使用数组缓冲读取多个字节，写入多个字节
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes))!=-1)
        {
            fos.write(bytes, 0, len);
        }


        //5. 释放资源(先关闭写的，后关闭读的; 如果写完了，肯定读取完毕了）
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时: " + (e - s) + "毫秒");
    }
}
