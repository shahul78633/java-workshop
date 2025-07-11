package com.java.workshop.basics;

import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter your qualification: ");
        String qualification = scan.nextLine();

        System.out.print("Enter your gender (male/female): ");
        String gender = scan.nextLine().trim().toLowerCase();

        String title;
        if (gender.equals("male")) {
            title = "Mr";
        } else if (gender.equals("female")) {
            title = "Mrs";
        } else {
            title = "Mx";
        }

        StringBuilder output = new StringBuilder();
        output.append(title).append(". ");
        output.append(name).append(" (").append(age).append(") - ");
        output.append(qualification);

        System.out.println("\nOutput:");
        System.out.println(output.toString());

        scan.close();
    }
    }

