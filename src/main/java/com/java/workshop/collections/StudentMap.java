package com.java.workshop.collections;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args){
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "shahul");
        students.put(102, "reshma");
        students.put(103, "iman");
        students.put(104, "zameer");
        students.put(105, "santhosh");
        students.put(106, "nowfiya");
        students.put(107, "logesh");

        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());
        }
    }
    

