package priv.lhf.test1;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count1 = 0, count2 = 0;
        for (int i = 1; i <= n; i++) {
            if(i%3==0&&i%2==1)
            {
                count1++;
            }
            if(i%3==0&&i%2==0)
            {
                count2++;
            }
        }
        System.out.println(count1 + ","+ count2);
    }
}