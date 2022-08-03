package priv.lhf.demo2;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
//        demo01();
//        demo02();
        demo03();
    }
    /*
    long getTime() 把日期转换为毫秒
    返回至时间原点以来此date的毫秒值
     */
    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    /*
    Date带参数构造方法
    Date(long date) :传递毫秒值，吧毫秒值转换为Date日期
     */
    private static void demo02() {
        Date date = new Date(1659514785386L);
        System.out.println(date); //Thu Jan 01 08:00:00 GMT+08:00 1970
    }

    /*
    Date类的空参构造
    Date() 获取当前系统的日期和时间
     */
    private static void demo01() {
        Date date = new Date();
        System.out.println(date);
    }
}
