/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsvier.meebezig_oud.menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jurjen
 */
public class TestMenu {

    // hoofdmenu
    List<String> hoofdmenu = new ArrayList<String>(Arrays.asList(
            "===========================",
            "Welkom bij de Applikaassie.",
            "---------------------------",
            "1: Doorzoek producten.",
            "2: Voeg nieuw product toe.",
            "3: Verwijder product.",
            "4: Pas product aan.",
            "5: Afsluiten.",
            "===========================",
            "Geef uw keuze (1-5): ")
    );
    // 

    public void hoofdMenu() {
        for (String item: hoofdmenu) {
            System.out.println(item);
        }
    }
}    