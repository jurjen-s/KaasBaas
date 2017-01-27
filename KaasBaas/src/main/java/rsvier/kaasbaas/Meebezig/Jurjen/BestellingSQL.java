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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jurjen
 */
public class BestellingSQL implements BestellingDAO {
    
    private Connection bestellingenconnectie;
    
    public BestellingSQL(Connection connectie) {
        this.bestellingenconnectie = connectie;
        System.out.println("============================");
        System.out.println("Wat wilt u doen?");
        System.out.println("----------------------------");
        System.out.println("1: Bestellingen doorzoeken.");
        System.out.println("2: Bestellingen toevoegen.");
        System.out.println("3: Bestellingen aanpassen.");
        System.out.println("4: Bestellingen verwijderen.");
        System.out.println("5: Terug naar hoofdmenu.");
        System.out.println("----------------------------");
        System.out.println("Geef uw keuze (1-5): ");
        System.out.println("============================");
        int keuze = TextIO.getlnInt();
        switch (keuze) {
            case 1:     zoekenBestelling();
                        break;
            case 2:     toevoegenBestelling();
                        break;
            case 3:     aanpassenBestelling();
                        break;
            case 4:     verwijderenBestelling();
            
            case 5:     // hoofdMenu.showMenu();
            
            default:    System.out.println("Ongeldige invoer.");
                        new BestellingSQL(bestellingenconnectie);
        }
        
    }
    
    @Override
    public void zoekenBestelling() { // deze moet nog aangepast worden
        // Laat keuze-menu zien
        // Registreer keuze en geef verzoek door aan database
        // Laat zoekresultaat zien
        List<Product> zoekresultaat = new ArrayList<>();
        System.out.println("============================");
        System.out.println("Hoe wilt u bestellingen zoeken?");
        System.out.println("----------------------------");
        System.out.println("| 1: Doorzoek op bestellingID.|"); 
        System.out.println("| 2: Doorzoek op klantID.    |");
        System.out.println("| 3: Doorzoek op adres.    |");
        System.out.println("| 4: Doorzoek op aantal artikelen. |");
        System.out.println("| 5: Doorzoek op totaalprijs.");
        System.out.println("| 6: Terug naar hoofdmenu. |");
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
                        PreparedStatement stmt = bestellingenconnectie.prepareStatement(
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
                    zoekenBestelling();
                    break;
            } // einde switch
    zoekenBestelling();
    } // einde zoekenBestelling()
    

    @Override
    public void toevoegenBestelling() {
        // Menu om bestellingen toe te voegen
        // Controleert of alle foreign keys in bestellingen verwijzen naar een waarde ipv null
            // Vraagt om waardes toe te voegen als ze ontbreken
        System.out.println("=========================================");
        System.out.println("Voeg nieuwe bestelling toe.");
        System.out.println("-----------------------------------------");
        System.out.println("Wat is de naam van de bijbehorende klant?");
        System.out.println("Voornaam: ");
        String voornaam = TextIO.getln();
        System.out.println("Achternaam: ");
        String achternaam = TextIO.getln();
        System.out.println("-----------------------------------------.");
        // Zoek of klantID al bestaat in klanten tabel. Zo niet, prompt dan om toevoegen nieuwe klant.
        int klantID;
        try {
            PreparedStatement stmt = bestellingenconnectie.prepareStatement(
               "SELECT klanten_id" +
               "FROM klanten" +
               "WHERE voornaam = ? and achternaam = ?");
            stmt.setString(1, voornaam);
            stmt.setString(2, achternaam);
            ResultSet rs = stmt.executeQuery();
            stmt.close();
            klantID = rs.getInt("klanten_id");
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("De klant " + voornaam + "  " + achternaam + " kan niet worden gevonden.");
            System.out.println("Wilt u een nieuwe klant aanmaken?\n" +
                                "Ja/Nee.");
            // Ja >> roep functie aan om nieuwe klant aan te maken
                // functie returnt klantID = net aangemaakte klant_id
            // Nee >> terug naar toevoegen bestelling menu
        }
        // Zoek of klant met <voornaam> en <achternaam> een adres heeft voor bestellingen
        try {
            PreparedStatement stmt = bestellingenconnectie.prepareStatement(
                "SELECT straatnaam, huisnummer, " +
                    "(SELECT huisnummer_toevoeging FROM adressen WHERE heeft_huisnr_toevoeging = 1)" +
                "postcode, land" +
                "FROM adressen" +
                "WHERE adressen_type = 2");
            ResultSet rs = stmt.executeQuery();
            stmt.close();
            String straatnaam = rs.getString("straatnaam");
            int huisnummer = rs.getInt("huisnummer");
            String huisnummer_toevoeging = "";
            if (!rs.getString("huisnummer_toevoeging").equalsIgnoreCase("null")) {
                huisnummer_toevoeging = rs.getString("huisnummer_toevoeging");
            }
            String postcode = rs.getString("postcode");
            String land = rs.getString("land");
            // Laat het bijbehorende adres van de klant zien. Vraag of het klopt of dat er wat aangepast moet worden.
            System.out.println("Het gevonden adres bij klant" + voornaam + " " + achternaam + " is "
                    + straatnaam + " " + huisnummer + "-" + huisnummer_toevoeging +
                     " " + postcode + "\t" + land);
            System.out.println("Kloppen deze gegevens?\n" +
                                "Ja/Nee.");
            // Ja >> ga verder (eigenlijk niet nodig, want is al einde van try block)
            // Nee >> vraag of adres aangepast moet worden
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("Het bezorgadres van klant " + voornaam + "  " + achternaam + " kan niet worden gevonden.");
            System.out.println("Wilt u een nieuw adres aanmaken?\n" +
                                "Ja/Nee.");
            // Ja >> roep functie aan om niew adres aan te maken
            // Nee >> print dat bestelling niet aangemaakt kan worden en keer terug naar menu toevoegenBestelling
        }    
        try {
            PreparedStatement stmt = bestellingenconnectie.prepareStatement(
            "INSERT INTO bestellingen (FK_klanten_id, FK_adressen_id, aantal_artikelen, totaalprijs) " +
            "VALUES (?, ?, ?, ?)");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        // vraag of haal op om hoeveel artikelen het gaat
        // vraag of haal op wat de totaalprijs is
        System.out.println("Dit zijn de gegevens van de bestelling.");
        // Print Klant (voornaam + achternaam) heeft bestelling (bestelling_id) met aantal_artikelen en totaalprijs
    

    @Override
    public void aanpassenProduct() {// deze moet nog aangepast worden
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
    public void verwijderenProduct() {// deze moet nog aangepast worden
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
