/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsvier.meebezig_oud.menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jurjen
 */
public class AanpassenMenu {
    private static void	showAanpassenMenu() {
            System.out.println("==========================");
	    System.out.println("Pas producten aan.");
	    System.out.println("--------------------------");
	    // volgorde van kolommen: product_id, omschrijving, soort, prijs, voorraad
	    System.out.println("Wat is de soort van het aan te passen product?");
	    String aanpassenProduct = System.console().readLine();
	    System.out.println("Welke eigenschap (omschrijving, soort, prijs, voorraad) wilt u aanpassen?\n" +
	    				   "Omschrijving, soort, prijs of voorraad?");
	    String kolomnaam = System.console().readLine();
	    // Haal huidige waarde van de genoemde eigenschap op
	    String huidigeWaarde = "";
	    try {
                Connection conn = openConnection();
                PreparedStatement stmt = conn.prepareStatement(
                    "SELECT ?" +
                    "FROM Producten" +
                    "WHERE soort = ?");
                stmt.setString(1, kolomnaam.toLowerCase());
                stmt.setString(2, aanpassenProduct);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    huidigeWaarde = rs.getString(kolomnaam);
                }
                conn.close();
                stmt.close();
	    } catch (SQLException ex) {
	    	ex.getMessage();
	    }
	    // Vraag wat nieuwe waarde wordt
	    System.out.println("De huidige waarde van " + aanpassenProduct + " is " + huidigeWaarde + ".\n" +
	    				   "Wat wordt de nieuwe waarde?");
	    String nieuweWaarde = System.console().readLine();
	    	try {
                    Connection conn = openConnection();
                    PreparedStatement stmt = conn.prepareStatement(
                            "UPDATE Producten" +
                            "SET ? = ?" +
                            "WHERE soort = ?");
                            stmt.setString(1, kolomnaam);
                            stmt.setString(2, nieuweWaarde);
                    stmt.setString(3, aanpassenProduct);
                    stmt.executeUpdate();
                    conn.close();
                    stmt.close();
	    	} catch (SQLException ex) {
	    	    	ex.getMessage();
	    	}
	} // einde showAanpassenMenu
}
