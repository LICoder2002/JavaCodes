package priv.lhf.demo04.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
    斗地主综合案例：有序版本
 */
public class DouDiZhu {
    public static void main(String[] args) {
        // 1、准备牌

        HashMap<Integer, String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();

        List<String> colors = List.of("♥", "♠", "♣", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;

        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;

        for(String number : numbers){
            for(String color : colors){
                poker.put(index, color + number);
                pokerIndex.add(index);
                index++;
            }
        }

        //System.out.println(poker);
        //System.out.println(pokerIndex);


        // 2、洗牌
        Collections.shuffle(pokerIndex);
        //System.out.println(pokerIndex);

        // 3、 发牌
        //定义四个集合，存储玩家牌的索引， 和牌的索引
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            if(i >= 51)
            {
                diPai.add(in);
            }
            else if(i%3==0) {
                player01.add(in);
            }
            else if(i%3==1) {
                player02.add(in);
            }
            else if(i%3==2) {
                player03.add(in);
            }

        }

        // 4、 排序

        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);

        // 5、看牌

        lookPoker("刘德华" , poker, player01);
        lookPoker("周润发" , poker, player02);
        lookPoker("周星驰" , poker, player03);
        lookPoker("底牌" , poker, diPai);

    }

    public static void lookPoker(String name, HashMap<Integer, String> poker, ArrayList<Integer> list)
    {
        System.out.println(name + ":  ");

        for (Integer key : list) {
            String value = poker.get(key);
            System.out.print(value + " ");
        }
        System.out.println();
        
    }
}
