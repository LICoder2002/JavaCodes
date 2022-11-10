package d2_api;

public class Mythread extends Thread{

    public Mythread() {
    }

    public Mythread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "  "+ i);
        }
    }
}
