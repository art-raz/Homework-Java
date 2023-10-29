package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
//Задание 2. (20%)
//Приложение, сравнивающее текущую дату и дату, введенную
//пользователем c текущим системным временем
public class CompareDates {
    public static void main(String[] args) {
        // Получаем текущую дату и время
        Date currentDate = new Date();
        System.out.println("Текущая дата и время: " + currentDate);

        // Просим пользователя ввести дату
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате \"дд.мм.гггг чч:мм\": ");
        String userInput = scanner.nextLine();

        try {
            // Преобразуем введенную строку в объект типа Date с помощью SimpleDateFormat
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            Date userDate = dateFormat.parse(userInput);

            // Создаем объекты Calendar для текущей и введенной даты
            Calendar currentCalendar = Calendar.getInstance();
            currentCalendar.setTime(currentDate);

            Calendar userCalendar = Calendar.getInstance();
            userCalendar.setTime(userDate);

            // Сравниваем даты
            if (currentCalendar.compareTo(userCalendar) > 0) {
                System.out.println("Текущая дата и время больше введенной");
            } else if (currentCalendar.compareTo(userCalendar) < 0) {
                System.out.println("Текущая дата и время меньше введенной");
            } else {
                System.out.println("Текущая дата и время равны введенной");
            }
        } catch (Exception e) {
            System.out.println("Некорректный формат даты. Попробуйте еще раз.");
        }
    }
}