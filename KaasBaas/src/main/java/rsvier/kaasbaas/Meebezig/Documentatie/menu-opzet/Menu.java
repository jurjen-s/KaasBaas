/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsvier.meebezig_oud.menu;

/**
 *
 * @author jurjen
 */
public class Menu {
    // Laat menu zien (bij begin of terug naar hoofdscherm > hoofdmenu. Anders > submenu)
    // Verwerk user input
    // Voer actie uit (nieuw menu laten zien of verbinding met DB maken)
    
    public Menu() {
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
    }
    
    public void sub() {
        
    }
}
