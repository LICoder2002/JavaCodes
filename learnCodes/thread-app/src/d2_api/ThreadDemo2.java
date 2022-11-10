package d2_api;

public class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <= 5; i++) {
            if(i == 3)
            {
                Thread.sleep(3000);
            }
        }
    }
}
