/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsvier.kaasbaas.Meebezig.Jurjen;

import java.sql.Connection;

/**
 *
 * @author jurjen
 */
public class TestProductDAO {
    
    public static void main(String[] args) {
    SQLConnection connectie = new SQLConnection();
    ProductDAO productDAO = new ProductSQL(connectie.getSQLConnection());
    }
}
