public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        double bonus;
        int amount = 15_000;
        int newBalance;
        double totalBalance;
        newBalance = initialBalance + amount;
        if (amount > 1000) {
            bonus = amount / 100;
            totalBalance = newBalance + bonus;
        } else {
            bonus = 0;
            totalBalance = newBalance;
        }
        System.out.println(newBalance);
        System.out.println(bonus);
        System.out.println(totalBalance);
    }
}