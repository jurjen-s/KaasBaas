/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsvier.meebezig_oud.menu;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jurjen
 */
public class ToevoegenMenu {
    private static void showToevoegenMenu() {
            System.out.println("==========================");
	    System.out.println("Voeg nieuwe producten toe.");
	    System.out.println("--------------------------");
	    System.out.println("Wat is de omschrijving?");
	    String omschrijving = System.console().readLine();
	    System.out.println("Wat is de soort?");
	    String soort = System.console().readLine();
	    System.out.println("Wat is de prijs?");
	    BigDecimal prijs = new BigDecimal(System.console().readLine());
	    System.out.println("Wat is de voorraad?");
	    int voorraad = Integer.parseInt(System.console().readLine());
	    // Voeg de gegevens toe aan de tabel Producten
	      	//int productID = Integer.parseInt(System.console().readLine()); //overbodig, want product_id is auto-increment
	       	try {
                    Connection conn = openConnection();
                    PreparedStatement stmt = conn.prepareStatement(
	              	"INSERT into producten (omschrijving, soort, prijs, voorraad) "+
	               	"VALUES (?, ?, ?, ?)");
                    stmt.setString(1, omschrijving);
	            stmt.setString(2, soort);
	            stmt.setBigDecimal(3, prijs);
	            stmt.setInt(4, voorraad);
	            stmt.executeUpdate();
                    conn.close();
                    stmt.close();
		} catch (NullPointerException | SQLException ex) {
                    ex.getMessage();
		}
            System.out.println("Wilt u nog een product toevoegen? Ja/Nee\n" +
	       		     "\"Nee\" keert terug naar het hoofdmenu.");
            String antwoord = System.console().readLine();
            if (antwoord.equalsIgnoreCase("ja")) {
		showToevoegenMenu();
            } else if (antwoord.equalsIgnoreCase("nee")) {
            	showHoofdMenu();
            } else {
		System.out.println("Ongeldige invoer.");
            }
	} // einde showToevoegenMenu
}
