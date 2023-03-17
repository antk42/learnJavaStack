package org.example.example;

public class MainApp {
    public static void main(String[] args) {
        Flyable[] flyables = {
                new Duck(),
                new Airpalne()
        };
        for(Flyable f : flyables){
            f.fly();
        }
        System.out.println("================");

        Flyable somethingFlyable = new Duck();
        somethingFlyable.fly();
        Swimable somethingSwimable = new Fish();
        somethingSwimable.swim();
    }
}
