package org.example.example;

public interface Flyable {
    default void fly(){
        System.out.println("something is flying");
    }
}
