package priv.lhf.demo03.Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/*
    使用过滤器，实现递归打印多级目录
    File[] listFiles(FileFilter filter)
    java.io.FileFilter接口：用于抽象路径名（File对象）的过滤器
        作用：用来过滤文件（File对象）
        抽象方法：过滤文件的方法
            boolean accept(File pathname)测试指定抽象路径名是否应该包含在某个路径名列表中。
            参数:
                File pathname: 使用ListFiles方法遍历目录，得到的每一个文件对象

    File[] listFiles(FilenameFilter filter)
    java.io.FilenameFilter接口: 实现此接口的类实例可用于过滤文件名。
        作用：用于过滤文件名称
        抽象方法：过滤文件的方法
            boolean accept(File dir, String name)测试指定文件是否应该包含在某一文件列表中。
            参数:
                File dir: 构造方法中传递的被遍历的目录
                String name: 使用ListFiles方法遍历目录，获取每一个文件/文件夹的名称

    注意:
        两个过滤器接口是没有实现类的，需要我们自己实现，重写过滤的方法accept，定义自己的过滤规则



 */
public class Demo02Filter {
    public static void main(String[] args) {
        File file = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion");
        getAllFile(file);

    }

    public static void getAllFile(File dir)
    {
        //传过滤器对象。使用匿名内部类
//        File[] files = dir.listFiles(new FileFilter(){
//            //过滤规则
//            @Override
//            public boolean accept(File pathname) {
//                if(pathname.isDirectory())
//                    return true;
//                return pathname.getName().toLowerCase().endsWith(".java");
//            }
//        }); //传递过滤器


//     //使用Lambda表达式
//        File[] files = dir.listFiles((File pathname)->{
//            return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
//
//        }); //传递过滤器

        //使用Lambda表达式，继续简化
        File[] files = dir.listFiles(pathname-> pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java")); //传递过滤器

//        File[] files = dir.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".java");
//            }
//        });

//        //使用Lambda表达式
//        File[] files = dir.listFiles((File d, String name)-> {
//            return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".java");
//        });

        //使用Lambda表达式,继续简化
        //File[] files = dir.listFiles((d, name)-> new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".java"));

        for (File file : files) {
            if(file.isDirectory())
                getAllFile(file);
            else
                System.out.println(file);
        }

    }
}
