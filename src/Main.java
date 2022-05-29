import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int initialBalance = 400;
        int deposit = 1300;
        int currentBalance = initialBalance + deposit;
        int bonus = currentBalance / 100; // 100 %
        if (currentBalance > 1001) {
            bonus = currentBalance / 100;
        }
        if (currentBalance < 1001) {
            bonus = 0;
        }
        int totalBalance = currentBalance + bonus;
        for (String s : Arrays.asList("Итоговый баланс =" + totalBalance, "Бонус =" + bonus)) {
            System.out.println(s);
        }


    }


}
