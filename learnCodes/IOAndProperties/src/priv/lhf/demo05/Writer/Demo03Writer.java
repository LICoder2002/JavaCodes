package priv.lhf.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
        void write(char[] buf) 写入字符数组
        void write(char[] buf, int off, int len) 写入字符数组的某一部分
        void write(String str) 写入字符串
        void write(String str, int off, int len) 写入字符串的某一部分
 */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\JavaCodes\\learnCodes\\IOAndProperties\\f.txt");
        //void write(char[] buf) 写入字符数组
        char[] cs = {'a', 'b', 'c', 'd', 'e'};
        fw.write(cs);
        //void write(char[] buf, int off, int len) 写入字符数组的某一部分
        fw.write(cs, 1, 3);

        // void write(String str) 写入字符串
        fw.write("\r\n你好，世界！\r\n");

        //void write(String str, int off, int len) 写入字符串的某一部分
        fw.write("！！你好，世界！！！！", 2, 6);
        fw.flush();



        fw.close();

    }
}
