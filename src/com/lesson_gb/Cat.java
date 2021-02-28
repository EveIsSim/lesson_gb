package com.lesson_gb;

public class Cat extends Animal {

    static int catCnt = 0;

    public Cat(String name) {

        super(name, 200, 0);
        Cat.catCnt++;
    }

    @Override
    public void swim(int distance) {

        System.out.println(this.name + " не умеет плавать.");

    }

    public static void getCatCnt(){
        System.out.println("Общее кол-во кошек: " + catCnt);
    }
}
