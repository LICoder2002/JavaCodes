package priv.lhf.test1;

//        输入格式:
//        输入数据有4行。第1、2、3、4行的数据含义为如下信息的数量(单位为：万人），若未指定时间即为2020年11月1日标准时点的数据。数据之间用空格作分隔符。
//        全国总人口 2010年全国总人口
//        总家庭户 家庭户总人数 2010年家庭户平均人数
//        0—14岁人口 15—59岁人口 60岁及以上人口
//        具有大学文化程度的人口
//        输出格式:
//        输出数据有4行。第1、2、3、4行的数据含义为如下信息,，若未指定时间即为2020年11月1日标准时点的数据。数据之间用1个空格作分隔符。
//        全国总人口比2010年增加数量(a1) 增长率(a2%) 年平均增长率( a3%)
//        平均每个家庭户的人口(b1) 比2010年减少人数(b2)
//        0—14岁人口占比(c1%) 15—59岁人口占比(c2%) 60岁及以上人口占比(c3%)
//        具有大学文化程度的人口占比（d1%)
//        (说明：a1为整数，a2、a3、b1、b2、c1、c2、c3、d1均保留2位小数；如果为增长率或变化率，均以百分数形式展示数据 )
//        输入样例:
//        141178 133972
//        49416 129281 3.10
//        25338 89438 26402
//        21836
//        输出样例:
//        7206 5.38% 0.54%
//        2.62 0.48
//        17.95% 63.35% 18.70%
//        15.47%

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total2020 = sc.nextInt(), total2010 = sc.nextInt();
        int family = sc.nextInt(), famPeo = sc.nextInt(); double ave2010 = sc.nextDouble();

        int child = sc.nextInt(), young = sc.nextInt(), old = sc.nextInt();
        int colStu = sc.nextInt();

        int a1 = total2020 - total2010;
        double rise = a1*1.0 / total2010;
        double ave2020 = famPeo*1.0 / family;
        System.out.println(a1+" " + String.format("%.2f",rise*100)+"% "+ String.format("%.2f",rise/10*100) +"%");
        System.out.println(String.format("%.2f",ave2020)+ " " + String.format("%.2f",ave2010-ave2020));
        System.out.println(String.format("%.2f",child*1.0/total2020*100)+ "% " + String.format("%.2f",young*1.0/total2020*100) + "% " +String.format("%.2f",old*1.0/total2020*100)+"%");
        System.out.println(String.format("%.2f",colStu*1.0/total2020*100)+"%");
    }
}
