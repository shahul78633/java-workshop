package com.java.workshop.temp.beans;

import java.time.LocalDate;
public record Organization(String name,String address,int contactNumber,String email,String website,
int registrationNumber,LocalDate registrationDate

) {

}
