package com.company;

import java.util.Scanner;
//7. Написать программу, которая с помощью метода, вычисляет факториал
//числа (использовать управляющую конструкцию цикла), проверить работу
//метода.
public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для вычисления факториала: ");
        int number = scanner.nextInt();

        long factorial = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен: " + factorial);
    }

    // Метод для вычисления факториала числа
    public static long calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Факториал отрицательного числа не определен");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
