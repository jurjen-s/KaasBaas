/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsvier.kaasbaas.Meebezig.Jurjen;

import java.util.List;

/**
 *
 * @author jurjen
 */
public interface ProductDAO {
    
    List<Product> zoekenProduct();
    boolean toevoegenProduct(Product product);
    boolean aanpassenProduct(Product product);
    boolean verwijderenProduct(Product product);
    
}
