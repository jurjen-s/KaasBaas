/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsvier.meebezig_oud.menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jurjen
 */
public class VerwijderenMenu {
    private static void showVerwijderenMenu() {
            System.out.println("==========================");
	    System.out.println("Verwijder producten.");
	    System.out.println("--------------------------");
	    System.out.println("Wat is de soort van het te verwijderen product?");
	    String verwijderProduct = System.console().readLine();
	    try {
                Connection conn = openConnection();
	    	PreparedStatement stmt = conn.prepareStatement(
                    "DELETE FROM Producten" +
                    "WHERE soort = ?");
	    	stmt.setString(1, verwijderProduct);
	    	stmt.executeUpdate();
                conn.close();
                stmt.close();
	    } catch (SQLException ex) {
	    	ex.getMessage();
	    }
	    System.out.print("Wilt u nog een product toevoegen? Ja/Nee\n" +
				 "\"Nee\" keert terug naar het hoofdmenu.");
            if (System.console().readLine().equalsIgnoreCase("ja")) {
                    showVerwijderenMenu();
            } else if (System.console().readLine().equalsIgnoreCase("nee")) {
                    showHoofdMenu();
            } else {
                    System.out.println("Ongeldige invoer.");
            }
	} // einde showVerwijderenMenu
}
