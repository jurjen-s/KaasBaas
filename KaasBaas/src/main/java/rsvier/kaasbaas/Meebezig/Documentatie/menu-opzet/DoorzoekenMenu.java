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
public class DoorzoekenMenu {
    
    public DoorzoekenMenu() {
        showDoorzoekenMenu();
    }
    public void showDoorzoekenMenu() {
    	int keuze1 = 0;
    	//do {
        	System.out.println("=========================");
        	System.out.println("Doorzoek producten");
        	System.out.println("-------------------------");
        	System.out.println("1: Doorzoek op productID."); 
        	System.out.println("2: Doorzoek op soort.");
        	System.out.println("3: Doorzoek op prijs.");
        	System.out.println("4: Doorzoek op voorraad.");
        	System.out.println("5: Terug naar hoofdmenu.");
        	System.out.println("=========================");
        	System.out.println("Geef uw keuze (1-5): ");
        	keuze1 = Integer.parseInt(System.console().readLine());
    	//} while (keuze1 != 5);
    		// Laat volgende menu zien afhankelijk van keuze
        	switch (keuze1) {
            	case 1:
			System.out.println("=========================");
                	System.out.println("Doorzoek op productID");
                	System.out.println("-------------------------");
                	System.out.println("Geef het productID op: ");
                	int productID = Integer.parseInt(System.console().readLine());
                	try (Connection DoorzoekProductID = rsvier.meebezig.ConnectionManager.SQLConnection()) {
                            //Connection conn = openConnection();
                            PreparedStatement stmt = DoorzoekProductID.prepareStatement(
                        	"SELECT * " +
                        	" FROM producten " +
                        	" WHERE producten_id = ?");
                            stmt.setInt(1, productID);
                            ResultSet rs = stmt.executeQuery();
                            // Laat alle producten met het opgegeven productID zien
                            while (rs.next()) {
                    		System.out.println(rs.getString(1)); // productID
                    		System.out.println(rs.getString(2)); // omschrijving
                    		System.out.println(rs.getString(3)); // soort
                    		System.out.println(rs.getString(4)); // prijs
                    		System.out.println(rs.getString(5)); // voorraad
                            }
                            conn.close();
                            stmt.close();
                	} catch (SQLException ex) {
                		ex.getMessage();
                	}  
                	break; // einde case 1
            	case 2:
                	System.out.println("=========================");
                	System.out.println("Doorzoek op soort");
                	System.out.println("-------------------------");
                	System.out.println("Geef het soort op: ");
                	String soort = System.console().readLine();
                	try {
                            Connection conn = openConnection();
                            PreparedStatement stmt = conn.prepareStatement(
                        	"SELECT soort, prijs, voorraad " +
                        	" FROM producten " +
                        	" WHERE soort = ?");
                            stmt.setString(1, soort);
                            ResultSet rs = stmt.executeQuery();
                            // Laat alle producten met het opgegeven productID zien
                            while (rs.next()) {
                                    System.out.println(rs.getString(1)); // productID
                                    System.out.println(rs.getString(2)); // omschrijving
                                    System.out.println(rs.getString(3)); // soort
                                    System.out.println(rs.getString(4)); // prijs
                                    System.out.println(rs.getString(5)); // voorraad
                            }
                            conn.close();
                            stmt.close();
                	} catch (SQLException ex) {
                		ex.getMessage();
                	}  
                	break; // einde case 2
            	case 3:
                	System.out.println("=========================");
                	System.out.println("Doorzoek op prijs");
                	System.out.println("-------------------------");
                	System.out.println("Geef de prijs op: ");
                	String prijs = System.console().readLine();
                	try {
                            Connection conn = openConnection();
                            PreparedStatement stmt = conn.prepareStatement(
                        	"SELECT soort, prijs, voorraad " +
                        	" FROM producten " +
                        	" WHERE soort = ?");
                            stmt.setString(1, prijs);
                            ResultSet rs = stmt.executeQuery();
                            // Laat alle producten met de opgegeven prijs zien
                            while (rs.next()) {
                                    System.out.println(rs.getString(1)); // productID
                                    System.out.println(rs.getString(2)); // omschrijving
                                    System.out.println(rs.getString(3)); // soort
                                    System.out.println(rs.getString(4)); // prijs
                                    System.out.println(rs.getString(5)); // voorraad
                            }
                            conn.close();
                            stmt.close();
                	} catch (SQLException ex) {
                		ex.getMessage();
                	}  
                	break; // einde case 3
            	case 4:
                	System.out.println("=========================");
                	System.out.println("Doorzoek op voorraad");
                	System.out.println("-------------------------");
                	System.out.println("Geef de voorraad op: ");
                	String voorraad = System.console().readLine();
                	try {
                            Connection conn = openConnection();
                            PreparedStatement stmt = conn.prepareStatement(
                        	"SELECT soort, prijs, voorraad " +
                        	" FROM producten " +
                        	" WHERE soort = ?");
                            stmt.setString(1, voorraad);
                            ResultSet rs = stmt.executeQuery();
                            // Laat alle producten met de opgegeven voorraad zien
                            while (rs.next()) {
                                    System.out.println(rs.getString(1)); // productID
                                    System.out.println(rs.getString(2)); // omschrijving
                                    System.out.println(rs.getString(3)); // soort
                                    System.out.println(rs.getString(4)); // prijs
                                    System.out.println(rs.getString(5)); // voorraad
                            }
                            conn.close();
                            stmt.close();
                	} catch (SQLException ex) {
                		ex.getMessage();
                	} 
                	break; // einde case 4
            	case 5:
            		showHoofdMenu();
            		break;
            	default:
            		System.out.println("Ongeldige invoer.");
            		break;
        } // einde switch
} // einde showDoorzoekMenu
}
