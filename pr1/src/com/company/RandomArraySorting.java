package com.company;

import java.util.Arrays;
import java.util.Random;
//6. Написать программу, в результате которой генерируется массив целых
//чисел случайным образом, вывести его на экран, отсортировать его, и снова
//вывести на экран (использовать два подхода к генерации случайных чисел –
//метод random() класса Math и класс Random).
public class RandomArraySorting {
    public static void main(String[] args) {
        int arraySize = 10; // Размер массива

        // Генерация и вывод массива с использованием метода random() класса Math
        int[] array1 = generateRandomArrayUsingMath(arraySize);
        System.out.println("Массив, сгенерированный с использованием Math.random():");
        printArray(array1);

        // Сортировка массива и вывод отсортированного массива
        Arrays.sort(array1);
        System.out.println("Отсортированный массив:");
        printArray(array1);

        // Генерация и вывод массива с использованием класса Random
        int[] array2 = generateRandomArrayUsingRandomClass(arraySize);
        System.out.println("Массив, сгенерированный с использованием класса Random:");
        printArray(array2);

        // Сортировка массива и вывод отсортированного массива
        Arrays.sort(array2);
        System.out.println("Отсортированный массив:");
        printArray(array2);
    }

    // Метод для генерации массива с использованием метода random() класса Math
    public static int[] generateRandomArrayUsingMath(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100); // Генерация случайного числа от 0 до 99
        }
        return array;
    }

    // Метод для генерации массива с использованием класса Random
    public static int[] generateRandomArrayUsingRandomClass(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Генерация случайного числа от 0 до 99
        }
        return array;
    }

    // Метод для вывода массива на экран
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}