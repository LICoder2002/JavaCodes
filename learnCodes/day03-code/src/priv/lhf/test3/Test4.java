package priv.lhf.test3;
//巴比伦法求n的近似值可以用以下公式：
//        nextGuess = (lastGuess+n/lastGuess)/2
//        程序初始运行时lastGuess可赋予一个最初的猜测值。当由公式求得的nextGuess和lastGuess相差较大时，把nextGuess的值赋给lastGuess，继续以上过程，直至nextGuess和lastGuess几乎相同，此时lastGuess或者nextGuess就是平方根的近似值。
//        本题要求：nextGuess和lastGuess的差值小于0.00001时认为两者几乎相同
//
//        输入格式:
//        1、两个浮点数，以空格分隔，第一个是n，第二个是lastGuess最初的猜测值。例如：2 1。
//        2、若输入的两个数中包含负数或者lastGuess初始输入为0，认定为非法输入
//
//        输出格式:
//        1、输出n的平方根近似值：lastGuess。例如：1.4142157
//        2、非法输入时输出："Wrong Format"
//
//        输入样例:
//        在这里给出一组输入。例如：
//
//        2 1
//        输出样例:
//        在这里给出相应的输出。例如：
//
//        1.4142157

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat(), lastGuess = sc.nextFloat();
        float nextGuess = 0;
        if(lastGuess <= 0|| n < 0)
        {
            System.out.println("Wrong Format");
        }
        else
        {
            while (true)
            {
                nextGuess = (lastGuess + n / lastGuess)  / 2;
                if(Math.abs(lastGuess - nextGuess) < 0.00001)
                {
                    System.out.println(lastGuess);
                    break;
                }
                lastGuess = nextGuess;

            }
        }
    }
}