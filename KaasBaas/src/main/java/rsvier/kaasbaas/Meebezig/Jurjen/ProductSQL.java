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
public final class ProductSQL implements ProductDAO {
    
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
                        break;/*
            case 2:     toevoegenProduct();
                        break;
            case 3:     aanpassenProduct();
                        break;
            case 4:     verwijderenProduct();
            
            case 5:     hoofdMenu;
            
            default:    System,out.println("Ongeldige invoer.");
                        ProductSQL();*/
        }
        
    }
    
    @Override
    public List<Product> zoekenProduct() {
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
                    for (Product product : zoekresultaat) {
                        System.out.println(product);
                    }
                    break; // einde case 1
            case 2:
                    System.out.println("=========================");
                    System.out.println("Doorzoek op soort");
                    System.out.println("-------------------------");
                    while (true) {
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
                        System.out.println("Wilt u nog een productsoort zoeken? (Ja/Nee)");
                        String antwoord = TextIO.getln();
                        if (antwoord.equalsIgnoreCase("nee")) {
                            break;
                        }
                    } // einde while-loop
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
                    for (Product product : zoekresultaat) {
                        System.out.println(product);
                    }
                    break; // einde case 4
            case 5:
                    //showHoofdMenu();
                    System.out.println("Hier komt een verwijzing naar het hoofdmenu.");
                    break;
            default:
                    System.out.println("Ongeldige invoer.");
                    //showDoorzoekenMenu();
                    break;
            } // einde switch
    return zoekresultaat;
    } // einde zoekenProduct()
    

    @Override
    public boolean toevoegenProduct(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean aanpassenProduct(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verwijderenProduct(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
