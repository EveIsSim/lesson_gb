package com.lesson_gb;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] massive = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < massive.length; i++){
            if (massive[i] == 1){ massive[i] = 0; }
            else {massive[i] = 1; }
        }

        // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] massive_2 = new int[8];

        for (int i = 0; i < massive_2.length; i++){
            massive_2[i] = i * 3;
        }

        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] massive_3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < massive_3.length; i++){
            if (massive_3[i] < 6){ massive_3[i] = massive_3[i] * 2; }
        }

        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] x2_massive = new int[5][5];


        for ( int x = 0; x < x2_massive.length; x++ ){
            for (int y = 0; y < x2_massive[x].length; y++){
                if (x == y){
                    x2_massive[x][y] = 1;
                    x2_massive[x][x2_massive[x].length - 1 - y] = 1;
                } 
            }
        }

        // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] massive_5 = {3, 5, 2, 4, 1};
        int max_num = massive_5[0];

        for ( int i = 0; i < massive_5.length; i++ ){
            if (massive_5[i] > max_num) { max_num = massive_5[i]; }
        }

        // 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
        // если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры:
        // checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
        // граница показана символами ||, эти символы в массив не входят.
        int[] check = {2, 2, 2, 1, 2, 2, 10, 1};

        boolean isBalance = checkBalance(check);
        System.out.println(isBalance);

        // 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
        // или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
        // Для усложнения задачи нельзя пользоваться вспомогательными массивами. 
        // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
        // при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
        int[] change = {3, 5, 6, 1};
        int step = -2;

        int[] result = changePosition(change, step);
        System.out.println(Arrays.toString(result));
    }


    public static boolean checkBalance(int[] massive){

        int start_other_side = massive.length - 1;
        int result_1 = 0;
        int result_2 = 0;

        while (true) {

            for ( int i = 0; i < start_other_side; i++ ){
                result_1 += massive[i];
            }

            for ( int i = massive.length - 1; i >= start_other_side; i--){
                result_2 += massive[i];
            }

            if (result_1 == result_2) { return true; }
            else {
                result_1 = 0;
                result_2 = 0;
                start_other_side--;
            }

            if (start_other_side == 0) { return false; }
        }

    }


    public static int[] changePosition(int[] massive, int step){

        if (step > 0){
            for (int i = 1; i <= step; i++){
                int end_to_start = massive[massive.length - 1];

                for (int x = massive.length - 2; x >= 0; x--){
                    massive[x + 1] = massive[x];
                }
                massive[0] = end_to_start;
            }
        }
        else {
            for (int i = step; i <= -1; i++){
                int start_to_end = massive[0];

                for (int x = 1; x < massive.length; x++){
                    massive[x - 1] = massive[x];
                }
                massive[massive.length - 1] = start_to_end;
            }
        }

        return massive;
    }
}
