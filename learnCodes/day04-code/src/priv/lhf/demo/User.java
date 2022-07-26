package priv.lhf.demo;

// 用户类
public class User {

    private String name;
    private int money;


    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public User() {
    }

    //展示当前用户的余额
    public void show() {
        System.out.println("我叫：" + name + ", 我的红包余额为：" + money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
