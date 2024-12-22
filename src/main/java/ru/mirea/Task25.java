package ru.mirea;

public class Task25 {

    public static void main(String[] args) {
        int n = 100;
        int k = 10;
        int bought = 5;

        double probabilityNoWin = 1.0;

        for (int i = 0; i < bought; i++) {
            probabilityNoWin *= (double) (n - k - i) / (n - i);
        }

        double probabilityAtLeastOneWin = 1 - probabilityNoWin;

        System.out.println(probabilityAtLeastOneWin);
    }
}
