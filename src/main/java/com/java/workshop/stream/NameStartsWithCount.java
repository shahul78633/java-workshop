package com.java.workshop.stream;

import java.util.ArrayList;
import java.util.List;

public class NameStartsWithCount {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        
        names.add("shahul");
        names.add("reshma");
        names.add("zameer");
        names.add("iman");
        names.add("santhosh");
        names.add("nowfiya");


       long nameCount = names.stream().filter( name -> name.startsWith("s")).count();
       if(nameCount > 0) {
            System.out.println("Number of names starting with 's': " + nameCount);
        } else {
            System.out.println("No names start with 's'.");
        }

    }
}
