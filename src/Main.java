public class Main {
    public static void main(String[] args) {
        int minimumDeposit = 1000;
        int replenishment = 1100;
        int balance = 100;

        int bonus;
        if (replenishment > minimumDeposit) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int sumBalance;
        sumBalance = balance + replenishment + bonus;

        System.out.println("Ваш баланс: " + sumBalance);
        System.out.println("Ваш бонус: " + bonus);
    }
}