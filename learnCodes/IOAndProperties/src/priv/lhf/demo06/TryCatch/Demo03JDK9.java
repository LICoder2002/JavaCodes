package priv.lhf.demo06.TryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    JDK9新特性
    try的前面可以定义对象
    在try的（）后面可以之间引入流对象的名称（变量名）
    在try代码执行完毕之后，流对象也会释放掉，不用写finally
 */
public class Demo03JDK9 {
    public static void main(String[] args) throws IOException {
        //1. 创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("C:\\Users\\Lihaifei\\Pictures\\Saved Pictures\\R-C.jpg");
        //2. 创建一个字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("D:\\JavaCodes\\learnCodes\\IOAndProperties\\R-c.jpg");

        try(fis; fos){
            //3. 使用字节输入流对象中的方法read读取文件
            //4. 使用字节输出流中的方法write，把读取到的字节写入到目的地的文件中

            int len = 0;
            while((len = fis.read())!=-1)
            {
                fos.write(len);
            }
        }catch (IOException e){
            System.out.println(e);
        }

       // fos.write(1);//Exception in thread "main" java.io.IOException: Stream Closed

    }
}
