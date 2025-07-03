package com.java.workshop.temp.beans;

public class sensor {
    private int sensorid;
    private String name;
    private Double data;


    //getters
    public int getSensorId() {
        return sensorid;
    }
    public String getName() {
        return name;
    }
    public Double getData() {
        return data;
    }

    //setters
    public void setSensorId(int sensorid) {
        this.sensorid = sensorid;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setData(Double data) {
        this.data = data;
    }
    public void printDetails() {
        System.out.println("Sensor ID: " + sensorid);
        System.out.println("Sensor Name: " + name);
        System.out.println("Sensor Data: " + data);
    }
    

}

