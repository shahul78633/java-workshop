package com.java.workshop.basics;

public class empdetatils {
    public static void main(String[] args) {
        String[][]empDetails =new String[5][2];
        empDetails[0][0] = "23000001";
        empDetails[0][1] = "shahul";
        empDetails[1][0] = "23000002";
        empDetails[1][1] = "zameer";
        empDetails[2][0] = "23000003";
        empDetails[2][1] = "iman";
        empDetails[3][0] = "23000004";
        empDetails[3][1] = "logesh";
        empDetails[4][0] = "23000005";
        empDetails[4][1] = "sandy";
        System.out.println("Employee Details:");

        for (String[] emp : empDetails) {
            System.out.println("Employee ID: " + emp[0] + ", Name: " + emp[1]);
        }  
       }
    
}
