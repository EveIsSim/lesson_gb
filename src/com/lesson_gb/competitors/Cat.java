package com.lesson_gb.competitors;

public class Cat implements Competitor {

    private int maxRun;
    private int maxJump;

    public Cat(int maxRun, int maxJump) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public Cat() {
        this(300, 3);
    }

    @Override
    public boolean jump(int dist){
        if (dist <= maxJump) {
            System.out.println("Кот перепрыгнул " + dist + "m");
            return true;
        }
        else {
            System.out.println("Кот не смог перепрыгнуть " + dist + "m");
            return false;
        }
    }

    @Override
    public boolean run(int dist){
        if (dist <= maxRun) {
            System.out.println("Кот пробежал " + dist + "m");
            return true;
        }
        else {
            System.out.println("Кот не смог пробежать " + dist + "m");
            return false;
        }
    }
}
