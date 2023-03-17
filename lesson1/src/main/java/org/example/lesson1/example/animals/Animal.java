package org.example.lesson1.example.animals;

abstract public class Animal {
    String name;
    String color;
    int age;


    public void info(){
        System.out.println(name + " " + color + " " + age);
    }
    public abstract void voice();
}
