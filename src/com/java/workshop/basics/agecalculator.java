package com.java.workshop.basics;

import java.util.Scanner;
import java.time.LocalDate;

public class agecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - birthYear;
        
        System.out.println("You are " + age + " years old.");
        
        scanner.close();
    }
}

