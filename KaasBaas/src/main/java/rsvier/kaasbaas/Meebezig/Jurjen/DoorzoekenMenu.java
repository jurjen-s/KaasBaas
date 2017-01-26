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
public class DoorzoekenMenu implements Menu {

    @Override
    public void showMenu() {
        int keuze = 0;
    	while (true) {
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
            keuze = Integer.parseInt(System.console().readLine());
            switch (keuze) {
                case 1:     
            }
        }
    }
}
