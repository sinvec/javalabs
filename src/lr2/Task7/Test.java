package lr2.Task7;

public class Test {
    public static void main(String[] args) {
        BankAccount my_account = new SberAccount(999);

        my_account.putMoney(1);
        System.out.printf("Balance of my_account after putting money into it is %d\n", my_account.getBalance());

        my_account.withdrawMoney(999);
        System.out.printf("Balance of my_account after withdrawing money from it is %d\n", my_account.getBalance());
    }
}
