package com.java.workshop.collections;

import java.util.List;

import com.java.workshop.temp.beans.sensor;

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
        
       names.forEach(String::toUpperCase);
       names.forEach(System.out::println);
       names.sort(Comparator.reverseOrder());
        System.out.println(names);
        }
    }

