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
class Menu implements MenuCommander { // eerste opzet Command Pattern
    private String actie;
    private SubMenu<String> submenu; // receiver
    
    Menu(String actie, SubMenu<String> submenu) {
        this.actie = actie;
        this.submenu = submenu;
    }
    
    @Override
    public void eecute() {
        this.submenu.accept(actie);
    }
}

/*
Voor makkelijkere referentie

Hoofdmenu -


0: Inloggen als medewerker
	0.1: Aanpassen klantgegevens
		0.1.1: Doorzoek klantgegevens
			- Geef zoektermen
		0.1.2: Voeg nieuwe klant toe
			- Geef gegevens
		0.1.3: Verwijder klantgegevens
			- Specificeer welke gegevens van welke klant
		0.1.4: Pas klantgegevens aan		
			- Specificeer welke gegevens van welke klant
	0.2: Aanpassen bestelling
		0.2.1: Doorzoek bestellingen
			- Geef zoektermen
		0.2.2: Voeg nieuwe besteling toe
			- Geef gegevens
		0.2.3: Verwijder bestelling
			- Specificeer welke bestelling
		0.2.4: Pas bestelling aan
			- Specificeer welke gegevens van welke bestelling
	0.3: Aanpassen producten
		0.3.1: Doorzoek producten
			- Geef zoektermen
		0.3.2: Voeg nieuw product toe
			- Geef gegevens
		0.3.3: Verwijder product
			- Specificeer welk product
		0.3.4: Pas product aan
			- Specificeer welke gegevens van welke product
*/