package com.java.workshop.standardlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyUsingBinary {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream(" src/com/java/workshop/standardlib/madara.jpg");
            FileOutputStream outputStream = new FileOutputStream(" src/com/java/workshop/standardlib/naruto.jpg")) {
            
            byte[] chunk = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(chunk)) != -1) {
                outputStream.write(chunk, 0, bytesRead);
            }
        
        } catch (IOException e) {
            System.err.println("there is error in reading and writing the file:");  
        }
    }
}