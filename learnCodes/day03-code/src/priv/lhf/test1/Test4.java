package priv.lhf.test1;


//Descriprion
//        This is a very simple problem! Your only job is to calculate a+b+c+d.
//
//        Input Description
//        In the first line, there is a single integer T(T≤200), which indicates the number of test cases.
//
//        In the next T lines, each line contains four integers a,b,c and d(−2
//        61
//        ≤a,b,c,d≤2
//        61
//        ).
//
//        Output Description
//        For each test case, output one line with the answer to a+b+c+d.
//
//        Sample Input
//        1
//        1 2 3 4
//        Sample Output
//        10
import java.math.BigDecimal;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int t=scanner.nextInt();
        for(int i=1;i<=t;++i){
            BigDecimal  sum= BigDecimal.valueOf(0);
            BigDecimal a=scanner.nextBigDecimal();
            sum=sum.add(a);
            BigDecimal b=scanner.nextBigDecimal();
            sum=sum.add(b);
            BigDecimal c=scanner.nextBigDecimal();
            sum=sum.add(c);
            BigDecimal d=scanner.nextBigDecimal();
            sum=sum.add(d);
            System.out.println(sum);
        }
    }
}

