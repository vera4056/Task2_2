public class Main {
    public static void main(String[] args) {
        int initialBalance = 400;
        int deposit = 1300;
        int currentBalance = initialBalance + deposit;
        int bonus = currentBalance / 100; // 100 %
        int y = bonus;
        if (currentBalance > 1001) y = bonus;
        if (currentBalance < 1001) {
            y = 0;
        }
        System.out.println("Итоговый баланс =" + currentBalance);
        System.out.println("Бонус =" + y);


    }


}
