package priv.lhf.test;
//        假设在平面内，有一个三角形，边长分别为a、b、c，三角形的面积S可由以下公式求得：
//        而公式里的p为半周长（周长的一半）：
//
//        提示 各种编程语言求平方根的方法是：
//        （1）在Java语言中，调用Math类的静态方法sqrt(double d)，返回一个double数据类型的值；
//        （2）在C语言中， 头文件：#include <math.h> ，sqrt() 函数用来求给定值的平方根，其原型为： double sqrt(double x);
//        （3）在Python语言中，导入 math 模块：import math，通过静态对象调用方法sqrt()，形式为：math.sqrt( x )。
//        输入格式:
//        输入若干行。每行有3个数值。
//        输出格式:
//        对于每一行输入，有一行输出。
//        若三个数值能够构成三角形的边，则计算它的面积，保留2位小数；如果不能构造三角形，则输出“Input Error!"。
//        输入样例:
//        3  4  5.0
//        1  2  3.0
//        -3 0 -2
//        输出样例:
//        6.00
//        Input Error!
//        Input Error!

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Test6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextDouble())
        {
            double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
            if(!isTriangle(a, b, c))
            {
                System.out.println("Input Error!");
            }
            else {
                double p = (a + b + c)/2;
                double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));

                System.out.printf("%.2f%n",s);
            }
        }

    }
    public static boolean isTriangle(double a,double b,double c)
    {
        return a + b > c && a + c > b && b + c > a;
    }
}
