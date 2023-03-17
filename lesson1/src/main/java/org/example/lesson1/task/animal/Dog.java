package org.example.lesson1.task.animal;

public class Dog extends Animal{
    public static int count = 0;

    public Dog(String name, int maxRunDistance, int maxSwimDistance) {
        super( "Dog", name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
