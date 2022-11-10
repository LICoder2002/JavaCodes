package d7_thread_comunitation;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId;
    private double money;

    private final Lock lock = new ReentrantLock();

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public Account() {
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public synchronized void drawMoney(double money) {
        try {
            String name = Thread.currentThread().getName();

            if(this.money >= money)
            {
                this.money -= money;
                System.out.println(name + "来取钱，共：" + money + "。余额是" + this.money);

                this.notifyAll();
                this.wait();
            }
            else {
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public synchronized void depositMoney(int money) {
        try {
            String name = Thread.currentThread().getName();
            if(this.money == 0)
            {
                this.money += money;
                System.out.println(name + "存钱" + money + "成功! 存钱后余额是：" + this.money);

                this.notifyAll();
                this.wait();
            }
            else
            {
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
