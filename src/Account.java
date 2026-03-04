public class Account {

    private int balance;

    public Account(int balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new
                    IllegalArgumentException("Withdraw must be positive");
        }
         if (amount > balance) {
             throw new IllegalStateException("Insufficient funds");
         }
        balance -= amount;
    }
}