package com.java.workshop.temp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.java.workshop.temp.bin.Orgranaization;

public class JDBCExample {

    public static void main(String[] args) {

        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");

        
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection=DriverManager.getConnection("jdbc:h2:mem:tempdatadb", "sa", null);
        } catch (SQLException sqlException) {
           System.out.println("Error creating table:" + sqlException);
        }
        OrganizationDao organizationDao = new OrganizationDao();
        organizationDao.createTable(connection);
        Orgranaization vet = new Orgranaization("VET","Thindal, Erode",
        1234567890,"vetias@gmail.com","www.vetias.com",
        98766543,null);
        
        organizationDao.save(connection,vet);

       Orgranaization myOrgranaization = organizationDao.findByName(connection, "VET");
       System.out.println("My Organization is:" + myOrgranaization);

    } 
}