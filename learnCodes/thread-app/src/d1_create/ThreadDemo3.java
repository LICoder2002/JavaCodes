package d1_create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new MyCallable(100);
        FutureTask<Integer> futureTask = new FutureTask<>(callable);

        Thread t = new Thread(futureTask);

        t.start();

        System.out.println(futureTask.get());

    }
}

class MyCallable implements Callable<Integer>
{
    private final int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return sum;
    }
}
