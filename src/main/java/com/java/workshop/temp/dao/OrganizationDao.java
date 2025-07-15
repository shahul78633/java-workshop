package com.java.workshop.temp.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class OrganizationDao {
    public void createTable(Connection connection) {
        try (Statement statement = connection.createStatement()) {
            statement.execute("""
                CREATE TABLE Organization (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    name VARCHAR(100),
                    website VARCHAR(100),
                    email VARCHAR(100),
                    CONTACT_NUMBER VARCHAR(100),
                    REGISTRATION_NO INT,
                    ADDRESS VARCHAR(100)
                )
                """);
        } catch (SQLException sqlException) {
            System.out.println("Error creating table: " + sqlException);
        }
        OrganizationDao organizationDao = new OrganizationDao();
        organizationDao.createTable();


        public int save(Connection connection, Organization vet) {
            try (PreparedStatement preparedStatement = connection.prepareStatement("""
                insert info organization (name, website, email, contact_number, 
                registration_no, address) values (?, ?, ?, ?, ?, ?)
                """)) {

                preparedStatement.setString(1,vet.name());
                preparedStatement.setString(2, vet.Website());
                preparedStatement.setString(3, vet.Email());
                preparedStatement.setString(4, vet.ContactNumber());
                preparedStatement.setInt(5, vet.RegistrationNo());
                preparedStatement.setString(6, vet.Address());
                return preparedStatement.executeUpdate();
            } catch (SQLException sqlException) {
                System.out.println("Error insertting into table:" + sqlException);
            }
            return 0;
        }
    }
        }

    
