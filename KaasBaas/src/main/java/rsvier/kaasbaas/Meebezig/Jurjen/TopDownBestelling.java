/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsvier.kaasbaas.Meebezig.Jurjen;

/**
 *
 * @author jurjen
 */
public class TopDownBestelling implements BestellingDAO {

    Menu.show(bestelling); // maak gebruik van Command Pattern
    
    
    @Override
    public void zoekenBestelling() {
        Menu.show(zoekenBestelling);
        
    }

    @Override
    public void toevoegenBestelling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aanpassenBestelling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void verwijderenBestelling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
