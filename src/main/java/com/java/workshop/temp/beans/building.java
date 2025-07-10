package com.java.workshop.temp.beans;
import java.time.LocalDateTime;
public class building{
    private String name;
    private String area;
    private Double floor;
    private LocalDateTime opendatetime;
    private LocalDateTime closedatetime;

    //getters
    public String getName() {
        return name;
    }
    public String getArea() {
        return area;
    }
    public Double getFloor() {
        return floor;
    }
    public LocalDateTime getOpenDateTime() {
        return opendatetime;
    }
    public LocalDateTime getCloseDateTime() {
        return closedatetime;
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public void setFloor(Double floor) {
        this.floor = floor;
    }
    public void setOpenDateTime(LocalDateTime opendatetime) {
        this.opendatetime = opendatetime;
    }
    public void setCloseDateTime(LocalDateTime closedatetime) {
        this.closedatetime = closedatetime;
    }
    public void printDetails() {
        System.out.println("Building Name: " + name);
        System.out.println("Area: " + area);
        System.out.println("Number of Floors: " + floor);
        System.out.println("Open Date and Time: " + opendatetime);
        System.out.println("Close Date and Time: " + closedatetime);
    }
}