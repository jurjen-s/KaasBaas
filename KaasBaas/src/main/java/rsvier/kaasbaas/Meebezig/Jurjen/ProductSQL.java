/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsvier.kaasbaas.Meebezig.Jurjen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

/**
 *
 * @author jurjen
 */
public class ProductSQL implements ProductDAO {
    
    private Connection productenconnectie;
    
    public ProductSQL(Connection connectie) {
        this.productenconnectie = connectie;
        System.out.println("========================");
        System.out.println("Wat wilt u doen?");
        System.out.println("------------------------");
        System.out.println("1: Producten doorzoeken.");
        System.out.println("2: Producten toevoegen.");
        System.out.println("3: Producten aanpassen.");
        System.out.println("4: Producten verwijderen.");
        System.out.println("5: Terug naar hoofdmenu.");
        System.out.println("------------------------");
        System.out.println("Geef uw keuze (1-5): ");
        System.out.println("========================");
        int keuze = TextIO.getlnInt();
        switch (keuze) {
            case 1:     zoekenProduct();
                        break;
            case 2:     toevoegenProduct();
                        break;
            case 3:     aanpassenProduct();
                        break;
            case 4:     verwijderenProduct();
            
            case 5:     // hoofdMenu.showMenu();
            
            default:    System.out.println("Ongeldige invoer.");
                        new ProductSQL(productenconnectie);
        }
        
    }
    
