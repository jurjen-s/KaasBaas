/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsvier.kaasbaas.Meebezig.Jurjen;

import java.math.BigDecimal;

/**
 *
 * @author jurjen
 */
public class Product {
    
    // laat menu zien
    // vang user input
    // geef request aan DAOProducten
    // ontvang info van DAOProducten
    // laat resultaten zien in Producten   
    
    
    private int product_id;
    private String omschrijving;
    private String soort;
    private BigDecimal prijs;
    private int voorraad;
    
    @Override
    public String toString() {
        String product =  product_id + "\t\t"
                        + omschrijving + "\t\t"
                        + soort + "\t\t"
                        + prijs + "\t\t"
                        + voorraad + ".";
        return product;
    }
    
    public static class ProductBuilder {
        private int product_id;
        private String omschrijving;
        private String soort;
        private BigDecimal prijs;
        private int voorraad;
        
        public ProductBuilder(int product_id) {
            this.product_id = product_id;
        }
        public ProductBuilder omschrijving(String omschrijving) {
            this.omschrijving = omschrijving;
            return this;
        }
        public ProductBuilder soort(String soort) {
            this.soort = soort;
            return this;
        }
        public ProductBuilder prijs(BigDecimal prijs) {
            this.prijs = prijs;
            return this;
        }
        public ProductBuilder voorraad(int voorraad) {
            this.voorraad = voorraad;
            return this;
        }
        public Product build() {
            return new Product(this);
        }
    }

        private Product(ProductBuilder builder) {
            product_id = builder.product_id;
            omschrijving = builder.omschrijving;
            soort = builder.soort;            
            prijs = builder.prijs;
            voorraad = builder.voorraad;
        } 
}
