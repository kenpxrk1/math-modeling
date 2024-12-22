package ru.mirea;

import java.util.Random;

public class Task19 {

    public static void main(String[] args) {
        int n = 1000000;
        int totalTeams = 16;
        int subgroupSize = totalTeams / 2;

        Random random = new Random();

        int sameSubgroupCount = 0;
        int differentSubgroupCount = 0;

        for (int i = 0; i < n; i++) {
            boolean[] inFirstSubgroup = new boolean[totalTeams];
            int firstSubgroupMembers = 0;

            for (int j = 0; j < totalTeams; j++) {
                if (firstSubgroupMembers < subgroupSize && random.nextBoolean()) {
                    inFirstSubgroup[j] = true;
                    firstSubgroupMembers++;
                }
            }

            for (int j = 0; j < totalTeams && firstSubgroupMembers < subgroupSize; j++) {
                if (!inFirstSubgroup[j]) {
                    inFirstSubgroup[j] = true;
                    firstSubgroupMembers++;
                }
            }

            boolean strongestInSameSubgroup = inFirstSubgroup[0] == inFirstSubgroup[1];

            if (strongestInSameSubgroup) {
                sameSubgroupCount++;
            } else {
                differentSubgroupCount++;
            }
        }

        double sameSubgroupProbability = (double) sameSubgroupCount / n;
        double differentSubgroupProbability = (double) differentSubgroupCount / n;

        System.out.println("Вероятность того, что две самые сильные команды окажутся в одной подгруппе: " + sameSubgroupProbability);
        System.out.println("Вероятность того, что две самые сильные команды окажутся в разных подгруппах: " + differentSubgroupProbability);
    }
}