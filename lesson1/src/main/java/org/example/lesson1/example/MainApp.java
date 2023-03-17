package org.example.lesson1.example;


import org.example.lesson1.example.animals.Animal;
import org.example.lesson1.example.animals.Cat;
import org.example.lesson1.example.animals.Dog;

public class MainApp{
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "white", 1);
        cat1.info();
        Cat cat2 = new Cat("Mursik", "black", 2);
        cat2.info();

        Cat[] cats = new Cat[3];   //{null, null, null}
        cats[0] = new Cat("Cat1", "white", 1);
        cats[1] = new Cat("Cat2", "grey", 2);
        cats[2] = new Cat("Cat3", "black", 3);
        cats[0].info();
        cats[1].info();
        cats[2].info();
        cat1.voice();

        Dog dog = new Dog("Bobik", "black", 3);
        dog.voice();

        Animal[] catsAndDogs = {
                new Cat("Barsik111", "white", 5),
                new Dog("Bobik222", "white", 2),
                new Cat("Murka333", "white", 1),
        };
        for(Animal o: catsAndDogs){
            o.voice();
        }
    }
}