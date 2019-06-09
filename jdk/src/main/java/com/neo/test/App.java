package com.neo.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Integer.MAX_VALUE - 8);
        System.out.println(list.size());
    }
}
