package com.lesson_gb;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю
//        дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить,
//        больше ли указанное пользователем число, чем загаданное, или меньше.
//        После победы или проигрыша выводится запрос – «Повторить игру еще раз?
//        1 – да / 0 – нет»(1 – повторить, 0 – нет).
        guessTheNumber();

    }

    public static void guessTheNumber(){
        System.out.println("Игра началась!");
        Scanner scanner = new Scanner(System.in);
        int attempt_cnt = 3;
        boolean isGame = true;
        int number = 0;
        int magic_num = (new Random()).nextInt(10);
        while (isGame) {
            System.out.println("Загадали " + magic_num);

            do {
                System.out.print("Введите целое число: ");
                if (scanner.hasNextInt()){
                    number = scanner.nextInt();
                    attempt_cnt--;
                    break;
                }
                else{
                    attempt_cnt--;
                    if (attempt_cnt == 0) { break; }
                    System.out.println("Входные данные неверны. Кол-во попыток: " + attempt_cnt);
                    scanner.nextLine();
                }
            }
            while (true);

            if (attempt_cnt == 0 || number == magic_num) {
                if (attempt_cnt == 0) {
                    System.out.println("Ты проиграл.");
                }
                if (number == magic_num) {
                    System.out.println("Ты выиграл!");
                }

                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                if (scanner.hasNextInt()) {
                    if (scanner.nextInt() == 0) {
                        isGame = false;
                    }
                    magic_num = (new Random()).nextInt(10);
                    attempt_cnt = 3;
                } else {
                    isGame = false;
                }
            }
            else{
                if (number < magic_num) {
                    System.out.println("Ваше число меньше загаданного. Попыток осталось: " + attempt_cnt);
                }
                else {
                    System.out.println("Ваше число больше загаданного. Попыток осталось: " + attempt_cnt);
                }
            }


        }
    }

}
