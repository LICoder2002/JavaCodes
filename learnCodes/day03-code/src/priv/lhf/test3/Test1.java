package priv.lhf.test3;

//在进行数据处理时，输入数据未经过滤，存在一些不符合要求的数据
//        要求编写数据处理程序，小于0的数据一律指定为0，大于100的数据一律指定为100
//
//        输入格式:
//        输入：所有元素占一行，元素之间使用空格分开，元素均为整数，范围【-300...300】
//
//        输出格式:
//        输出：所有元素占一行，元素之间使用西文逗号分开，最后一个元素末尾保留西文逗号

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt())
        {
            int n = sc.nextInt();
            System.out.print(func(n) + ",");
        }

    }
    public static int func(int n)
    {
        if(n<0)
            return 0;
        else if(n>=100)
            return 100;
        else
            return n;
    }
}
