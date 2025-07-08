package com.java.workshop.basics;

import java.time.LocalTime;

public class localtime {
    public static void main(String[] args){
        LocalTime currentTime = LocalTime.now();
        LocalTime registrationTime = LocalTime.of(18 , 8, 0);
        int hrs = registrationTime.getHour() - currentTime.getHour();
        int min = registrationTime.getMinute() - currentTime.getMinute();
        int sec = registrationTime.getSecond() - currentTime.getSecond();
        System.out.println("you have only: " + hrs + ":" + min + ":" + sec + "sec left");
    }
    
}
