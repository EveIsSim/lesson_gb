package com.lesson_gb.competitors;

public class Robot implements Competitor {

    private int maxRun;
    private int maxJump;

    public Robot(int maxRun, int maxJump){
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Robot(){
        this(3000, 2);
    }

    @Override
    public boolean jump(int dist){
        if (dist <= maxJump) {
            System.out.println("Робот перепрыгнул " + dist + "m");
            return true;
        }
        else {
            System.out.println("Робот не смог перепрыгнуть " + dist + "m");
            return false;
        }
    }

    @Override
    public boolean run(int dist){
        if (dist <= maxRun) {
            System.out.println("Робот пробежал " + dist + "m");
            return true;
        }
        else {
            System.out.println("Робот не смог пробежать " + dist + "m");
            return false;
        }
    }
}
