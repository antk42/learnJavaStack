package org.example.example;

public class MyLibException extends RuntimeException{
    public MyLibException() {
    }

    public MyLibException(String message) {
        super(message);
    }
}
