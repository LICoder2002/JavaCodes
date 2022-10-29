package priv.lhf.test11;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num;
            num = scanner.nextInt();
            treeSet.add(num);
        }

        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext())
        {
            int num = iterator.next();
            System.out.println(num);
        }
    }
}
