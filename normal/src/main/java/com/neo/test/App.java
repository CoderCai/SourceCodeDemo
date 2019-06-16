package com.neo.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Map<String, String> map = new HashMap<>();
        map.put(null, "x");
        map.put("null", "y");
        map.put(null, null);
        System.out.println(map.get(null));
        System.out.println(map.get("null"));

        System.out.println(23 % 10);
        System.out.println(23 & (10 - 1));
    }
}
