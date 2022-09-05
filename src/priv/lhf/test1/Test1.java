package priv.lhf.test1;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(
                System.in
        );
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int b[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<
                    a[i].length
                    ;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int max,s;
        for(int i=0;i<a.length;i++){
            max=a[i][0];

            s = 0;
            ;
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]>max){

                    max = a[i][j]
                    ;
                }
                s+=a[i][j];
            }
            b[i]=max;
            c[i]=s;
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.printf("%3d",
                        a[i][j]
                );
            }
            System.out.printf("%3d%3d",b[i],c[i]);
            System.out.println();
        }
    }
}