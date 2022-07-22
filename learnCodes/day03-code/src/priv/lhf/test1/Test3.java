package priv.lhf.test1;
//根据输入的正整数y所代表的年份，计算输出该年份是否为闰年
//        闰年的判断标准：
//
//        能够被4整除且不能被100整除的年份
//
//        或者能够被400整除的年份
//
//        输入格式:
//        输入n取值范围是 【1..3000】
//
//        输出格式:
//        是闰年，输出 yes
//
//        非闰年，输出 no

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(isleapyear(year))
            System.out.println("yes");
        else
            System.out.println("no");
    }
    public static boolean isleapyear(int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
