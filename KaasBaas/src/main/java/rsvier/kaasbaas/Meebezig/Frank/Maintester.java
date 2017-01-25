

package opdracht6test;

import java.sql.*;



/**
 *
 * @author Frank
 */
public class Maintester extends Klant {
    
    SQLConnection connectie = new SQLConnection();
    KlantInterface KlantDAO = new KlantDAOinterfaceImpl(connectie.getSQLConnection());
    
    
    public static void Main(String[] args){
        
        
        
        
        
    }
}
