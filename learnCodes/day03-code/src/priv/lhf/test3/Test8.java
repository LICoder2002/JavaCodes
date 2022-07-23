package priv.lhf.test3;


//369寝室是比较特殊的寝室，因为别的寝室都住了四个人，而369寝室只有三个人。也因为这个原因，寝室里的三位同学感情特别好。但是，毕业在即，三位小伙伴马上要分别。为了在未来的某个日子可以见面，三位小伙伴有了一个约定，假设在未来的某一年，三位小伙伴的年龄的末尾正好出现3、6、9三个数，那么他们会再次相聚。
//
//        现在问题来了，假设今年三位小伙伴的年龄分别是x，y，z，那么，他们三人最早几年后可以相聚呢?
//
//        输入格式:
//        输入数据包括三个整数x，y，z，分别表示三位伙伴的年龄。
//
//        输出格式:
//        如果小伙伴最早在n年后可以相见(不包括当前这一年)，那么请输出这个n；如果100年内都不存在这样的情况，输出:so sad!
//
//        输入样例:
//        25 22 28
//        输出样例:
//        1
//import java.util.Scanner;
//
//public class Test8 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
//        int i = 0;
//        for ( i = 0; i < 100; i++,x++,y++,z++) {
//            if(   (x%10==3&&y%10==6&&z%10==9)
//                ||(x%10==3&&y%10==9&&z%10==6)
//                ||(x%10==6&&y%10==3&&z%10==9)
//                ||(x%10==6&&y%10==9&&z%10==3)
//                ||(x%10==9&&y%10==6&&z%10==3)
//                ||(x%10==9&&y%10==3&&z%10==6)
//            )
//            {
//                System.out.println(i);
//                break;
//            }
//        }
//        if(i>=100)
//            System.out.println("so sad!");
//    }
//}


import java.util.Scanner;

public class Test8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        //读取三位同学年龄
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        int flag = 0;
        //判断年龄末尾数字是否为3、6、9
        for(int i = 1; i <= 100; i++) {
            int A = a + i, B = b + i, C = c + i;
            A %= 10;
            B %= 10;
            C %= 10;
            //如果有一个数字个位数为0，则不符合条件，继续循环
            if(A == 0 || B == 0 || C == 0) continue;
            //判断是否是3的倍数
            if(A % 3 == 0 && B % 3 == 0 && C % 3 == 0) {
                //判断是否三个数字个位数相等
                if(A != B && B != C && C != A) {
                    flag = i;
                    break;
                }
            }
        }
        //条件不成立则输出so sad！
        if(flag == 0) System.out.println("so sad!");
            //条件成立则输出年数
        else System.out.println(flag);
    }
}