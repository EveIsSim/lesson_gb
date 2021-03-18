package com.lesson_gb.competitors;

public class Human implements Competitor {

    private int maxRun;
    private int maxJump;

    public Human(int maxRun, int maxJump){
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Human(){
        this(3000, 2);
    }

    @Override
    public boolean jump(int dist){
        if (dist <= maxJump) {
            System.out.println("Человек перепрыгнул " + dist + "m");
            return true;
        }
        else {
            System.out.println("Человек не смог перепрыгнуть " + dist + "m");
            return false;
        }
    }

    @Override
    public boolean run(int dist){
        if (dist <= maxRun) {
            System.out.println("Человек пробежал " + dist + "m");
            return true;
        }
        else {
            System.out.println("Человек не смог пробежать " + dist + "m");
            return false;
        }
    }
}
