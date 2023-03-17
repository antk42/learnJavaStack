package org.example.example;

import java.util.HashMap;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(8);
        map.put("A", "B");
        map.put("D", "C");
        for (Map.Entry<String, String> o : map.entrySet()){
            System.out.println(o.getKey());
            System.out.println(o.getValue());
            System.out.println("-----");
        }
        System.out.println(map.getOrDefault("X", "Q"));
    }
}
