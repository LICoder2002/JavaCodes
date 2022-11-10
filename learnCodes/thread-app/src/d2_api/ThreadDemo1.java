package d2_api;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new Mythread("1号");
        t1.start();
        System.out.println(t1.getName());
        Thread t2 = new Mythread();
        t2.setName("2号");
        t2.start();
        System.out.println(t2.getName());

        System.out.println(Thread.currentThread().getName());
    }
}
