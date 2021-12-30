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


            // задание №3
            int year = 2021;
            if (((year % 400 == 0) && (year % 100 != 0)) || (year % 4 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }

            // задание №4

            int deliveryDistance = 95;
            int deliveryTime = 1;
            if (deliveryDistance <= 20) {
                System.out.println("Потребуется дней: " + deliveryTime);
            }
                int Time = deliveryTime + 1;
                if ((deliveryDistance > 20) && (deliveryDistance < 60)) {
                    System.out.println("Потребуется дней: " + Time);
                }
                int Time1 = Time + 1;
                if ((deliveryDistance > 60) && (deliveryDistance <= 100)) {
                    System.out.println("Потребуется дней: " + Time1);
                }

                // задание №5

                int month = 12;
                switch (month) {
                    case 1 -> System.out.println("Зима 2");
                    case 2 -> System.out.println("Зима 3");
                    case 3 -> System.out.println("Весна");
                    case 4 -> System.out.println("Весна 2");
                    case 5 -> System.out.println("Весна 3");
                    case 6 -> System.out.println("Лето");
                    case 7 -> System.out.println("Лето 2");
                    case 8 -> System.out.println("Лето 3");
                    case 9 -> System.out.println("Осень");
                    case 10 -> System.out.println("Осень 2");
                    case 11 -> System.out.println("Осень 3");
                    case 12 -> System.out.println("Зима");
                    default -> System.out.println("Месяца не существует");
                }
            }
        }
    }
