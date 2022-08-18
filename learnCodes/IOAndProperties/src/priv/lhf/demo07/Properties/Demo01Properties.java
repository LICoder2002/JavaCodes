package priv.lhf.demo07.Properties;
/*
    java.util.Properties extends Hashtable<k,v> implements Map<k,v>
    Properties 类表示一个持久的属性集。Properties可以保存在流中或者从流中加载。
    Properties 集合是一个唯一与IO流相结合的集合
        可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
        可以使用Properties集合中的方法load，把磁盘中保存的文件（键值对），读取到集合中使用
 */

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        //show01();
        //show02();
        show03();
    }

    /*
        可以使用Properties集合中的方法load，把磁盘中保存的文件（键值对），读取到集合中使用
        void load(InputStream inStream)
        void load(Reader, reader)
        参数:
            InputStream inStream: 字节输入流，不能读取含有中文的键值对
            Reader, reader: 字符输入流，可以读取含有中文的键值对
        使用步骤:
            1. 创建Properties对象
            2. 使用Properties对象中的方法load读取保存键值对的文件
            3. 遍历Properties集合
        注意:
            1. 存储键值对的文件中，键与值默认的链接符号可以是 = ， 空格（其他符号）
            2. 存储键值对的文件中，可以使用#进行注释，被注释的键值对不会被读取
            3. 存储键值对的文件中，键与值默认都是字符串，不要加引号
     */
    private static void show03() throws IOException {
        //1. 创建Properties对象
        Properties prop = new Properties();
        //2. 使用Properties对象中的方法load读取保存键值对的文件
        prop.load(new FileReader("D:\\JavaCodes\\learnCodes\\IOAndProperties\\prop.txt"));
        //prop.load(new FileInputStream("D:\\JavaCodes\\learnCodes\\IOAndProperties\\prop.txt"));

        //3. 遍历Properties集合
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println( key + " = " + value);
        }

    }


    /*
        可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
        void store(OutputStream out, String comments)
        void store(Writer writer, String comments)
        参数:
            OutputStream out: 字节输出流，不能写入中文
            Writer writer: 字符输出流，可以写中文
            String comments: 注释，不使用中文，默认是Unicode编码，一般使用空字符串

        使用步骤:
            1. 创建Properties对象，添加数据
            2. 创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
            3. 使用Properties集合中的方法store，把集合中的临时数据，持久化的写入的硬盘中存储
            4. 释放资源

     */

    private static void show02() throws IOException {
        //1. 创建Properties对象，添加数据
        Properties prop = new Properties();
        prop.setProperty("张三", "18");
        prop.setProperty("李四", "17");
        prop.setProperty("王五", "20");
        prop.setProperty("赵六", "19");
//        //2. 创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
//        FileWriter fw = new FileWriter("D:\\JavaCodes\\learnCodes\\IOAndProperties\\prop.txt");
//
//        //3. 使用Properties集合中的方法store，把集合中的临时数据，持久化的写入的硬盘中存储
//        prop.store(fw, "save data");
//
//        //4. 释放资源
//        fw.close();

        prop.store(new FileOutputStream("D:\\JavaCodes\\learnCodes\\IOAndProperties\\prop2.txt"), "save data");

    }





    /*
        使用Properties集合存储数据，遍历取出Properties集合中的数据
        Properties集合是一个双列集合，key和value默认都是字符串
        操作字符串的特有方法:
            Object setProperty(String key, String value) 调用HashTable中的方法 put
            String getProperty(String key) 通过key找到value的值，相当于Map中的get(key)方法
            Set<String> stringPropertyNames() 返回此属性列表中的键值，相当于Map集合当中的keySet方法
     */
    private static void show01() {
        Properties prop = new Properties();
        prop.setProperty("张三", "18");
        prop.setProperty("李四", "17");
        prop.setProperty("王五", "20");
        prop.setProperty("赵六", "19");

        // Set<String> stringPropertyNames() 返回此属性列表中的键值，相当于Map集合当中的keySet方法
        Set<String> set = prop.stringPropertyNames();

        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + " = " + value);

        }
    }
}
