package com.java.workshop.collections;
import java.util.HashSet;
import java.util.Set;

public class StudentSet {
    public static void main(String[] args) {
        Set<Integer> rollNumbers = new HashSet<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(104);
        rollNumbers.add(105);
        rollNumbers.add(106);
        rollNumbers.add(107);
 


        System.out.println(rollNumbers);
        for(Integer rollNumber : rollNumbers) {
            System.out.println(rollNumber);
        }
    }
}
