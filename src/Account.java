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

    private void changeBalance (int delta) {
        int newBalance = balance + delta;

        if (newBalance < 0) {
            throw new IllegalStateException("Balance cannot go below zero");
        }
        balance = newBalance;
    }
}
