package com.java.workshop.collections;

import java.util.List;
import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("shahul");
        names.add("reshma");
        names.add("zameer");
        names.add("iman"); 
        names.add("santhosh");

        System.out.println(names); // Prints the entire list
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i)); // Prints each name individually
        }
    }
}
