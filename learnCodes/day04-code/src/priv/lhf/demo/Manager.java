package priv.lhf.demo;

import java.util.ArrayList;

// 群主类
public class Manager extends User{
    public Manager(){
    }

    public Manager(String name, int age){
        super(name, age);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        //存储若干个红包金额
        ArrayList<Integer> redList = new ArrayList<>();

        // 判断群主余额够不够发红包
        int leftMonet = super.getMoney();
        if(totalMoney > leftMonet){
            System.out.println("余额不足");
            return redList;
        }

        //扣钱，重新设置余额
        super.setMoney(leftMonet - totalMoney);

        //把发的红包分成count分
        int avg = totalMoney / count;
        int mod = totalMoney % count; //余数

        //除不开的零头放如最后一个红包
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        //最后一个红包
        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}
