package priv.lhf.test1;

import java.util.Scanner;

/**
 * 本题目要求读入2个整数和一个字符，然后根据这个字符值，对两个整数进行相应的二进制位的运算。要求必须使用switch选择结构。
 *
 * (1)如果字符是&，则两个整数进行二进制位的与运算；
 *
 * (2)如果字符是 |，则两个整数进行二进制位的或运算；
 *
 * (3)如果字符是^，则两个整数进行二进制位异或运算；
 *
 * (4)如果是其他字符，则固定输出信息：ERROR
 *
 * 输入格式:
 * 在一行中依次输入整数1，字符，整数2。
 *
 * 输出格式:
 * 类似3 & 4 = 0
 *
 * 其中，运算符号&的前后都有一个空格，等号的前后也都有一个空格。
 * 上面表示3和4做二进制的与运算，结果是0。
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String c = sc.next();
        int b = sc.nextInt();

        switch (c.charAt(0))
        {
            case '&':
                System.out.println(a + " " + c + " " + b + " " + "=" + " " + (a & b));
                break;
            case '|':
                System.out.println(a + " " + c + " " + b + " " + "=" + " " + (a | b));
                break;
            case '^':
                System.out.println(a + " " + c + " " + b + " " + "=" + " " + (a ^ b));
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
