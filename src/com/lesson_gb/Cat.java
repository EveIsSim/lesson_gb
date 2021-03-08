package com.lesson_gb;

public class Cat
{
    private String name;
    private int appetite;

    public Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
    }

    void eat(Plate plate)
    {
        plate.decreaseFood(appetite);
    }

}
