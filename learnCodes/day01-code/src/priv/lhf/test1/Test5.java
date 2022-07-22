package priv.lhf.test1;
//求一个三位正整数各位数字之和

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ret = 0;
        while(n!=0) {
            ret = ret + n%10;
            n/=10;
        }
        System.out.println(ret);
    }
}
