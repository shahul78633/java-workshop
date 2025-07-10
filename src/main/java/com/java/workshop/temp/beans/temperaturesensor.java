package com.java.workshop.temp.beans;

public class temperaturesensor implements sensor {
    private float temperature;

    public temperaturesensor(float atemperature) {
        temperature = atemperature;
    }

    public float getReading(){
        return temperature;
    }
}