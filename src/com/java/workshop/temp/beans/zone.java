package com.java.workshop.temp.beans;

public class zone {
    private String name;
    private Double id;
    private String type;
    private Double dimension;

    //getters
    public Double getId() {
        return id;
    }
    public String getName() {
        return name;
    }       
    public String getType() {
        return type;
    }       
    public Double getDimension() {
        return dimension;
    }

    //setters
    public void setId(Double id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setDimension(Double dimension) {
        this.dimension = dimension;
    }
    public void printDetails() {
        System.out.println("Zone ID: " + id);
        System.out.println("Zone Name: " + name);
        System.out.println("Zone Type: " + type);
        System.out.println("Zone Dimension: " + dimension);
    }
}

