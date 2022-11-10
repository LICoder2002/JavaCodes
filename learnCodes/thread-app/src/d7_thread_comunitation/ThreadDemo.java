package d7_thread_comunitation;


public class ThreadDemo {
    public static void main(String[] args) {
        Account account = new Account("ICBC-123", 0);

        new DrawThread(account, "小明").start();
        new DrawThread(account, "小红").start();

        new DepositThread(account, "亲爹").start();
        new DepositThread(account, "干爹").start();
        new DepositThread(account, "岳父").start();

    }
}
