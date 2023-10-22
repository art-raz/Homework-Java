package com.company;

import java.util.Scanner;

//3. Написать программу, в результате которой массив чисел
//создается с помощью инициализации (как в Си) вводится и считается в
//цикле сумма элементов целочисленного массива, а также среднее
//арифметическое его элементов результат выводится на экран. Использовать
//цикл for.
public class ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос у пользователя на количество элементов в массиве
        System.out.print("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();

        // Создание массива
        int[] arr = new int[n];

        // Ввод элементов массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Вычисление суммы элементов
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Вычисление среднего арифметического
        double average = (double) sum / n;

        // Вывод результатов
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}