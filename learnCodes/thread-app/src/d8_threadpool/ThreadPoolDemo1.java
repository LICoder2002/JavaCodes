package d8_threadpool;

import java.util.concurrent.*;

public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());

        MyRunnable target = new MyRunnable();

        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        pool.shutdown();
       // pool.shutdownNow();
    }
}
