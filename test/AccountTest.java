import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void deposit_shouldIncreaseBalance() {
        Account account = new Account(100);

        account.deposit(50);

        assertEquals(150, account.getBalance());
    }
    @Test
    void deposit_shouldThrowException_whenAmountIsZero() {

        Account account = new Account(100);

        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(0);
        });

    }
    @Test
    void withdraw_shouldThrowException_whenAmountGreaterThanBalance() {

        Account account = new Account(100);

        assertThrows(IllegalStateException.class, () -> {
            account.withdraw(200);
        });

    }
}