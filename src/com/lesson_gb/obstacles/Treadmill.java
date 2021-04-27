package com.lesson_gb.obstacles;

import com.lesson_gb.competitors.Competitor;

public class Treadmill implements Obstacle{

    private int distance;

    public Treadmill(int distance){
        this.distance = distance;
    }

    @Override
    public boolean doIt(Competitor c){
        return c.run(distance);
    }
}
