package priv.lhf.demo02.Recursion;

public class Demo01Recursion {
    public static void main(String[] args) {
       // a();
        b(1);
    }

    private static void b(int i) {
        System.out.println(i);
        if(i==20000)
        {
            return;
        }
        b(++i);
    }

    private static void a(){
        System.out.println("a方法");
        a();
    }
}
