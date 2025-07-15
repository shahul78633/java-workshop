package com.java.workshop.temp.dao;

public class JDBCDAOApplication {
    public static void main(String[] args) {
        OrganizationDao organization = new OrganizationDao();
        organization.createTable();
        
        
    }
    
}
