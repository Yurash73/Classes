package Task_4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;
        int sum =0;
        boolean flag = false;

        while (!flag) {
            System.out.println("Введите число или слово 'сумма' для окончания ввода ");
            try {
                inputString = scanner.nextLine().trim();
                if (inputString.toLowerCase().equals("сумма"))
                flag = true;
                else  sum += Integer.parseInt(inputString);
            } catch (NumberFormatException exception) {
                System.out.println("Неправильный ввод числа");
            }
        }

        System.out.println("Сумма введенных чисел равна: " + sum);

    }
}
