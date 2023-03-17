package org.example.lesson1.task.animal;

public abstract class Cat extends Animal {
    public static int count = 0;

    public Cat(String name, String s, int maxRunDistance, int maxSwimDistance) {
        super("Cat", name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
