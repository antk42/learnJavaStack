package org.example.task;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

    }

    public static void swap(Object[] arr, int n1, int n2){
        Object obj = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = obj;
    }

    public static <T> ArrayList<T> convertToList(T[] array){
        return new ArrayList<>(Arrays.asList(array));
    }

}
