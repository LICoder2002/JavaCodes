package priv.lhf.demo3;

import java.util.Calendar;
import java.util.Date;

public class Demo02Calendar {
    public static void main(String[] args) {
//        demo01();
//        demo02();
//        demo03();
        demo04();
    }

    private static void demo04() {
        Calendar c = Calendar.getInstance();

        Date date = c.getTime();
        System.out.println(date);
    }

    /*
        public abstract void add(int field, int amount); 根据日历的规则，为给定的日历字段添加或减去指定的值
     */
    private static void demo03() {
        Calendar c = Calendar.getInstance();

        c.add(Calendar.YEAR, 2);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        c.add(Calendar.MONTH, -2);
        int month = c.get(Calendar.MONTH) + 1;
        System.out.println(month);

        c.add(Calendar.DAY_OF_MONTH, 10);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }

    /*
        public void set(int field, int value); 将给的的日历字段设置为定值
        参数：
            filed:（YEAR、MONTH...)
            value: 给指定字段设置的值
     */
    private static void demo02() {
        Calendar c = Calendar.getInstance();

        //设置年 9999
        c.set(Calendar.YEAR, 9999);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        //设置月 11
        c.set(Calendar.MONTH, 11);
        int month = c.get(Calendar.MONTH) + 1;
        System.out.println(month);

        //设置天 31
        c.set(Calendar.DAY_OF_MONTH, 31);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        //同时设置年月日
        c.set(8888, 7, 8);
        year = c.get(Calendar.YEAR);
        System.out.println(year);
        month = c.get(Calendar.MONTH) + 1;
        System.out.println(month);
        day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }

    /*
        public int get (int field );
        参数：（YEAR、MONTH...)
        返回值：返回给定日历字段的值
     */
    private static void demo01() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH) + 1;
        System.out.println(month);

        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

//        day = c.get(Calendar.DAY_OF_WEEK);
//        System.out.println(day);
    }
}
