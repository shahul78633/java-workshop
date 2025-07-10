package com.java.workshop.basics;

public class WordCount {
    public int count(String inpuString) {
        int count = 0;
        String[] words = inpuString.split(" ");
        count = words.length;
        return count;
    }
}
