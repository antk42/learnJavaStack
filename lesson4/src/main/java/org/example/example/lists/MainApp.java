package org.example.example.lists;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("X", "A", "B", "C", "D", "E"));
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(5));
        System.out.println(arrayList);
        arrayList.remove("B");
        System.out.println(arrayList);
        //arrayList.sort();
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
