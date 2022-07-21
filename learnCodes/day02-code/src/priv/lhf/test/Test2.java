//新的一学期开始，HH同学在学校认识了很多的同学，但是他却不知道自己本班男生和女生的比例是多少。对于学过编程的你一定简单极了吧。你能帮他算出男生女生的百分比吗？
//        输入格式:
//        每行输入正整数男生和女生的数目n,m(0<n,m<1000)。
//        输出格式:
//        输出男生女生所占的比例（保留小数点后两位）。

package priv.lhf.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int male = in.nextInt(), female = in.nextInt();
        double rate1 = male*1.0 / (male + female);
        double rate2 = 1 - rate1;

        System.out.println(String.format("%.2f",rate1*100) + "% "+String.format("%.2f",rate2*100) + "%");
    }
}
