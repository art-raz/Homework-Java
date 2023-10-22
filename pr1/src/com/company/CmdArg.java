package com.company;

public class CmdArg {
    public static void main(String[] args) {
        // Перебираем аргументы командной строки через for
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент №" + (i + 1) + ": " + args[i]);
        }
    }
}
//Когда вызываем передаем аргументы
// Для этого переходим
// Run --> Edit Configurations --> Program arguments --> Записываем arg1 arg2 arg3