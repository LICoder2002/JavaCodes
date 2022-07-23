package priv.lhf.test3;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        if((b%4==0&&b%100!=0)||b%400==0) {
            switch(a){
                case 1:System.out.println("31"); break;
                case 2:System.out.println("29"); break;
                case 3:System.out.println("31"); break;
                case 4:System.out.println("30"); break;
                case 5:System.out.println("31"); break;
                case 6:System.out.println("30"); break;
                case 7:System.out.println("31"); break;
                case 8:System.out.println("31"); break;
                case 9:System.out.println("30"); break;
                case 10:System.out.println("31"); break;
                case 11:System.out.println("30"); break;
                case 12:System.out.println("31"); break;
            }
        }
        else
        {
            switch(a){
                case 1:System.out.println("31"); break;
                case 2:System.out.println("28"); break;
                case 3:System.out.println("31"); break;
                case 4:System.out.println("30"); break;
                case 5:System.out.println("31"); break;
                case 6:System.out.println("30"); break;
                case 7:System.out.println("31"); break;
                case 8:System.out.println("31"); break;
                case 9:System.out.println("30"); break;
                case 10:System.out.println("31"); break;
                case 11:System.out.println("30"); break;
                case 12:System.out.println("31"); break;
            }
        }

        in.close();

    }

}
