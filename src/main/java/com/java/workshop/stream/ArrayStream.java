package com.java.workshop.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStream {
    public static void main(String[] args) {
        int[] marks = { 70, 20, 90, 40, 80 };

        long numberOfSubjectsPassed = Arrays.stream(marks).filter(mark -> mark > 30).count();
        System.out.println( numberOfSubjectsPassed);

        IntStream marksStream = Arrays.stream(marks);
        numberOfSubjectsPassed = Arrays.stream(marks).filter(mark -> mark > 30).count();
        System.out.println( numberOfSubjectsPassed);
    }
}
