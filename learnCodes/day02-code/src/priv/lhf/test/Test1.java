package priv.lhf.test;

import java.util.Scanner;

//假设一个跑步者m分钟s秒内跑了d公里。编写一个程序显示以每小时多少英里为单位的平均速度值。（注意：1英里等于1.6公里）
//        输入格式:
//        在一行中给出3个正整数，分别是m，s，d。
//        输出格式:
//        输出每小时多少英里为单位的平均速度值。保留小数点后2位。
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt(), s = in.nextInt(), d = in.nextInt();
        double mile = d * 1.0 / 1.6;
        System.out.println(mile);
        double hour = ((s*1.0/60) + m)/60;
        System.out.println(hour);
        double speed = mile / hour;
        System.out.println(String.format("%.2f",speed));
    }
}
