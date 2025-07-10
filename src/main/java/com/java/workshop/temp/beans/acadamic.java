package com.java.workshop.temp.beans;

public class acadamic extends building {
    private boolean isLibraryAvailable  = false;
    private int numberOfClassrooms;     

    // Getters
    public boolean isLibraryAvailable() {
        return isLibraryAvailable;
    
    }
    public int getNumberOfClassrooms() {
        return numberOfClassrooms;
    }
    // Setters
    public void setLibraryAvailable(boolean isLibraryAvailable) {
        this.isLibraryAvailable = isLibraryAvailable;
    }
    public void setNumberOfClassrooms(int numberOfClassrooms) {
        this.numberOfClassrooms = numberOfClassrooms;

    }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Library Available: " + isLibraryAvailable);
        System.out.println("Number of Classrooms: " + numberOfClassrooms);
    }
}
