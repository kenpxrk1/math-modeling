package ru.mirea;

import java.util.Random;

public class Task27 {
    public static void main(String[] args) {
        Random random = new Random();
        int simulations = 1000000;

        int countEvent1 = 0;
        for (int i = 0; i < simulations; i++) {
            boolean hasOne = false;
            for (int j = 0; j < 4; j++) {
                if (random.nextInt(6) + 1 == 1) {
                    hasOne = true;
                    break;
                }
            }
            if (hasOne) {
                countEvent1++;
            }
        }
        double probabilityEvent1 = (double) countEvent1 / simulations;

        int countEvent2 = 0;
        for (int i = 0; i < simulations; i++) {
            boolean hasDoubleOnes = false;
            for (int j = 0; j < 24; j++) {
                if (random.nextInt(6) + 1 == 1 && random.nextInt(6) + 1 == 1) {
                    hasDoubleOnes = true;
                    break;
                }
            }
            if (hasDoubleOnes) {
                countEvent2++;
            }
        }
        double probabilityEvent2 = (double) countEvent2 / simulations;

        System.out.println("Probability of Event 1: " + probabilityEvent1);
        System.out.println("Probability of Event 2: " + probabilityEvent2);
    }
}
