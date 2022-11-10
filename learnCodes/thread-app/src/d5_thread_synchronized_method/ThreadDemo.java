package d5_thread_synchronized_method;

public class ThreadDemo {
    public static void main(String[] args) {
        Account account = new Account("ACBC-111", 100000);

        new DrawThread(account, "小明").start();
        new DrawThread(account, "小红").start();
    }



}
