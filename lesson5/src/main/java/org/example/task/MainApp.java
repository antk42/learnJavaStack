package org.example.task;

import java.util.HashMap;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        String[] arrayString = {
                "Cat", "Dog", "Bird", "Horse", "Mouse",
                "Cat", "Dog", "Fish", "Pig", "Fox",
                "Cat", "Dog", "Shark", "Horse", "Wolf",
                "Wolf", "Cat", "Dog"
        };
        Map<String, Integer> mapString = new HashMap<String, Integer>();
        Integer item = 0;
        for (String string : arrayString){
            if(!mapString.containsKey(string)){
                mapString.put(string, item);

            }else {
                item = mapString.get(string);
                mapString.put(string, item++);
            }
        }
        for (Map.Entry<String, Integer> entry : mapString.entrySet()){
            System.out.println(entry.getKey());
        }

    }
}
