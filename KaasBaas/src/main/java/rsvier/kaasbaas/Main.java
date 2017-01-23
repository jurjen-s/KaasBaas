/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsvier.kaasbaas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jurjen
 */
public class Main {
    
    Connection verbinding = openConnection();
    
    private Connection openConnection() {
            // Laad de driver
            try {                
                Class.forName("com.mysql.jdbc.Driver");
                } catch (ClassNotFoundException e) {
		System.out.println("MySQL JDBC Driver niet gevonden.");
		e.printStackTrace();
            }
            Connection connection = null;
            // Stel host en username/password van database in
            String host = "jdbc:mysql://localhost:3306/mydb";
            String userName = "admin";
            String userPass = "admin";
            // Maak verbinding
            try {
                connection = DriverManager.getConnection(host, userName, userPass);
                if (connection != null && connection.isValid(10)) {
                    System.out.println("Verbonden!");
                } else {
                    System.out.println("Niet verbonden.");
                }
            } catch (SQLException ex) {
                    ex.getMessage();
            }
        return connection;
        }
}
