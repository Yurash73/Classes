package Task_5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int numberOfIn;

        System.out.println("Введите кол-во чисел: ");
        numberOfIn = scanner.nextInt();
        for (int i = 0; i < numberOfIn; i++) {
            System.out.println("Введите целое число (осталось "
                    + (numberOfIn - i) + " чисел) : ");
            int inNumber = scanner.nextInt();
            if (inNumber > max) max = inNumber;

        }
        System.out.println("Максимальное из введенных чисел: " + max);


    }
}
