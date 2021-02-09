package com.lesson_gb;

public class Main {
    // task 1
    public static void main(String[] args) {

        //task 2
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        float f = 2.4f;
        double e = 3.54;
        boolean k = true;
        char l = '1';

        // task 3
        resolveTask(1.0f, 2.1f, 4.4f, 2.2f);

        // task 4
        checkSumBetween(12, 4);

        // task 5
        checkOddOrEvenNumPrint(-2);

        // task 6
        checkOddOrEvenNumBoolean(33);

        //task 7
        helloName("Sergo");

        //task 8
        checkTypeYear(2056);
    }

    static float resolveTask(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    static boolean checkSumBetween(int a, int b){
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    static void checkOddOrEvenNumPrint(int number){
        if (number == 0 || number % 2 == 0){
            System.out.println("number " + number + " is even");
        }
        else{
            System.out.println("number " + number + " is odd");
        }
    }

    static boolean checkOddOrEvenNumBoolean(int number){
        return (number != 0 && number % 2 != 0);
    }

    static void helloName(String name){
        System.out.println("Привет, " + name + "!");
    }

    static void checkTypeYear(int year){
        boolean leap = false;

        if (year % 4 == 0) { leap = true; }
        if (year % 100 == 0) { leap = false; }
        if (year % 400 == 0) { leap = true; }

        if (leap) {
            System.out.println("Year " + year + " is leap!");
        }
        else{
            System.out.println("Year " + year + " is not leap!");
        }
    }

}
