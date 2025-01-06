public class Account {
    private int balance;

    public Account() {
        balance = 0;
    }

    public Account(int balance) {
        this.balance = balance;
    }

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkBalance() {
        return balance;
    }

    public void transferMoney(Account target, int amount) {
        this.withdraw(amount);
        target.deposit(amount);
    }
}
