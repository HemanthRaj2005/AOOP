package task9b;

public class BankAccountSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); 

        Runnable depositTask = () -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(100);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable withdrawTask = () -> {
            for (int i = 0; i < 5; i++) {
                account.withdraw(50);
                try {
                    Thread.sleep(50); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        Thread depositThread1 = new Thread(depositTask, "DepositThread1");
        Thread depositThread2 = new Thread(depositTask, "DepositThread2");
        Thread withdrawThread1 = new Thread(withdrawTask, "WithdrawThread1");
        Thread withdrawThread2 = new Thread(withdrawTask, "WithdrawThread2");
        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
        withdrawThread2.start();
        try {
            depositThread1.join();
            depositThread2.join();
            withdrawThread1.join();
            withdrawThread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Final balance: " + account.getBalance());
    }
}
