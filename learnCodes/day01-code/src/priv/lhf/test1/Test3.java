package priv.lhf.test1;

import java.util.Scanner;

//计算两个数的和。
//   通过键盘为变量a和b赋值，然后计算变量a与b的和，并将和赋值给变量sum，最终输出变量sum的值；
public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        sum(a, b);
    }
    public static void sum(int a, int b)
    {
        System.out.println(a + b);
    }
}
