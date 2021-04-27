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
                new Cat("Barsik", 1000, 3),
                new Cat(),
                new Human("Jon", 5000, 2),
                new Human(),
                new Robot("T3000", 15000, 10)
        };

        Obstacle[] obstacles = {
                new Treadmill(200),
                new Wall(4),
                new Treadmill(5000),
                new Wall(1)
        };

        for (Competitor c : competitors){
            for (Obstacle o : obstacles){
                if (!o.doIt(c)){
                    break;
                };
            }
        }

    }
}
