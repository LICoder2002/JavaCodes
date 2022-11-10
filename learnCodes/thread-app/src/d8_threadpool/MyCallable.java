package d8_threadpool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String>
{
    private final int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() {
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + "执行 1 ~ "+ n + " 结果是：" + sum;
    }
}
