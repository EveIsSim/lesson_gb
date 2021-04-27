package com.lesson_gb.obstacles;

import com.lesson_gb.competitors.Competitor;

public class Wall implements Obstacle{

    private int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public boolean doIt(Competitor c){
        return c.jump(height);
    }
}
