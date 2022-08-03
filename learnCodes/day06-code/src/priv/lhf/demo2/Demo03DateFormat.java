package priv.lhf.demo2;
/*
    java.text.DateFormat: 是日期/时间格式化子类的抽象类
    作用：
        格式化（也就是日期 -> 文本）、解析（文本 -> 日期）
        成员函数：
            String format(Date date) 按照指定的模式，把Date日期格式化为符合模式的字符串
            Date parse(String source） 把符合模式的字符串。解析为Date日期
        DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat类得到子类

        java.text.SimpleDateFormat extends DateFormat

        构造方法：
        SimpleDateFormat(String pattern)
        用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。
        参数：
            String pattern: 传递指定的模式
        模式（区分大小写）
            y   年
            M   月
            d   日
            H   时
            m   分
            s   秒
            写对应的模式，会把模式替换为对应的日期和时间
            “yyyy-MM-dd HH:mm:ss"
            注意：模式中的字母不能改。连接模式的符号可以该
            
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Demo03DateFormat {
    public static void main(String[] args) throws ParseException {
//        demo01();
        demo02();
    }

    /*
    使用DateFormat类中的parse，把文本解析成日期
    使用步骤：
        1. 创建SimpleDateFormat对象，构造方法中传入指定的模式
        2. 调用SimpleDateFormat对象中的parse方法，把符合构造方法中模式的字符串解析为Date日期
        注意：
            public Date parse(String source) throws ParseException
            parse方法中声明了一个异常叫ParseException
            如果字符串和构造方法的模式不一样，那么程序就会抛异常
            调用一个抛出了异常的方法，就必须处理这个异常，要么throws继续抛出这个异常，要么try catch自己处理
     */
    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date =  sdf.parse("2022年08月03日 16时50分23秒");
        System.out.println(date);
    }

    private static void demo01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String s = sdf.format(date);
        System.out.println(date);
        System.out.println(s);

    }
}
