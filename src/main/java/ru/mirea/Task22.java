package ru.mirea;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Task22 {

    public static void main(String[] args) {
        int simulations = 1000000;
        int balls = 30;
        int boxes = 8;
        int[] targetDistribution = {0, 0, 3, 3, 6, 6, 12};
        Random random = new Random();

        int matchCount = 0;

        for (int i = 0; i < simulations; i++) {
            int[] distribution = new int[boxes];

            for (int j = 0; j < balls; j++) {
                int box = random.nextInt(boxes);
                distribution[box]++;
            }

            Map<Integer, Integer> countMap = new HashMap<>();
            for (int count : distribution) {
                countMap.put(count, countMap.getOrDefault(count, 0) + 1);
            }

            boolean matches = true;
            for (int value : targetDistribution) {
                if (countMap.getOrDefault(value, 0) == 0) {
                    matches = false;
                    break;
                }
                countMap.put(value, countMap.get(value) - 1);
                if (countMap.get(value) == 0) {
                    countMap.remove(value);
                }
            }

            if (matches) {
                matchCount++;
            }
        }

        double probability = (double) matchCount / simulations;
        System.out.println(probability);
    }
}
