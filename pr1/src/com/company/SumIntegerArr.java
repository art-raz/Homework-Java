package com.company;
//3. Написать программу, в результате которой считается сумма элементов
//   целочисленного массива с помощью циклов for, while, do while и результат
//   выводится на экран.

public class SumIntegerArr {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // инициализируем массив

        // Считаем сумму элементов массива через for
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма элементов массива через for: " + sum);

        // Считаем сумму элементов массива через while
        int sum2 = 0; // обнуляем значение переменной
        int i_while = 0; // задаем счетчик
        while (i_while < array.length) {
            sum2 += array[i_while];
            i_while++;
        }
        System.out.println("Сумма элементов массива через while: " + sum2);

        // Считаем сумму элементов массива с через do while
        int sum3 = 0;// обнуляем сумму
        int i_do = 0;// обнуляем счетчик
        do {
            sum3 += array[i_do];
            i_do++;
        } while (i_do < array.length);
        System.out.println("Сумма элементов массива через do while: " + sum3);
    }
}