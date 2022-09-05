package priv.lhf.test1;

import java.util.Scanner;

public class Test6 {
    public static void main( String[] args){
        Scanner in= new Scanner(System.in);
        int dec_num=in.nextInt();
        int binary_num=0,  zero_num=32;
        while(dec_num>0)
        {
            binary_num++;
            dec_num/=2;
        }
        zero_num-=binary_num;

        //负数
        if(dec_num<0)
            zero_num=0;
        System.out.println(zero_num);
    }
}
