package priv.lhf.demo06.TryCatch;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    JDK7的新特性
    在try的后面可以增加一个()，在括号中定义流对象
    那么这个流对象在作用域就在try中有效
    try中的代码执行完毕，就会自动把流对象释放，不用写finally
    格式:
        try(定义流对象){
            可能出现异常的代码
        }catch(异常类变量 变量名){
            异常的处理逻辑
        }

 */
public class Demo02JDK7 {
    public static void main(String[] args) {
        try(        //1. 创建一个字节输入流对象，构造方法中绑定要读取的数据源
                    FileInputStream fis = new FileInputStream("C:\\Users\\Lihaifei\\Pictures\\Saved Pictures\\R-C.jpg");
                    //2. 创建一个字节输出流对象，构造方法中绑定要写入的目的地
                    FileOutputStream fos = new FileOutputStream("D:\\JavaCodes\\learnCodes\\IOAndProperties\\R-c.jpg");){
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

    }
}
