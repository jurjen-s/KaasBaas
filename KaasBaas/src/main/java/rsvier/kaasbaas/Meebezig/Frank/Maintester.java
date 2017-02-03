


package opdracht6test;

import java.math.BigDecimal;
import java.sql.*;

import java.util.*;

import opdracht6test.*;





/**
 *
 * @author Frank
 */
public class Maintester   {
    
    
   
    
    
    public static void main(String[] args) throws SQLException{
        
         SQLConnection connectie = new SQLConnection();
         KlantInterface KlantDAO = new KlantDAOinterfaceImpl(connectie.getSQLConnection());
        
         Klant testklant = new Klant();
     
        System.out.println("Maak eerst een klant");
      
//int idklant, String vnaam, String tv, String anaam, int tel,int FKAI, int FKAK, int FKAT
      testklant.setALL( "Yacco", 1, "t'", "Veld", 061212311 ,1, 1, 1);
        testklant.getAll();
        
   
       // int accountID = 1;
       // String accounttype = "medewerker";
       // String wachtwoord = "wachtwoordvanmedewerker1";
        
        /**
         
        try {
            Connection test = connectie.getSQLConnection();        
            PreparedStatement stmt = test.prepareStatement(
                "INSERT into accounts (accounts_id, accounts_type, wachtwoord) "+
                "VALUES (?, ?, ?)");
            stmt.setInt(1, accountID);
            stmt.setString(2, accounttype);
            
            stmt.setString(3, wachtwoord);
            stmt.executeUpdate();
            stmt.close();
        } catch (NullPointerException | SQLException ex) {
            System.out.println("Er ging iets mis bij het toevoegen van het product.");
            ex.getMessage();
        }
        
        * 
        * 
        */
        
        
        
        /**
        int adtype = 1;
        String land  = "NL"; 
        String huisnr = "1A" ;
        String postc ="8374 GD";
        
        
         
        try {
            Connection test = connectie.getSQLConnection();        
            PreparedStatement stmt = test.prepareStatement(
                "INSERT into adressen (adressen_type, huisnummer, postcode, land ) "+
                "VALUES (?, ?, ?, ?)");
            stmt.setInt(1, adtype);
            stmt.setString(2, huisnr);
            stmt.setString (3, postc);
            stmt.setString(4, land);
            stmt.executeUpdate();
            stmt.close();
        } catch (NullPointerException | SQLException exa) {
            System.out.println("Er ging iets mis bij het toevoegen van het product.");
            exa.getMessage();
        }
        
        
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    //KlantDAO.create(testklant);
    
    
    KlantDAO.klantlijst();
    KlantDAO.update(testklant);
    (KlantDAO.findBijVoornaam("Dennis")).getAll();
    //KlantDAO.findBijVoornaam("Dennis");
    
       
    
    
    
         
         
         /**
         
        String voornaam = "Ilse";
        String tussenvoegsel = "de";
        String achternaam = "Lange";
        int FKAI = 1;
       // int Medewerker_idMedewerker = 0;
       // int idKlant = 3;
        
         
         
        try {
            Connection test = connectie.getSQLConnection();        
            PreparedStatement stmt = test.prepareStatement(
                "INSERT INTO klanten (voornaam, tussenvoegsel, achternaam, FK_accounts_id) "+
                "VALUES (?, ?, ?, ?)");
            stmt.setString(1, voornaam);
            stmt.setString(2, tussenvoegsel);
            stmt.setString(3, achternaam);
            //stmt.setInt(4, Medewerker_idMedewerker);
            stmt.setInt(4, FKAI);
            
            stmt.executeUpdate();
            stmt.close();
        } catch (NullPointerException | SQLException ex) {
            System.out.println("Er ging iets mis bij het toevoegen van het klant.");
         System.out.println(ex.getMessage());
        } 
       
         
        
        */
         
        
        /**
        String omschrijving = "testproduct";
        String soort = "testproduct5";
        
        int voorraad = 788;
         
         
         
         
        try {
            Connection test = connectie.getSQLConnection();        
            PreparedStatement stmt = test.prepareStatement(
                "INSERT into producten (omschrijving, soort, voorraad) "+
                "VALUES (?, ?, ?)");
            stmt.setString(1, omschrijving);
            stmt.setString(2, soort);
            
            stmt.setInt(3, voorraad);
            stmt.executeUpdate();
            stmt.close();
        } catch (NullPointerException | SQLException ex) {
            System.out.println("Er ging iets mis bij het toevoegen van het product.");
            ex.getMessage();
        }
         
         
         
         
         
         
         
       **/  
         
       
    }



}  




