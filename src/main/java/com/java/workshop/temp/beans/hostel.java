package com.java.workshop.temp.beans;

public class hostel extends building {
    private boolean isMessAvailable;
    private int numberofRooms;

    // Getters
    public boolean isMessAvailable() {      
        return isMessAvailable;
    }
    public int getNumberofRooms() {
        return numberofRooms;
    }
    // Setters
    public void setMessAvailable(boolean isMessAvailable) {
        this.isMessAvailable = isMessAvailable;
    }
    public void setNumberofRooms(int numberofRooms) {
        this.numberofRooms = numberofRooms;
    }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Mess Available: " + isMessAvailable);
        System.out.println("Number of Rooms: " + numberofRooms);
    }


    
}