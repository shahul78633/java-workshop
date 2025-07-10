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
    @Override
    public String toString() {
        return "Zone{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", type='" + type + '\'' +
                ", dimension=" + dimension +
                '}';
    }
}