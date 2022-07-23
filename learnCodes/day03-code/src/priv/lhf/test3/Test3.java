package priv.lhf.test3;
import java.util.Scanner;
public class Test3{
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long  i,j,sum,a;
        for(i=1,sum=0;i<=N;i++)
        {
            for(j=1,a=1;j<=i;j++)
            { a=a*j;
            }
            sum=sum+a;
        }
        System.out.printf("%d",sum);
    }
}