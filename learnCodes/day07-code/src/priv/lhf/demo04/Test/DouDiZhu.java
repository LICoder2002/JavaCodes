package priv.lhf.demo04.Test;
/*
    斗地主综合案例
        1. 准备牌
        2. 洗牌
        3. 发牌
        4. 看牌
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        //        1. 准备牌
        // 定义一个存储54张牌的ArrayList的集合，泛型String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个存储牌的花色，一个存储牌序号
        String[] colors = {"♥", "♠", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3" };
        //把大小王存储到poker中
        poker.add("大王");
        poker.add("小王");
        //组装52张牌
        for(String number : numbers)
        {
            for (String color : colors)
            {
                poker.add(color + number);
            }
        }

        // 2.洗牌
        Collections.shuffle(poker);
//                System.out.println(poker);

        //3.发牌
        //定义四个集合存储玩家和底牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String s = poker.get(i);
            if(i>=51) {
                diPai.add(s);
            }
            else {
                if(i%3 == 0) player01.add(s);
                else if(i%3 == 1) player02.add(s);
                else player03.add(s);
            }
        }

        //4. 看牌
        System.out.println("刘德华:" + player01);
        System.out.println("周润发:" + player02);
        System.out.println("周星驰:" + player03);
        System.out.println("底牌:" + diPai);
    }
}
