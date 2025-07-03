package com.java.workshop.temp.beans;

public class floor {
    private  String name;
    private  Double number;

    //getters
    public String getName() {
        return name;
    }
    public Double getNumber() {
        return number;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(Double number) {
        this.number = number;
    }
    public void printDetails() {
        System.out.println("Floor Name: " + name);
        System.out.println("Floor Number: " + number);
    }
}