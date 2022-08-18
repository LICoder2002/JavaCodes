package priv.lhf.demo01.BufferedStream;

import java.io.*;
import java.util.HashMap;

/*
    练习:
        对文本的内容进行排序
    步骤:
        1. 创建一个HashMap集合对象
        2. 创建一个字符缓冲输入流对象，构造方法中绑定字符输入流
        3. 创建一个字符缓冲输出流对象，构造方法中绑定字符输出流
        4. 使用字符缓冲输入流中的对象readLine方法，逐行读取文本
        5. 对读取的文本进行切割，获取行中的序号和内容
        6. 切割好后存储到HashMap中
        7， 遍历HashMap, 获取每一个键值对
        8. 把键值对拼接成文本行
        9. 把拼接好的文本，使用字符缓冲输出流中的对象write,写入的文件中
        10. 释放资源
 */
public class Demo05Test {
    public static void main(String[] args) throws IOException {
        //1. 创建一个HashMap集合对象
        HashMap<String, String> map = new HashMap<>();
        //2. 创建一个字符缓冲输入流对象，构造方法中绑定字符输入流
        BufferedReader br = new BufferedReader(new FileReader("IO\\in.txt"));
        //3. 创建一个字符缓冲输出流对象，构造方法中绑定字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("IO\\out.txt"));
        //4. 使用字符缓冲输入流中的对象readLine方法，逐行读取文本
        String line = null;
        while ((line = br.readLine())!=null)
        {
            //5. 对读取的文本进行切割，获取行中的序号和内容
            String[] arr = line.split("\\.");
            //6. 切割好后存储到HashMap中
            map.put(arr[0], arr[1]);
        }
        //7， 遍历HashMap, 获取每一个键值对
        for (String key : map.keySet()) {
            String value = map.get(key);
            //8. 把键值对拼接成文本行
            line = key + "." + value;
            //9. 把拼接好的文本，使用字符缓冲输出流中的对象write,写入的文件中
            bw.write(line);
            bw.newLine();
        }
        //10. 释放资源
        bw.close();
        br.close();
    }
}
