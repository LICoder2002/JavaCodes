package priv.lhf.test4;

import java.util.ArrayList;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            list.add((r.nextInt(33)+1));
        }
        System.out.println(list);
    }
}
