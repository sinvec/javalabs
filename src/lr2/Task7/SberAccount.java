package lr2.Task7;

public class SberAccount implements BankAccount{

    private int balance = 0;

    public SberAccount(int initBalance) {
        this.balance = initBalance;
    }

    public void putMoney(int money) {
        if (money > 0) {
            this.balance += money;
        }
    }

    public void withdrawMoney(int money) {
        if (money > 0) {
            if ((this.balance - money) >= 0) {
                this.balance -= money;
            }
        }
    }

    public int getBalance() {
        return this.balance;
    }
}