    @Override
    public void zoekenProduct() {
        // Laat keuze-menu zien
        // Registreer keuze en geef verzoek door aan database
        // Laat zoekresultaat zien
        List<Product> zoekresultaat = new ArrayList<>();
        System.out.println("============================");
        System.out.println("Hoe wilt u producten zoeken?");
        System.out.println("----------------------------");
        System.out.println("| 1: Doorzoek op productID.|"); 
        System.out.println("| 2: Doorzoek op soort.    |");
        System.out.println("| 3: Doorzoek op prijs.    |");
        System.out.println("| 4: Doorzoek op voorraad. |");
        System.out.println("| 5: Terug naar hoofdmenu. |");
        System.out.println("----------------------------");
        System.out.println("|   Geef uw keuze (1-5):   |");
        System.out.println("============================");
        int keuze = TextIO.getlnInt();
        // Laat volgende menu zien afhankelijk van keuze
        switch (keuze) {
            case 1:
                    System.out.println("=========================");
                    System.out.println("Doorzoek op productID");
                    System.out.println("-------------------------");
                    System.out.println("Geef het productID op: ");  
                    int productID = TextIO.getlnInt(); // controleren input dmv error-handling
                    try {
                        PreparedStatement stmt = productenconnectie.prepareStatement(
                            "SELECT * " +
                            " FROM producten " +
                            " WHERE producten_id = ?");
                        stmt.setInt(1, productID);
                        ResultSet rs = stmt.executeQuery();
                        // Laat alle producten met het opgegeven productID zien
                        while (rs.next()) {
                            Product gevondenProduct = new Product.ProductBuilder(rs.getInt(1))  //productID
                                                                .omschrijving(rs.getString(2))  //omschrijving
                                                                .soort(rs.getString(3))         //soort
                                                                .prijs(rs.getBigDecimal(4))     //prijs
                                                                .voorraad(rs.getInt(5))         //voorraad
                                                                .build();
                            zoekresultaat.add(gevondenProduct);
                        }
                        // productenconnectie.close();      // wel of niet nodig?
                        stmt.close();
                    } catch (SQLException ex) {
                            System.out.println("Het zoeken op productID ging mis.");
                            ex.getMessage();
                    }
                    // Print de zoekresultaten
                    if (zoekresultaat.isEmpty()) {
                        System.out.println("Geen zoekresultaten.");
                    }
                    for (Product product : zoekresultaat) {
                        System.out.println(product);
                    }
                    break; // einde case 1
            case 2:
                    System.out.println("=========================");
                    System.out.println("Doorzoek op soort");
                    System.out.println("-------------------------");
                    System.out.println("Geef het soort op: ");
                    String soort = TextIO.getln();
                    try {
                        PreparedStatement stmt = productenconnectie.prepareStatement(
                            "SELECT * " +
                            " FROM producten " +
                            " WHERE soort = ?");
                        stmt.setString(1, soort);
                        ResultSet rs = stmt.executeQuery();
                        // Laat alle producten met de opgegeven soort zien
                        while (rs.next()) {
                            Product gevondenProduct = new Product.ProductBuilder(rs.getInt(1))  //productID
                                                                .omschrijving(rs.getString(2))  //omschrijving
                                                                .soort(rs.getString(3))         //soort
                                                                .prijs(rs.getBigDecimal(4))     //prijs
                                                                .voorraad(rs.getInt(5))         //voorraad
                                                                .build();
                            zoekresultaat.add(gevondenProduct);
                        }
                        stmt.close();
                    } catch (SQLException ex) {
                            System.out.println("Het zoeken op soort ging mis.");
                            ex.getMessage();
                    }
                        /*System.out.println("Wilt u nog een productsoort zoeken? (Ja/Nee)");
                        String antwoord = TextIO.getln();
                        if (antwoord.equalsIgnoreCase("nee")) {
                            break;
                        }*/
                    // Print de zoekresultaten
                    if (zoekresultaat.isEmpty()) {
                        System.out.println("Geen zoekresultaten.");
                    }
                    for (Product product : zoekresultaat) {
                        System.out.println(product);
                    }
                    break; // einde case 2
            case 3:
                    System.out.println("=========================");
                    System.out.println("Doorzoek op prijs");
                    System.out.println("-------------------------");
                    System.out.println("Geef de prijs op: ");
                    String opgegevenPrijs = TextIO.getln();
                    BigDecimal prijs = new BigDecimal(opgegevenPrijs);
                    try {
                        PreparedStatement stmt = productenconnectie.prepareStatement(
                            "SELECT * " +
                            " FROM producten " +
                            " WHERE prijs = ?");
                        stmt.setBigDecimal(1, prijs);
                        ResultSet rs = stmt.executeQuery();
                        // Laat alle producten met de opgegeven prijs zien
                        while (rs.next()) {
                                Product gevondenProduct = new Product.ProductBuilder(rs.getInt(1))  //productID
                                                                .omschrijving(rs.getString(2))  //omschrijving
                                                                .soort(rs.getString(3))         //soort
                                                                .prijs(rs.getBigDecimal(4))     //prijs
                                                                .voorraad(rs.getInt(5))         //voorraad
                                                                .build();
                            zoekresultaat.add(gevondenProduct);
                        }
                        stmt.close();
                    } catch (SQLException ex) {
                            System.out.println("Het zoeken op prijs ging mis.");
                            ex.getMessage();
                    }
                    // Print de zoekresultaten
                    if (zoekresultaat.isEmpty()) {
                        System.out.println("Geen zoekresultaten.");
                    }
                    for (Product product : zoekresultaat) {
                        System.out.println(product);
                    }
                    break; // einde case 3
            case 4:
                    System.out.println("=========================");
                    System.out.println("Doorzoek op voorraad");
                    System.out.println("-------------------------");
                    System.out.println("Geef de voorraad op: ");
                    int voorraad = TextIO.getlnInt();
                    try {
                        PreparedStatement stmt = productenconnectie.prepareStatement(
                            "SELECT * " +
                            " FROM producten " +
                            " WHERE voorraad = ?");
                        stmt.setInt(1, voorraad);
                        ResultSet rs = stmt.executeQuery();
                        // Laat alle producten met de opgegeven voorraad zien
                        while (rs.next()) {
                                Product gevondenProduct = new Product.ProductBuilder(rs.getInt(1))  //productID
                                                                .omschrijving(rs.getString(2))  //omschrijving
                                                                .soort(rs.getString(3))         //soort
                                                                .prijs(rs.getBigDecimal(4))     //prijs
                                                                .voorraad(rs.getInt(5))         //voorraad
                                                                .build();
                            zoekresultaat.add(gevondenProduct);
                        }
                        stmt.close();
                    } catch (SQLException ex) {
                            System.out.println("Het zoeken op voorraad ging mis.");
                            ex.getMessage();
                    }
                    // Print de zoekresultaten
                    if (zoekresultaat.isEmpty()) {
                        System.out.println("Geen zoekresultaten.");
                    }
                    for (Product product : zoekresultaat) {
                        System.out.println(product);
                    }
                    break; // einde case 4
            case 5:
                    //hoofdMenu.showMenu();
                    System.out.println("Hier komt een verwijzing naar het hoofdmenu.");
                    break;
            default:
                    System.out.println("Ongeldige invoer.");
                    zoekenProduct();
                    break;
            } // einde switch
    zoekenProduct();
    } // einde zoekenProduct()
    

