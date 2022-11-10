package d7_thread_comunitation;


public class DepositThread extends Thread{
    private Account account;

    public DepositThread(Account account, String name)
    {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {

        while (true) {
            account.depositMoney(100000);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
