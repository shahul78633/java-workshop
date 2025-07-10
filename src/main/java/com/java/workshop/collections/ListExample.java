package com.java.workshop.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("shahul");
        names.add("reshma");
        names.add("zameer");
        names.add("iman"); 
        names.add("santhosh");
        names.add("nowfiya");

        System.out.println(names);
        names.set(5,"nowfiya syed");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
    }
}
