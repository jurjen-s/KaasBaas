/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsvier.meebezig_oud.menu;

import java.util.List;

/**
 *
 * @author jurjen
 */
public class HoofdMenu implements ConsoleMenu  {
    
    public void showMenu(int keuze) {
        keuze = 0;
        while (true) {
            System.out.println("===========================");
            System.out.println("Welkom bij de Applikaassie.");
            System.out.println("---------------------------");
            System.out.println("1: Doorzoek producten.");
            System.out.println("2: Voeg nieuw product toe.");
            System.out.println("3: Verwijder product.");
            System.out.println("4: Pas product aan.");
            System.out.println("5: Afsluiten.");
            System.out.println("===========================");
            System.out.println("Geef uw keuze (1-5): ");
            keuze = Integer.parseInt(System.console().readLine());  //keuze doorgeven aan bijbehorende DAO, bijv
                                                                    //door showMenu(1) = doorzoek menu en 
                                                                    //showMenu(1.1) = doorzoek op productID
            if (keuze < 1 | keuze > 5) {
                System.out.println("Ongeldige invoer, probeer opnieuw.");
            } else {
            break;
            }
        }
            // Laat volgende menu zien afhankelijk van keuze
                switch (keuze) {
                    case 1:
                        showDoorzoekenMenu();
                        break;
                    case 2:
                        showToevoegenMenu();
                        break;
                    case 3:
                        showVerwijderenMenu();
                        break;
                    case 4:
                        showAanpassenMenu();
                        break;        
                    case 5:
                        System.out.println("Tot ziens.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Ongeldige invoer.");
                        break;
                }
    }  

    @Override
    public void readUserInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMenu(List<String> menu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
