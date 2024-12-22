package ru.mirea;

import java.util.Random;

public class Task18 {

    public static void main(String[] args) {
        int numberOfRolls = 1000000; // Количество бросков кубика
        Random random = new Random();

        int evenSumCount = 0;
        int oddSumCount = 0;

        for (int i = 0; i < numberOfRolls; i++) {
            int dice1 = random.nextInt(6) + 1; // Первый кубик
            int dice2 = random.nextInt(6) + 1; // Второй кубик

            int sum = dice1 + dice2;

            if (sum % 2 == 0) {
                evenSumCount++;
            } else {
                oddSumCount++;
            }
        }

        // Вывод результатов
        System.out.println("Количество бросков: " + numberOfRolls);
        System.out.println("Четная сумма выпала: " + evenSumCount + " раз");
        System.out.println("Нечетная сумма выпала: " + oddSumCount + " раз");

        // Расчет вероятностей
        double evenProbability = (double) evenSumCount / numberOfRolls;
        double oddProbability = (double) oddSumCount / numberOfRolls;

        System.out.println("Вероятность четной суммы: " + evenProbability);
        System.out.println("Вероятность нечетной суммы: " + oddProbability);
    }
}
