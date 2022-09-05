package priv.lhf.test1;
import java.util.Scanner;
public class Test8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String n = "";
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextLine();
        System.out.println(GetLength(n));
        JudgeHuiwen(n);
        scanner.close();


    }
    public static int GetLength(String ss)
    {
        return ss.length();
    }
    public static boolean JudgeHuiwen(String ss)
    {
        StringBuffer n = new StringBuffer(ss);
        n.reverse();//字符串逆置

        int i,sum = 0;
        for(i = 0;i < ss.length();i++)//直接比较
        {
            if(ss.charAt(i) == n.charAt(i))
                sum++;
        }
        if(sum == ss.length())
        {
            System.out.println("Y");
            return true;
        }

        else
        {
            System.out.println("N");
            return false;
        }
    }
}
