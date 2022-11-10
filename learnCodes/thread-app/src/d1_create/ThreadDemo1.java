package d1_create;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出：" + i);
        }

    }
}

class MyThread extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出：" + i);
        }
    }
}
