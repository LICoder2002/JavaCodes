package priv.lhf.demo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    使用日期时间相关的API，计算一个人已经出生了多少天
 */
public class Demo04Test {
    public static void main(String[] args) throws ParseException {
        //1、使用Scanner类中的方法next获取出生日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期，格式：yyyy-MM-dd");
        String birthdayDateString = sc.next();

        //2. 使用DateFormat中的方法parse，把字符串的出生日期解析为Date格式的出生日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = sdf.parse(birthdayDateString);

        //3. 把Date格式的出生日期转换为毫秒值
        long bairthDateTime = birthDate.getTime();

        //4. 获取当前日期转换为毫秒值
        long todayTime = new Date().getTime();

        //5. 使用当前日期的毫秒值 - 出生日期的毫秒值
        long Time = todayTime - bairthDateTime;

        //6. 把差值转换为天数（ms / 1000 / 60 / 60 / 24)

        long day = Time / 1000 / 60 / 60 / 24;
        System.out.println(day);

    }
}
