package priv.lhf.demo02.Recursion;
/*
    计算阶乘
 */
public class Demo03Recursion {
    public static void main(String[] args) {
        System.out.println(jc(5));
    }

    private static int jc(int n)
    {
        if(n==1)
            return 1;
        return n * jc(n-1);
    }
}
