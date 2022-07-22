package priv.lhf.test1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        double P = in.nextDouble();
        int N = in.nextInt();
        double ret1 = M * Math.pow(1+P,N);
        double ret2 = M + M*P*N;
        double ret3 = ret1 - ret2;
        System.out.print(Math.round(ret1)+" ");
        System.out.print(Math.round(ret2)+" ");
        System.out.println(Math.round(ret3));

    }
}
