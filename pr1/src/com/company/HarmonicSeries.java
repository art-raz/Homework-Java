package com.company;
//5. Написать программу, в результате работы которой на экран выводятся
//первые 10 чисел гармонического ряда (форматировать вывод).
public class HarmonicSeries {
    public static void main(String[] args) {
        int n = 10; // Количество чисел в гармоническом ряду
        double harmonicSum = 0.0;

        System.out.println("Первые " + n + " чисел гармонического ряда:");

        for (int i = 1; i <= n; i++) {
            harmonicSum += 1.0 / i;
            System.out.printf("1/%d = %.4f%n", i, harmonicSum);
        }
    }
}