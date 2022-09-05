package priv.lhf.test1;


import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Test5 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        Vector<Integer> vec = new Vector<>();
        for (int i = 0; i < n; ++i)
            vec.add(cin.nextInt());
        Collections.sort(vec);
        boolean NotFind = true;
        int num = cin.nextInt();
        for (int i = 0; i < n; ++i)
            if (vec.get(i) == num) {
                System.out.print(i + 1);
                NotFind = false;
            }
        if (NotFind)
            System.out.print(-1);
    }
}

