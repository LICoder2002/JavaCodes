package priv.lhf.demo;

import java.util.ArrayList;
import java.util.Random;

// 普通成员
public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list)
    {
        //从多个红包随机抽取一个给我自己
        //随机获取一个集合当前中的索引编号
        int index = new Random().nextInt(list.size());
        //根据索引，从集合中删除，并且得到被删除的红包给我自己
        int delta = list.remove(index);
        //当前成员自己的余额
        int money = super.getMoney();
        //加回去
        super.setMoney(money + delta);
    }
}
