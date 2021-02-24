package com.lesson_gb;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static char[][] map;
    static final int SIZE = 3;
    static final char DOT_EMPTY = '.';
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';

    public static void main(String[] args) {

        // инициализация карты
        initMap();
        printMap();
        // ход человека / ход компьютера
        while (true)
        {
            humanTurn();
            printMap();
            if (checkWin(DOT_X))
            {
                System.out.println("Человек победил");
                break;
            }
            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O))
            {
                System.out.println("Победил Т-1000");
                break;
            }
            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }
        }

        System.out.printf("Игра окончена");
        // Проверять ход человека / компьютера
        // Проверка на победу
        // Проверка на ничью
    }

    static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap() {

        for (int i = 0; i <= SIZE; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < SIZE; i++){
            System.out.print((i + 1) + " ");

            for (int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }

            System.out.println();
        }
    }

    static void humanTurn(){

        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        do {
            System.out.println("Введите координаты в формате x, y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (!isCellValid(x, y));

        map[y][x] = DOT_X;

    }

    static void aiTurn(){

        Random sc = new Random();
        int x;
        int y;

        do {
            x = sc.nextInt(SIZE);
            y = sc.nextInt(SIZE);
        }
        while (!isCellValid(x, y));

        System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;


    }

    static boolean isCellValid(int x, int y){

        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
        {
            return false;
        }

        if (map[y][x] == DOT_EMPTY)
        {
            return true;
        }

        return false;
    }

    static boolean checkWin(char symb)
    {

        if (isCheckVerticalWin(symb))
        {
            return true;
        }
        if (isCheckHorizontalWin(symb))
        {
            return true;
        }


        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb)
        {
            return true;
        }
        if (map[0][2] == symb && map[1][1] == symb && map[2][0] == symb)
        {
            return true;
        }

        return false;
    }

    static boolean isCheckVerticalWin(char symb)
    {
        int countToWin = 0;

        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                if (map[j][i] == symb)
                {
                    countToWin++;
                    if (ischeckWin(countToWin))
                    {
                        return true;
                    }
                }
                else
                {
                    countToWin = 0;
                    continue;
                }

                if (countToWin != 3 && j == 2)
                {
                    countToWin = 0;
                    break;
                }
            }
        }
        return false;
    }

    static boolean isCheckHorizontalWin(char symb)
    {
        int countToWin = 0;

        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                if (map[i][j] == symb)
                {
                    countToWin++;
                    if (ischeckWin(countToWin))
                    {
                        return true;
                    }
                }
                else
                {
                    countToWin = 0;
                    continue;
                }

                if (countToWin != 3 && i == 2)
                {
                    countToWin = 0;
                    break;
                }
            }
        }
        return false;
    }

    static boolean ischeckWin(int cnt)
    {
        if (cnt == 3) return true;
        return false;
    }

    static boolean isMapFull()
    {
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                if (map[i][j] == DOT_EMPTY)
                {
                    return  false;
                }
            }
        }
        return true;
    }
}
