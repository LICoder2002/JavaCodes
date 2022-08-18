package priv.lhf.demo01.BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    java.io.BufferedOutputStream extends OutputStream
    BufferedOutputStream: 字节缓冲输出流

    继承自父类的共性成员方法:
        void close
        void flush
        void write(byte[] b)
        void write(byte[] b, int off, int len)
        void write(int b)

    构造方法:
        BufferedOutputStream(OutputStream out) 创建一个新的缓冲输出流，以将数据写入指定的底层输出流
        BufferedOutputStream(OutputStream out, int size) 创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入指定的底层输出流
        参数:
            OutputStream out: 字节输出流
                我们可以传递FileOutputStream对象，缓冲流会给其增加一个缓冲区，提高FileOutputStream的写入效率
        使用步骤:
            1. 创建FileOutputStream对象，构造方法中绑定输出目的地
            2. 创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象
            3. 使用BufferedOutputStream对象中的方法write，把数据写入到内部缓冲区中
            4. 使用BufferedOutputStream对象中的方法flush，把内部缓冲区中的数据刷新到文件中
            5. 释放资源（会先调用flush方法刷新数据，第4部可以省略）
 */
public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
       // 1. 创建FileOutputStream对象，构造方法中绑定输出目的地
        FileOutputStream fos = new FileOutputStream("D:\\JavaCodes\\learnCodes\\IO\\a.txt");
       // 2. 创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象
        BufferedOutputStream bos = new BufferedOutputStream(fos);
       // 3. 使用BufferedOutputStream对象中的方法write，把数据写入到内部缓冲区中
        bos.write("我把数据写入到内部缓冲区中".getBytes());
       // 4. 使用BufferedOutputStream对象中的方法flush，把内部缓冲区中的数据刷新到文件中
        bos.flush();
       // 5. 释放资源（会先调用flush方法刷新数据，第4部可以省略）
        bos.close();
    }
}
