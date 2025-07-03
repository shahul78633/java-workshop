package com.java.workshop.temp.beans;

public class location {
    private String name;
    private Double latitude;
    private Double longitude;
    private String description;
    private String  country;
    private String city;
    private String address;
    private Double postalcode;

    //getters
    public String getName() {
        return name;
    }
    public Double getLatitude() {
        return latitude;
    }
    public Double getLongitude() {
        return longitude;
    }
    public String getDescription() {
        return description;
    }
    public String getCountry() {
        return country;
    }
    public String getCity() {
        return city;
    }
    public String getAddress() {
        return address;
    }
    public Double getPostalcode() {
        return postalcode;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPostalcode(Double postalcode) {
        this.postalcode = postalcode;
    }

    public void printDetails() {
        System.out.println("Location Name: " + name);
        System.out.println("Latitude: " + latitude);
        System.out.println("Longitude: " + longitude);
        System.out.println("Description: " + description);
        System.out.println("Country: " + country);
        System.out.println("City: " + city);
        System.out.println("Address: " + address);
        System.out.println("Postal Code: " + postalcode);
    }
}

