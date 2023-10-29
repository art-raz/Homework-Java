package com.company;

import java.util.Date;
//Написать программу, выводящую фамилию разработчика, дату и время
//получения задания, а также дату и время сдачи задания. Для получения
//последней даты и времени использовать класс Date из пакета java.util.*
//(Объявление Dated=newDate() или метод System.currentTimeMillis().
public class Task {
    public static void main(String[] args) {
        String surname = "Разуваев";
        Date dateReceived = new Date(); // Дата и время получения задания
        Date dateSubmitted = new Date(); // Дата и время сдачи задания

        System.out.println("Фамилия разработчика: " + surname);
        System.out.println("Дата и время получения задания: " + dateReceived);
        System.out.println("Дата и время сдачи задания: " + dateSubmitted);
    }
}
