package ru.mirea;

import java.util.Random;

public class Task21 {

    public static void main(String[] args) {
        int simulations = 1000000;
        int a = 5;
        int b = 5;
        int k = 3;

        Random random = new Random();

        int whiteAtKCount = 0;

        for (int i = 0; i < simulations; i++) {
            int[] urn = new int[a + b];
            for (int j = 0; j < a; j++) {
                urn[j] = 1;
            }
            for (int j = a; j < a + b; j++) {
                urn[j] = 0;
            }

            for (int j = urn.length - 1; j > 0; j--) {
                int swapIndex = random.nextInt(j + 1);
                int temp = urn[j];
                urn[j] = urn[swapIndex];
                urn[swapIndex] = temp;
            }

            if (urn[k - 1] == 1) {
                whiteAtKCount++;
            }
        }

        double whiteAtKProbability = (double) whiteAtKCount / simulations;

        System.out.println("Вероятность того, что " + k + "-й вынутый шар белый: " + whiteAtKProbability);
    }
}
