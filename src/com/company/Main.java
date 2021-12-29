package com.company;

public class Main {

    public static void main(String[] args) {
        // задание №1
        int clientOS = 1;
        if (clientOS >= 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientOS < 1) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        // задание №2
        int clientDevice = 1;
        int clientDeviceYear = 2015;
        if ((clientDeviceYear >= 2015) && (clientDevice >= 1)) {
            System.out.println("Приложение работает корректно");
        } else {
            if ((clientDeviceYear <= 2015) && (clientDevice >= 1)) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            if ((clientDeviceYear >= 2015) && (clientDevice <= 1)) {
                System.out.println("Приложение работает корректно");
            } else {
                if ((clientDeviceYear <= 2015) && (clientDevice <= 1)) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
            }
        }
    }
}