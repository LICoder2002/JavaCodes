package priv.lhf.demo02.Recursion;
//计算1-n之间的和
public class Demo02Recursion {
    public static void main(String[] args) {
        int Sum = sum(100);
        System.out.println(Sum);
    }

    public static int sum(int n)
    {
        if(n==1)
            return 1;
        return n + sum(n-1);
    }
}
