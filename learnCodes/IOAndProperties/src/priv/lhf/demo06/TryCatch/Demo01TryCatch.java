package priv.lhf.demo06.TryCatch;

import java.io.FileWriter;
import java.io.IOException;

/*
    在JDK1.7之前使用try catch finally 处理流当中的异常
    格式:
        try{
            可能出现异常的代码
        }catch（异常类变量 变量名）{
            异常的处理逻辑
        }finally{
            一定会指定的代码
            释放资源
        }
 */
public class Demo01TryCatch {
    public static void main(String[] args) {
        FileWriter fw = null;
        try{
            fw = new FileWriter("w:\\IOAndProperties\\g.txt", true);
            for (int i = 0; i < 10; i++) {
                fw.write((i+1) + ": Hello World!\r\n");
            }

            fw.flush();
        }catch (IOException e){
            System.out.println(e);
        }finally {
            if(fw!=null)
            {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }
}
