package com.lesson_gb;

public class Animal {

    protected String name;
    private int maxDistanceRun;
    private int maxDistanceSwim;
    private static int animalCnt = 0;

    public Animal(String name, int maxDistanceRun, int maxDistanceSwim) {
        this.name = name;
        this.maxDistanceSwim = maxDistanceSwim;
        this.maxDistanceRun = maxDistanceRun;
        Animal.animalCnt++;
    }

    public void swim(int distance) {

        if (distance <= maxDistanceSwim) System.out.println(this.name + " пробежал " + distance + " м.");
        else System.out.println(this.name + " не сможет проплыть больше " +  maxDistanceSwim + " м.");

    };

    public void run(int distance) {

        if (distance <= maxDistanceRun) System.out.println(this.name + " пробежал " + distance + " м.");
        else System.out.println(this.name + " не сможет пробежать больше " +  maxDistanceRun + " м.");

    };

    public static void getAnimalCnt(){
        System.out.println("Общее кол-во животных: " + animalCnt);
    }

}
