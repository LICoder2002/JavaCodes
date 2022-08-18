package priv.lhf.demo02.CopyFile;

import java.io.*;

/*
    文件复制练习: 一读一写
    明确数据源，数据的目的地

    文件复制的步骤:
        1. 创建一个字节缓冲输入流对象，构造方法中传递字节输入流
        2. 创建一个字节缓冲输出流对象，构造方法中传递字节输出流
        3. 使用字节缓冲输入流对象中的方法read读取文件
        4. 使用字节缓冲输出流中的方法write，把读取到的字节写入到内部缓冲区中
        5. 释放资源（会先把缓冲区中的数据刷新到文件中）
 */
public class Demo02CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        //1. 创建一个字节缓冲输入流对象，构造方法中传递字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\KuGou\\还在流浪.mkv"));

        //2. 创建一个字节缓冲输出流对象，构造方法中传递字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\JavaCodes\\learnCodes\\IO\\还在流浪.mkv"));

        //3. 使用字节缓冲输入流对象中的方法read读取文件
//         //一次读一个字节
//        int len = 0;
//        while((len = bis.read())!=-1)
//        {
//            bos.write(len);
//        }

        //一次读多个字节
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = bis.read(bytes))!=-1)
        {
            bos.write(bytes, 0, len);
        }
        //4. 使用字节缓冲输出流中的方法write，把读取到的字节写入到内部缓冲区中
        //5. 释放资源（会先把缓冲区中的数据刷新到文件中）
        bis.close();
        bos.close();

        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时: " + (e - s) + "毫秒");

    }
}
