public class Main {
    public static void main(String[] args) {

        Account account = new Account(100);

        account.deposit(50);
        account.withdraw(30);

        try {
            account.withdraw(1000);
        } catch (IllegalStateException e) {
            System.out.println("Operation failed: " + e.getMessage());
        }

        System.out.println(account.getBalance());
    }
}