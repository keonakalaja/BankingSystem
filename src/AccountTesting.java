import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTesting {

    @Test
    void deposit() {
        Account account = new Account();
        account.deposit(200);
        assertEquals(200, account.checkBalance());
    }

    @Test
    void withdraw() {
        Account account = new Account(500);
        account.withdraw(200);
        assertEquals(300, account.checkBalance());
    }

    @Test
    void checkBalance() {
        Account account1 = new Account();
        assertEquals(0, account1.checkBalance());

        Account account2 = new Account(1000);
        assertEquals(1000, account2.checkBalance());

        account2.deposit(500);
        assertEquals(1500, account2.checkBalance());

        account2.withdraw(300);
        assertEquals(1200, account2.checkBalance());
    }

    @Test
    void transferMoney() {
        Account account1 = new Account(500);
        Account account2 = new Account();

        account1.transferMoney(account2, 200);
        assertEquals(300, account1.checkBalance());
        assertEquals(200, account2.checkBalance());
    }
}