package ru.mirea;

import java.util.Random;

public class Task26 {

    public static void main(String[] args) {
        int simulations = 1000000;
        int buses24 = 10;
        int buses25 = 10;
        int[] passengers24 = {20, 25, 30, 35, 40};
        int[] passengers25 = {10, 15, 20, 25, 30};
        Random random = new Random();

        int totalPassengersSeen24 = 0;
        int totalPassengersSeen25 = 0;
        int count24 = 0;
        int count25 = 0;

        for (int i = 0; i < simulations; i++) {
            boolean sees24First = random.nextBoolean();

            if (sees24First) {
                totalPassengersSeen24 += passengers24[random.nextInt(passengers24.length)];
                count24++;
            } else {
                totalPassengersSeen25 += passengers25[random.nextInt(passengers25.length)];
                count25++;
            }
        }

        double avgPassengers24 = (double) totalPassengersSeen24 / count24;
        double avgPassengers25 = (double) totalPassengersSeen25 / count25;

        System.out.println(avgPassengers24);
        System.out.println(avgPassengers25);
    }
}
