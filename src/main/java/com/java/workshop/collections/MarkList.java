package com.java.workshop.collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class MarkList {
    
     public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>(List.of(78, 85, 92, 88, 76, 95, 89));

        marks.sort(Comparator.naturalOrder());
        System.out.println("Sorted Marks: " + marks);

        marks.sort(Comparator.reverseOrder());
        System.out.println("Sorted Marks in Reverse Order: " + marks);
     }
    }

