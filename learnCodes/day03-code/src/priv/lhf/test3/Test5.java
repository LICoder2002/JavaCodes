package priv.lhf.test3;


//房屋交易在日常生活中非常常见的事情，房屋交易时要额外支付各种税费，按2022年房产交易新政策的规定买房人应缴纳税费包括：
//
//        1、契税：首次购房评估额90平（含）内1%、90平-144平（含）内1.5%，超过144平或非首 次3%，买方缴纳。
//
//        2、印花税：房款的0.05%。
//
//        3、交易费：3元/平方米。
//
//        4、测绘费：1.36元/平方米。
//
//        5、权属登记费及取证费：一般情况是在200元内。
//        输入格式:
//        四个数据，以空格分隔：
//        1、第几次购房（整数）
//        2、房款（整数/单位万元）
//        3、评估价（整数/单位万元）
//        4、房屋面积（浮点数/单位平方米）。
//        例如：1 100 100 90。
//        输出格式:
//        契税、印花税、交易费、测绘费（以元为单位），以空格分隔。例如：10000.0 500.0 270.0 122.4
//        输入样例:
//        在这里给出一组输入。例如：
//        1 100 100 90
//        输出样例:
//        在这里给出相应的输出。例如：
//        10000.0 500.0 270.0 122.4
//import java.util.Scanner;
//
//public class Test5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int times = sc.nextInt(), price = sc.nextInt(), valPrice = sc.nextInt();
//        float area = sc.nextFloat();
//        float a = 0, b = 0, c = 0 ,d = 0;
//
//        if(area<=90&&times==1)
//        {
//            a = (float) (valPrice * 10000 * 0.01);
//        }
//        else if(area >90&&area <= 144&&times==1)
//        {
//            a = (float) (valPrice * 10000 * 0.015);
//        }
//        else if(area > 144||times>1)
//        {
//            a = (float) (valPrice * 10000 * 0.03);
//        }
//
//        b = (float) (price * 10000 * 0.0005);
//
//        c = area * 3;
//
//        d = (float) (area * 1.36);
//
//        System.out.println(String.format("%.1f",a) + " " + String.format("%.1f",b) + " " +String.format("%.1f",c) + " "+ String.format("%.1f",d));
//    }
//}

import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in) ;
        int a=sc.nextInt () ;
        int b=sc.nextInt() ;
        int c=sc.nextInt () ;
        float d=sc.nextFloat();
        double q=0.0,w,e;
        float p;
        if(a==1)
        {if(d<=90)
            q=c*10000*0.01;
            if(d>90&&d<=144)
                q=c*10000*0.015;
            if(d>144)
                q=c*10000*0.03;
        }
        else if(a>1)
            q=c*10000*0.03;
        w=b*10000*0.0005;
        e=3*d;
        p=1.36f*d;
        System.out.println(q+" "+w+" "+e+" "+p);
    }
}
