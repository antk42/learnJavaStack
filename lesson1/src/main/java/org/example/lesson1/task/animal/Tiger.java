package org.example.lesson1.task.animal;

public class Tiger extends Cat {
    public static int count = 0;

    public Tiger( String name, int maxRunDistance, int maxSwimDistance) {
        super("Tiger", name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
