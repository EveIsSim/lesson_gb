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
        if (!hasEnoughFood(appetite))
        {
            return;
        }

        this.food -= appetite;
    }

    //    6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    public void increaseFood(int food)
    {
        this.food += food;
    }

    public boolean hasEnoughFood(int appetite)
    {
        return appetite <= food;
    }


}
