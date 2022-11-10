package d4_thread_synchronized_code;

public class ThreadDemo {
    public static void main(String[] args) {
        Account account = new Account("ACBC-111", 100000);

        new DrawThread(account, "小红").start();
        new DrawThread(account, "小明").start();

        Account account2 = new Account("ACBC-112", 100000);

        new DrawThread(account2, "小黑").start();
        new DrawThread(account2, "小白").start();
    }



}
