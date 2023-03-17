package org.example.example.generics;

public class GenBox<T> {
    T obj;

    public GenBox(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
