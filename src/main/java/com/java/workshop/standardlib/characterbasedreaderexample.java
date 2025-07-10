package com.java.workshop.standardlib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class characterbasedreaderexample {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("src/com/java/workshop/standardlib/example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("there is error in reading the file");
            e.printStackTrace();
        }

    }
}
