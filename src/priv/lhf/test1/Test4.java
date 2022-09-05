package priv.lhf.test1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 给定一个字符串。请去除串中的数字并反转。
 *
 * 输入格式:
 * 原始串。
 *
 * 输出格式:
 * 去除数字后的反转字符串。
 *
 * 输入样例:
 * 在这里给出一组输入。例如：
 *
 * he11ll00o w0or8ld!
 * 输出样例:
 * 在这里给出相应的输出。例如：
 *
 * !dlrow olleh
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();
        String s = in.nextLine();
        char[] ch = s.toCharArray();

        String[] s1 = new String[s.length()];
        int flag = 0;

        for(int i = 0; i<ch.length; i++) {
            if(ch[i] >= '0' && ch[i] <='9') {
                ch[i] = '0';
            }
            s1[i] = String.valueOf(ch[i]);
            if(s1[i].charAt(0) != '0') {
                array.add(s1[i]);
                flag ++;
            }
        }
        for(int i = flag-1; i >= 0 ; i--) {
            System.out.printf(array.get(i));
        }
    }
}
