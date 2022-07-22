package priv.lhf.test1;


//输入一个华氏温度，输出摄氏温度，其转换公式为：C=5(F-32)/9。
//
//        输入格式:
//        输入数据只有一个实数，即华氏温度。
//
//        输出格式:
//        输出数据只有一个，即摄氏温度，保留2位小数。
//
//        提示：输出数据时小数点保留2位小数的实现方式如下。
//
//        （1) PYTHON实现：
//
//        print("%.2f" %(c))      #其中，c为变量 （方式1）
//        print("{:.2f}".format(c))  #其中，c为变量（方式2）
//        （2）Java实现：
//
//        System.out.printf("%.2f",c);  //c为变量
//        输入样例:
//        32.0
//        输出样例:
//        0.00


import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double ret = 5 * 1.0 * (n-32)/9;
        System.out.println(String.format("%.2f",ret));
    }
}
