public class Main {

    public static int process(int balance, int expense) {

        if (expense <= 0) {
            return -1;  // ошибка
        } else if (balance >= expense) {
            return balance - expense;  // новый баланс
        } else {
            return -2;  // недостаточно средств
        }
    }

    public static void main(String[] args) {

        int result1 = process(100, 0);
        int result2 = process(100, 70);
        int result3 = process(50, 70);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
