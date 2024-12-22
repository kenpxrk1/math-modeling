package ru.mirea.stohastic;

import java.util.Random;

public class FoodDeliveryWaitingTime {
    public static void main(String[] args) {
        double trafficJamProbability = 0.3;
        double kitchenDelayProbability = 0.2;
        double badWeatherProbability = 0.4;

        int baseWaitingTime = 30;

        Random random = new Random();
        boolean trafficJam = random.nextDouble() < trafficJamProbability;
        boolean kitchenDelay = random.nextDouble() < kitchenDelayProbability;
        boolean badWeather = random.nextDouble() < badWeatherProbability;

        int waitingTime = baseWaitingTime;
        if (trafficJam) {
            waitingTime += 10;
        }
        if (kitchenDelay) {
            waitingTime += 15;
        }
        if (badWeather) {
            waitingTime += 5;
        }

        System.out.println("Ожидание доставки еды:");
        System.out.println("Пробка: " + (trafficJam ? "Да" : "Нет"));
        System.out.println("Задержка на кухне: " + (kitchenDelay ? "Да" : "Нет"));
        System.out.println("Плохая погода: " + (badWeather ? "Да" : "Нет"));
        System.out.println("Общее время ожидания: " + waitingTime + " минут.");
    }
}
