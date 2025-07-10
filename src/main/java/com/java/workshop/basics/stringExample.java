package com.java.workshop.basics;


public class stringExample{
    /**
     * @param args
     */
    public static void main(String[] args) {
        String firstname = "shahul";
        String lastname = "hameedkhan";
        String fullname = firstname + " " + lastname;

        System.out.println(fullname);

        String upperCaseFullname = fullname.toUpperCase();
        System.out.println(upperCaseFullname);

        System.out.println(firstname == lastname);

        String sentence = "My name is  shahul and I am learning Java.";
        String word[] = sentence.split(" ");
        
        System.out.println("Word count: " + word.length);
  }
}
