package d6_thread_synchronized_lock;

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

    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();

        lock.lock();
        try {
            if(this.money >= money)
            {
                System.out.println(name + "来取钱，共：" + money);
                this.money -= money;

                //System.out.println(10/0);
                System.out.println(name + "取钱后，剩余：" + this.money);
            }
            else {
                System.out.println(name + "来取钱，余额不足！");
            }
        } finally {
            lock.unlock();
        }
    }
}
