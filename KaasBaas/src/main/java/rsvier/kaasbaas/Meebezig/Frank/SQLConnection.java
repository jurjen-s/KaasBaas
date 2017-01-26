/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht6test;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author jurjen
 */
public class SQLConnection {
    
    public static Connection getSQLConnection() {    
        
        
    // nieuwe connectie aanmaken met try-with-resources: 
    // try (Connection x = database.access.ConnectionManager.SQLConnection()) 
    // waarbij x aangeeft om welke connectie het gaat
            Connection sqlconnectie = null;
            // Define host and username/password
            String host = "jdbc:mysql://localhost:3306/mydb";
            String userName = "admin";
            String userPass = "admin";
            // Try to load the driver
            try {                
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
  System.out.println("JDBC Driver niet gevonden.");
  e.printStackTrace();
            }
            // Try to establish connection
            try {
                sqlconnectie = DriverManager.getConnection(host, userName, userPass);
            } catch (SQLException ex) {
                System.out.println("Geen verbinding met de SQL database verkregen.");
                ex.getMessage();
            }
        return sqlconnectie;
        }
}

