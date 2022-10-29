package priv.lhf.test8;

public class Test1 {
    static void proc() throws Exception
    {
        System.out.println("inside proc");

        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args) {
        try {
            proc();
        }

        catch(Exception e)
        {
            System.out.println("捕获"+e);
        }
    }
}