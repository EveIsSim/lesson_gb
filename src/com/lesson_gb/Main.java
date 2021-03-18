package com.lesson_gb;

import com.lesson_gb.competitors.Cat;
import com.lesson_gb.competitors.Competitor;
import com.lesson_gb.competitors.Human;
import com.lesson_gb.competitors.Robot;
import com.lesson_gb.obstacles.Obstacle;
import com.lesson_gb.obstacles.Treadmill;
import com.lesson_gb.obstacles.Wall;

public class Main {

    public static void main(String[] args) {

        Competitor[] competitors = {
                new Human(),
                new Cat(),
                new Cat(600, 5),
                new Robot(10000, 49)
        };

        Obstacle[] obstacles = {
                new Treadmill(500),
                new Wall(1)
        };

        for (Competitor c: competitors){
            for (Obstacle o: obstacles){
                if(!o.doIt(c)){
                    break;
                };
            }
        }

    }
}
