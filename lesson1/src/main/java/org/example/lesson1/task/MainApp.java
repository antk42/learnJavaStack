package org.example.lesson1.task;

import org.example.lesson1.task.animal.*;

public class MainApp {
    public static void main(String[] args) {
        Animal[] animals ={
                new HouseCat("Barsik", 200),
                new Dog("Bobik", 1000, 50),
                new Tiger("Opasniy", 10000, 100)
        };
        for (Animal o: animals){
            o.run(800);
            o.swim(20);
        }

        System.out.println("Animals count: " + Animal.count);
        System.out.println("Cats count: " + Cat.count);
        System.out.println("House Cats count: " + HouseCat.count);
    }
}
