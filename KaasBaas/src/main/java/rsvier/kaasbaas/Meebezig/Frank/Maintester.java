

package opdracht6test;

import java.sql.*;

import java.util.*;

import opdracht6test.KlantInterface;





/**
 *
 * @author Frank
 */
public class Maintester  {
    
    SQLConnection connectie = new SQLConnection();
    KlantInterface KlantDAO = new KlantDAOinterfaceImpl(connectie.getSQLConnection());
    
    
    public static void main(String[] args){
        
        Klant testklant = new Klant();
     
        System.out.println("Maak eerst een klant");
      

        testklant.setALL(2, "Henk", "de", "Groot", 0612312311, 1, "A", "1234 AA", "1234 BB", 2, "B", "Nederland");
        
        
   
        
  //update(testklant);
        
        
    }
}
