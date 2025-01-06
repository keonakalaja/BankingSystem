//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1000);
        Account account2 = new Account();

        System.out.println("Account 1 Balance: " + account1.checkBalance());
        System.out.println("Account 2 Balance: " + account2.checkBalance());

        account1.transferMoney(account2, 300);

        System.out.println("After Transfer:");
        System.out.println("Account 1 Balance: " + account1.checkBalance());
        System.out.println("Account 2 Balance: " + account2.checkBalance());
    }
}