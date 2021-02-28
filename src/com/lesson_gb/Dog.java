package com.lesson_gb;

public class Dog extends Animal {

    static int dogCnt = 0;

    public Dog(String name) {

        super(name, 500, 10);
        Dog.dogCnt++;

    }

    public static void getDogCnt(){
        System.out.println("Общее кол-во собак: " + dogCnt);
    }
}
