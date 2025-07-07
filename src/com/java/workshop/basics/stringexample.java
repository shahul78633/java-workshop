package com.java.workshop.basics;

public class stringexample {
    public static void main(String[] args) {
        String firstname = "shahul";
        String lastname = "hameedkhan";
        String fullname = firstname + " " + lastname;

        System.out.println(fullname);

        String upperCaseFullname = fullname.toUpperCase();
        System.out.println(upperCaseFullname);

        System.out.println(firstname == lastname);

        String sentence = "My name is shahul and I am learning Java. Welcome to java class.";


        String[] words = sentence.split(" ");
        System.out.println("Number of words: " + words.length);
        String[] sentences = sentence.split("\\.");
        System.out.println("Number of sentences: " + sentences.length);
        int totalChars = sentence.length();
        System.out.println("Total characters: " + totalChars);
    }
}
