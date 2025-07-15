package com.java.workshop.temp.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.java.workshop.temp.beans.Organization;

public class JDBCExample {

    public static void main(String[] args) {
        Connection connection = null;
        try{
            Class.forName("org.h2.Driver");
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", null);
        }catch (SQLException SQLException){
            System.out.println("Error creating table " + SQLException);
        }

        OrganizationDao  organizationDao = new OrganizationDao();
        organizationDao.createTable(connection);
        Organization vet = new Organization("vet","thindal,Erode",94894408,
        "vetal@gmail.com","www.vetias.com",78656786,null);
        organizationDao.save(connection,vet);
        

    }


}
