package d9_timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo1 {
    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行一次AAA");
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
            }
        }, 0, 2000);


        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行一次BBB");
                System.out.println(10/0);
            }
        }, 0, 2000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行一次CCC");
            }
        }, 0, 2000);
    }
}
