package priv.lhf.demo02.Recursion;

import java.io.File;

//递归打印.java结尾的文件
public class Demo05Recursion {
    public static void main(String[] args) {
        File file = new File("D:\\JavaCodes\\learnCodes\\FIleAndRecursion");
        getAllFile(file);
    }

    public static void getAllFile(File dir)
    {
        //System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isDirectory())
            {
                getAllFile(file);

            }
            else
            {
                //.java结尾的文件

//                //String name = file.getName();
//                //String path = file.getPath();
//                String s = file.toString();
//                s = s.toLowerCase();
//
//                boolean b = s.endsWith(".java");
//                if(b)
//                {
//                    System.out.println(file);
//
//                }

                if(file.getName().toLowerCase().endsWith(".java"))
                {
                    System.out.println(file);
                }

            }
        }

    }
}
