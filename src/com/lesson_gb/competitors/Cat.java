package com.lesson_gb.competitors;

public class Cat implements Competitor{

    private int maxDistance;
    private int maxHeight;
    private String name;
    private static int countCat;

    public Cat(String name, int maxDistance, int maxHeight){
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;

        countCat++;
    }

    public Cat(){
        this(("Cat_" + ++countCat), 200, 2);
    }

    @Override
    public boolean run(int distance) {
        if (this.maxDistance >= distance){
            System.out.println(this.name + " смог пробежать " + distance + " м");
            return true;
        }
        else{
            System.out.println(this.name + " не смог пробежать " + distance + " м");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (this.maxHeight >= height){
            System.out.println(this.name + " смог перепрыгнуть " + height + " м");
            return true;
        }
        else{
            System.out.println(this.name + " не смог перепрыгнуть " + height + " м");
            return false;
        }
    }
}
