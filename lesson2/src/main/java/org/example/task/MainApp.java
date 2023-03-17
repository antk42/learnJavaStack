package org.example.task;


import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(new Treadmill(50));
        obstacles.add(new Wall(2));
        obstacles.add(new Treadmill(200));

        List<Constentant> constentants = new ArrayList<>();
        constentants.add(new Robot());
        constentants.add(new Human());
        constentants.add(new Cat());

        for(Constentant constentant : constentants){
            for (Obstacle obstacle : obstacles){
                if (!obstacle.contest(constentant)) break;
            }
        }

    }
}
