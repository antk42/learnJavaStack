package org.example.lesson1.task.animal;

public abstract class Animal {
    public  static int count = 0;
    String type;
    String name;

    int maxRunDistance;
    int maxSwimDistance;

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance) {
        count++;
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int distance){
        if(distance <= maxRunDistance){
            System.out.println(type + " " + name + " " + "successfully covered the distance " + distance + " m");
        }else {
            System.out.println(type + " " + name + " " + "could not covered the distance ");
        }
    }
    public void swim(int distance){
        if(maxSwimDistance == 0){
            System.out.println(type + " " + name + " " + "cant swim");
        }
        if(distance <= maxSwimDistance){
            System.out.println(type + " " + name + " " + "successfully covered the swim distance " + distance + " m");
        }else {
            System.out.println(type + " " + name + " " + "could not covered the swim distance ");
        }
    }
}
