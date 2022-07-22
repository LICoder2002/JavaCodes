//        当飞机上的仪器出故障时，飞行员常常得估计他们到最近机场的距离。他们的方法是利用他们的高度和他们和机场之间的角度的估计。编写一个程序，帮助飞行员进行计算。
//        程序应以高度和角度作为输入，输出估计距离。公式为：距离distance=高度hight/ tan(degree)。
//        说明：tan(degree)为角度为degree的正切值。
//        提示：在JAVA中，Math类的静态方法tan(double degree)，用于计算弧度为degree的角度的正切值。
//        在C语言中，函数名: tan， 头文件：<math.h>， 函数原型: double tan(double x); 功能: 正切函数，参 数：double x 为要操作的弧度，返回值：返回x弧度的正切值。
//        输入格式:
//        输入数据有多行。
//        每行为一组输入，分别是高度、角度。角度介于（0，PI/2）区间。
//        输出格式:
//        对应每行输入，求飞行员到机场的距离，保持2位小数。
//        输入样例:
//        在这里给出一组输入。例如：
//        1033102 0.15
//        10210 0.8
//        104320 0.7
//        13200  1.524
//        84535300 0.523
//        输出样例:
//        在这里给出相应的输出。例如：
//        6835613.92
//        9916.10
//        123853.07
//        618.16
//        146622115.56
package priv.lhf.test1;

import java.util.Scanner;

import static java.lang.Math.tan;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextDouble())
        {
            double dis = sc.nextDouble(), angle = sc.nextDouble();
            System.out.println(String.format("%.2f", cal(dis, angle)));
        }
    }
    public static double cal(double dis, double angle)
    {
        return dis/tan(angle);
    }
}
