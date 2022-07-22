package test;



//输入若干对浮点数，对每对浮点数输出其精确的和与乘积。
//        以下输入样例为两对浮点数输入，实际上有可能有不定对数的浮点数需要输入计算。
//
//        注1：直接使用double类型数据进行运算，无法得到精确值。
//        注2：输出时直接调用BigDecimal的toString方法。
//
//        输入样例:
//        69.1 0.02
//        1.99 2.01
//        输出样例:
//        69.12
//        1.382
//        4.00
//        3.9999
import java.util.Scanner;
import java.math.BigDecimal;

public class Test1{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        BigDecimal a,b;

        while(input.hasNext()) {

            a=input.nextBigDecimal();
            b=input.nextBigDecimal();
//             System.out.println(String.format("%.2f",a+b));
//             System.out.println(String.format("%.3f",a*b));//double 无法得到精确的乘积

            System.out.println(a.add(b));
            System.out.println(a.multiply(b));
        }
    }
}