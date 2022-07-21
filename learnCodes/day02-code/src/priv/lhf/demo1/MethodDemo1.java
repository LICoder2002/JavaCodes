package priv.lhf.demo1;

public class MethodDemo1 {
    public static void main(String[] args) {
        System.out.println(sum(2, 3));
    }

    public static int sum(int a, int b)
    {
        System.out.println("方法");
        return a + b;
    }
}
