package com.lesson_gb;

public class Plate
{
    public int food;

    public Plate(int food)
    {
        this.food = food;
    }

    public void info()
    {
        System.out.println("plate: " + food);
    }

    void decreaseFood(int appetite)
    {
        if (appetite > food)
            return;

        this.food -= appetite;
    }
}
