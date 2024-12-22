package ru.mirea;

import java.util.Random;

public class Task20 {

    public static void main(String[] args) {
        int simulations = 1000000;
        int a = 5;
        int b = 5;

        Random random = new Random();

        int firstWhiteCount = 0;
        int lastWhiteCount = 0;

        for (int i = 0; i < simulations; i++) {
            int[] urn = new int[a + b];
            for (int j = 0; j < a; j++) {
                urn[j] = 1;
            }
            for (int j = a; j < a + b; j++) {
                urn[j] = 0;
            }

            for (int j = urn.length - 1; j > 0; j--) {
                int k = random.nextInt(j + 1);
                int temp = urn[j];
                urn[j] = urn[k];
                urn[k] = temp;
            }

            if (urn[0] == 1) {
                firstWhiteCount++;
            }
            if (urn[urn.length - 1] == 1) {
                lastWhiteCount++;
            }
        }

        double firstWhiteProbability = (double) firstWhiteCount / simulations;
        double lastWhiteProbability = (double) lastWhiteCount / simulations;

        System.out.println("Вероятность того, что первый извлеченный шар белый: " + firstWhiteProbability);
        System.out.println("Вероятность того, что последний извлеченный шар белый: " + lastWhiteProbability);
    }
}
