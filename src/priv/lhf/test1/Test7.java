package priv.lhf.test1;

import java.util.Scanner;
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long a =sc.nextInt();
            long b =sc.nextInt();
            shuChu(a,b);
        }
    }
    public static void shuChu(long a,long b){
        long max,min,bei=0;
        if(a<b){
            max = b;
            min = a;
        } else{
            max = a;
            min = b;
        }
        long s1 = max * min;
        long s2 = max % min;
        while(s2!= 0){
            max = min;
            min = s2;
            s2 = max % min;
        }
        bei=s1/min;
        System.out.println(min+" "+bei);
    }
}
