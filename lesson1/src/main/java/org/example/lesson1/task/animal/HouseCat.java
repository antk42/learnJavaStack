package org.example.lesson1.task.animal;

public class HouseCat extends Cat{
    public static int count = 0;

    public HouseCat(String name, int maxRunDistance) {
        super("HouseCat", name, maxRunDistance, 0);
        count++;
    }
}
