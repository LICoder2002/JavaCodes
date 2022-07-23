package priv.lhf.test3;
//班级第一次列队，通常老师会让同学按身高排成一列，然后1、2报数，喊到1的同学向前一步，就这样，队伍就变成两列了。假设现在一个班级有n个同学，并且他们已经按身高排成了一列，同学按身高从1到n编号，你能告诉我最后哪些编号的同学站在了第一列么?
//
//        输入格式:
//        输入一个正整数n，表示班级的人数。
//
//        输出格式:
//        按顺序输出所有在第一列的同学对应的编号，每两个编号之间用一个空格隔开。
//
//        输入样例:
//        11
//        输出样例:
//        1 3 5 7 9 11

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(1);
        for (int i = 3; i <= n; i++) {
            if(i%2==1)
                System.out.print(" " + i);
        }
        System.out.println();
    }
}
