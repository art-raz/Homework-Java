package com.company;

import java.util.Scanner;
//4. Написать программу, в результате которой массив чисел вводится
//пользователем с клавиатуры считается сумма элементов целочисленного
//массива с помощью циклов do while, while, также необходимо найти
//максимальный и минимальный элемент в массиве, результат выводится на
//экран
public class ArraySumAndAverageCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос пользователю на ввод размера массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Создаем массив с заданным размером
        int[] array = new int[size];

        // Заполняем массив числами, введенными пользователем
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент массива #" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Инициализируем переменные для суммы, максимального и минимального элементов
        int sum = 0;
        int max = array[0];
        int min = array[0];

        // Используем цикл do-while для вычисления суммы
        int index = 0;
        do {
            sum += array[index];
            index++;
        } while (index < size);

        // Используем цикл while для поиска максимального и минимального элементов
        index = 1; // Начинаем с элемента под индексом 1, так как 0 уже инициализирован
        while (index < size) {
            if (array[index] > max) {
                max = array[index];
            }
            if (array[index] < min) {
                min = array[index];
            }
            index++;
        }

        // Выводим результаты на экран
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}