package priv.lhf.test1;

import java.util.Scanner;

public class Text3 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            double a = in.nextDouble();
            double b = in.nextDouble();
            double ret = func(a,b);
            System.out.printf("%.2f%n",ret);
        }
    }
    public static double func(double a , double b)
    {
        double tmp = a*a+b*b;
        return java.lang.Math.sqrt(tmp);
    }
}