    @Override
    public void toevoegenProduct() {
        System.out.println("==========================");
        System.out.println("Voeg nieuwe producten toe.");
        System.out.println("--------------------------");
        System.out.println("Wat is de omschrijving?");
        String omschrijving = TextIO.getln();
        System.out.println("Wat is de soort?");
        String soort = TextIO.getln();
        System.out.println("Wat is de prijs?");
        BigDecimal prijs = new BigDecimal(TextIO.getln());
        System.out.println("Wat is de voorraad?");
        int voorraad = TextIO.getInt();
        //int productID = TextIO.getInt(); //overbodig, want product_id is auto-increment        
        // Voeg de gegevens toe aan de tabel Producten
        try {
            PreparedStatement stmt = productenconnectie.prepareStatement(
                "INSERT into producten (omschrijving, soort, prijs, voorraad) "+
                "VALUES (?, ?, ?, ?)");
            stmt.setString(1, omschrijving);
            stmt.setString(2, soort);
            stmt.setBigDecimal(3, prijs);
            stmt.setInt(4, voorraad);
            stmt.executeUpdate();
            stmt.close();
        } catch (NullPointerException | SQLException ex) {
            System.out.println("Er ging iets mis bij het toevoegen van het product.");
            ex.getMessage();
        }
        System.out.println("Product succesvol toegevoegd.");
        System.out.println("Wilt u nog een product toevoegen? Ja/Nee\n" +
                         "\"Nee\" keert terug naar het vorige menu.");
        String antwoord = TextIO.getln();
        if (antwoord.equalsIgnoreCase("ja")) {
            toevoegenProduct();
        } else if (antwoord.equalsIgnoreCase("nee")) {
            zoekenProduct();
        } else {
            System.out.println("Ongeldige invoer.");
        }        
    toevoegenProduct();
    } // einde toevoegenProduct
    

    @Override
    public void aanpassenProduct() {
        System.out.println("==========================");
        System.out.println("Pas producten aan.");
        System.out.println("--------------------------");
        // volgorde van kolommen: product_id, omschrijving, soort, prijs, voorraad
        System.out.println("Wat is de soort van het aan te passen product?");
        String aanpassenProduct = TextIO.getln();
        System.out.println("Welke eigenschap (omschrijving, soort, prijs, voorraad) wilt u aanpassen?\n" +
                                       "Omschrijving, soort, prijs of voorraad?");
        String kolomnaam = TextIO.getln();
        // Haal huidige waarde van de genoemde eigenschap op
        String huidigeWaarde = "";
        try {
            PreparedStatement stmt = productenconnectie.prepareStatement(
                "SELECT ?" +
                "FROM Producten" +
                "WHERE soort = ?");
            stmt.setString(1, kolomnaam.toLowerCase());
            stmt.setString(2, aanpassenProduct);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                huidigeWaarde = rs.getString(kolomnaam);
            }
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Er ging iets mis bij het zoeken naar het aan te passen product.");
            ex.getMessage();
        }
        // Vraag wat nieuwe waarde wordt
        System.out.println("De huidige waarde van " + aanpassenProduct + " is " + huidigeWaarde + ".\n" +
                                       "Wat wordt de nieuwe waarde?");
        String nieuweWaarde = System.console().readLine();
            try {
                PreparedStatement stmt = productenconnectie.prepareStatement(
                        "UPDATE Producten" +
                        "SET ? = ?" +
                        "WHERE soort = ?");
                        stmt.setString(1, kolomnaam);
                        stmt.setString(2, nieuweWaarde);
                stmt.setString(3, aanpassenProduct);
                stmt.executeUpdate();
                stmt.close();
            } catch (SQLException ex) {
                System.out.println("Er ging iets mis bij het aanpassen van het product.");
                ex.getMessage();
            }
    aanpassenProduct();
    } // einde showAanpassenMenu
    

    @Override
    public void verwijderenProduct() {
        System.out.println("==========================");
        System.out.println("Verwijder producten.");
        System.out.println("--------------------------");
        System.out.println("Wat is de soort van het te verwijderen product?");
        String verwijderProduct = TextIO.getln();
        try {
            PreparedStatement stmt = productenconnectie.prepareStatement(
                "DELETE FROM Producten" +
                "WHERE soort = ?");
            stmt.setString(1, verwijderProduct);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Er ging iets mis met het zoeken naar het te verwijderen product.");
            ex.getMessage();
        }
        System.out.print("Wilt u nog een product toevoegen? Ja/Nee\n" +
                             "\"Nee\" keert terug naar het hoofdmenu.");
        if (TextIO.getln().equalsIgnoreCase("ja")) {
                verwijderenProduct();
        } else if (TextIO.getln().equalsIgnoreCase("nee")) {
                zoekenProduct();
        } else {
                System.out.println("Ongeldige invoer.");
        }
    verwijderenProduct();
    } // einde showVerwijderenMenu
    
    
} // einde ProductSQL
