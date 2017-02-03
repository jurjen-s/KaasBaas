/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package opdracht6test;
import java.util.Scanner;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author Frank
 */
public class menu  {
   
    
   
    
    
    
    

    
    public static void hoofdmenu(){

     Scanner input = new Scanner(System.in);   
   
int cijfer = 100;     
System.out.println("Welkom in het hoofdmenu van Kaas Manager 2017");
System.out.println("Wat wilt u doen?");
System.out.println(" 1: Product gegevens aanpassen"+"\n"+  " 2: Klant gegevens aanpassen"+ "\n"+ " 3: Adres gegevens aanpassen"+"\n"+ " 4: Bestellingmaken"+ "\n"+ " 5: Medewerkers gegevens " +"\n"+ " 6: Account gegevens" +"\n"+ " 7: Factuur gegevens" +"\n"+ " 0: Programma sluiten");

System.out.println("Vul het cijfer in wat u wilt doen");
System.out.println("en druk dan op enter.");



cijfer = input.nextInt();
if (cijfer == 0){ System.out.println("Einde");}
else if (cijfer <= 7 && cijfer >0){
    switch (cijfer){
        case 1: System.out.println(" 1 Producten menu, het bestaat");  productmenu(); break;
        case 2: System.out.println(" 2 Klanten menu bestaat "); klantenmenu();   break;
        case 3: System.out.println(" 3 Adres gegevens menu bestaat ");  adressenmenu(); break;
        case 4: System.out.println(" 4 Bestelling menu bestaat ");  bestellingenmenu(); break;
        case 5: System.out.println(" 5 Medewerkers maken menu bestaat nog niet");  hoofdmenu(); break;
        case 6: System.out.println(" 6 Accounts gegevens menu bestaat nog niet");    hoofdmenu(); break;
        case 7: System.out.println(" 7 Factuur gegevens menu bestaat nog niet");   hoofdmenu(); break;
     
    }
}

else{ System.out.println("foute cijfer waarde probeer opnieuw"); hoofdmenu(); }

    

}

    
    

public static void  klantenmenu(){
   
  
System.out.println("Welkom in het klantenmenu ");
System.out.println("Wat wilt u doen?");

System.out.println(" 1: klant gegevens zoeken");
System.out.println(" 2: klant gegevens maken");     
System.out.println(" 3: klant gegevens zoeken bij voornaam");  
System.out.println(" 4: klant gegevens zoeken met volledige naam");
System.out.println(" 5: klant gegevens aanpassen");
System.out.println(" 6: klant gegevens zien");
System.out.println(" 7: klant verwijderen");
System.out.println(" 0: terug naar hoofdmenu");
        
       
System.out.println("Vul het cijfer in wat u wilt doen");
System.out.println("en druk dan op enter.");
    
        
    Scanner inputklant = new Scanner(System.in); 
    
    int waarde = inputklant.nextInt();
if (waarde == 0){ hoofdmenu();}
else if(waarde <= 7 && waarde >0){
    
            switch (waarde){
                
                case 1: System.out.println(" 1 Klant gegevens zoeken"); klantenmenu(); break;
                case 2: System.out.println(" 2 Klant gegevens aanpassen"); klantenmenu();    break;
                case 3: System.out.println(" 3 klant maken");  klantenmenu(); break;
                case 4: System.out.println(" 4 klant zoeken bij voornaam ");  klantenmenu(); break;
                case 5: System.out.println(" 5 klant zoeken bij volledige naam");  klantenmenu(); break;
                case 6: System.out.println(" 6 Laat klant zien");  klantenmenu(); break;
                case 7: System.out.println(" 7 klant verwijderen");  klantenmenu(); break;
               
      
                             }
                        }
   
                     
else{ System.out.println("verkeerde waarde");
klantenmenu();

    }


}
public static void klantenmenuKGZ(){
    
    System.out.println("U gaat een klant zoeken.");
    System.out.println("Vul ID in en druk op enter.");
    
    int productId = TextIO.getInt();
//Controller.findProductById(productId);

System.out.println("de controller klasse is nog niet af.");
    menu.productmenu();
}

public static void  productmenu(){
   
  
System.out.println("Welkom in het productmenu ");
System.out.println("Wat wilt u doen?");

         System.out.println("=========================");
         System.out.println("Doorzoek producten");
         System.out.println("-------------------------");
         System.out.println("1: Doorzoek op PRODUCT ID");
         System.out.println("2: Doorzoek op SOORT."); 
         System.out.println("3: Doorzoek op PRIJS.");
         System.out.println("4: Doorzoek op VOORRAAD.");
         System.out.println("5: Toevoegen PRODUCT.");
         System.out.println("6: Verander PRODUCT omschrijving met behulp van product id.");
         System.out.println("7: Verander SOORT product met behulp van product id.");
         System.out.println("8: Verander PRIJS product met behulp van product id.");
         System.out.println("9: Verander VOORRAAD product met behulp van product id.");
         System.out.println("10: VERWIJDER product met behulp van product id.");
         System.out.println("0: Terug naar hoofdmenu.");
         System.out.println("=========================");
         System.out.println("Geef uw keuze : ");
System.out.println("Vul het cijfer in wat u wilt doen");
System.out.println("en druk dan op enter.");
    
        
    Scanner inputklant = new Scanner(System.in); 
    
    int w = inputklant.nextInt();
if (w == 0){ hoofdmenu();}
else if(w <= 10 && w >0 ){
    
            switch (w){
                case 1: System.out.println(" 1 Doorzoek op productID"); productmenuDoPi(); break;
                case 2: System.out.println(" 2 Doorzoek op SOORT"); productmenuDoS(); break;
                case 3: System.out.println(" 3 Doorzoek op PRIJS"); productmenuDoP();    break;
                case 4: System.out.println(" 4 Doorzoek op VOORRAAD");  productmenuDoV(); break;
                case 5: System.out.println(" 5 Toevoegen Product ");  productmenuTP(); break;
                case 6: System.out.println(" 6 Verander Product Omschrijving met behulp van product id"); productmenuVPO(); break;
                case 7: System.out.println(" 7 Verander Soort product met behulp van product id"); productmenuVPS(); break;
                case 8: System.out.println(" 8 Verander Prijs product met behulp van product id"); productmenuVPP() ;break;
                case 9: System.out.println(" 9 Verander Voorraad product met behulp van product id");productmenu() ; break;
                case 10: System.out.println(" 10 Verwijder product met behulp van product id"); productmenu() ; break;
                             }
                        }
   
                     
else{ System.out.println("verkeerde cijfer waarde");
klantenmenu();

    }

}


public static void productmenuDoPi(){
    
    System.out.println("U gaat een product zoeken op ID.");
    System.out.println("Vul ID in en druk op enter.");
    
    int productId = TextIO.getInt();
//Controller.findProductById(productId);

System.out.println("de controller klasse is nog niet af.");
    menu.productmenu();
}
public static void productmenuDoS(){
    
    System.out.println("U gaat een product zoeken op Soort.");
    System.out.println("Vul Soort als tekst in en druk op enter.");
    
    String Soort = TextIO.getln();
//Controller.findProductBySoort(Soort);

System.out.println("de controller klasse is nog niet af.");
    menu.productmenu();
}
public static void productmenuDoP(){
    
    System.out.println("U gaat een product zoeken op Prijs.");
    System.out.println("Vul prijs in en druk op enter.");
    
    BigDecimal pPrijs = new BigDecimal(TextIO.getln());
//Controller.findProductByPrijs(pPrijs);

System.out.println("de controller klasse is nog niet af.");
    menu.productmenu();
}
public static void productmenuDoV(){
    
    System.out.println("U gaat een product zoeken op Voorraad.");
    System.out.println("Vul het voorraad in en druk op enter.");
    
    int pVoorraad = TextIO.getInt();
//Controller.findProductByVoorraad(pVoorraad);

System.out.println("de controller klasse is nog niet af.");
    menu.productmenu();
}
public static void productmenuTP(){
    
    System.out.println("U gaat een product TOEVOEGEN.");
    
    System.out.println("Vul de omschrijving in en druk op enter.");
      String Tomschrijving = TextIO.getln();
    System.out.println("Vul het soort in en druk op enter");
      String Tsoort = TextIO.getln();
    System.out.println("Vult de prijs van dit product in en druk op enter");
      BigDecimal Tprijs = new BigDecimal(TextIO.getln());
    System.out.println("Vul het aantal in de voorraad en druk op enter");
      int Tvoorraad = TextIO.getInt();
   
   //maak product 
   
  Product nProduct = new Product.ProductBuilder().soort(Tsoort).omschrijving(Tomschrijving).prijs(Tprijs).voorraad(Tvoorraad).build();
  
  
   
//Controller.toevoegenProduct(Product nProduct);
System.out.println(nProduct.toString());
System.out.println("de controller klasse is nog niet af.");

menu.productmenu();
    
}
public static void productmenuVPO(){
    
    System.out.println("U gaat een product omschrijving veranderen.");
    System.out.println("Vul het product id en dan enter.");
    System.out.println("Vul hierna de omschrijving in en druk enter.");
    
    
    int pID = TextIO.getInt();
    String pOmschrijving = TextIO.getln();
    
    
    
//Controller.updateProductOmschrijving(pID,pOmschrijving);

System.out.println("de controller klasse is nog niet af.");
    menu.productmenu();
}
public static void productmenuVPS(){
    
    System.out.println("U gaat een product soort veranderen.");
    System.out.println("Vul het product id en dan enter.");
    System.out.println("Vul hierna het soort in en druk enter.");
    
    
    int pID = TextIO.getInt();
    String pSoort = TextIO.getln();
    
    
    
//Controller.updateProductSoort(pID,pSoort);

System.out.println("de controller klasse is nog niet af.");
    menu.productmenu();
}
public static void productmenuVPP(){
    
    System.out.println("U gaat een product prijs veranderen.");
    System.out.println("Vul het product id en dan enter.");
    System.out.println("Vul hierna de nieuwe prijs in en druk enter.");
    
    
    int pID = TextIO.getInt();
    BigDecimal pPrijs = new BigDecimal(TextIO.getln());
    
    
    
//Controller.updateProductPrijs(pID,pPrijs);

System.out.println("de controller klasse is nog niet af.");
    menu.productmenu();
}
public static void productmenuVPV(){
    
    System.out.println("U gaat een product voorraad veranderen.");
    System.out.println("Vul het product id en dan enter.");
    System.out.println("Vul hierna de nieuwe voorraad in en druk enter.");
    
    
    int pID = TextIO.getInt();
    int pVoorraad = TextIO.getInt();
    
    
    
//Controller.updateProductVoorraad(pID,pVoorraad);

System.out.println("de controller klasse is nog niet af.");
    menu.productmenu();
}
public static void productmenuDELETE(){
    
    System.out.println("U gaat een product verwijderen.");
    System.out.println("Vul het product id en dan enter.");
   
    
    
    int pID = TextIO.getInt();
    
    
    
    
//Controller.verwijderenProduct(pID);

System.out.println("de controller klasse is nog niet af.");
    menu.productmenu();
}





public static void  adressenmenu(){
   
  
System.out.println("Welkom in het adressenmenu ");
System.out.println("Wat wilt u doen?");

         System.out.println("=========================");
         System.out.println("Doorzoek adressen");
         System.out.println("-------------------------");
         System.out.println("1: Doorzoek op adressID."); 
         System.out.println("2: Doorzoek op postcode.");
         System.out.println("3: Doorzoek op straatnaam.");
         System.out.println("4: Doorzoek op klantIDadress.");
         System.out.println("5: Doorzoek op land");
         System.out.println("6: Adres toevoegen");
         System.out.println("7: verander type");
         System.out.println("8: verander straat");
         System.out.println("9: verander huisnummer");
         System.out.println("10: verander huisnummertoevoeging");
         System.out.println("11: verander postcode");
         System.out.println("12: verander land");
         System.out.println("13: Adres verwijderen");
         System.out.println("0: Terug naar hoofdmenu.");
         System.out.println("=========================");
         System.out.println("Geef uw keuze : ");
System.out.println("Vul het cijfer in wat u wilt doen");
System.out.println("en druk dan op enter.");
    
        
    Scanner inputadress = new Scanner(System.in); 
    
    int c = inputadress.nextInt();
if (c == 0){ hoofdmenu();}
else if(c <= 13 && c >0 ){
    
            switch (c){
                
               
                case 1:    System.out.println("1: Doorzoek op adressID."); adressenmenuDoAid(); break;
                case 2: System.out.println("2: Doorzoek op postcode.");adressenmenuDoPc(); break;
                case 3:  System.out.println("3: Doorzoek op straatnaam.");adressenmenuDoS(); break;
                case 4: System.out.println("4: Doorzoek op klantIDadress.");adressenmenuDoK(); break;
                case 5: System.out.println("5: Doorzoek op land");adressenmenuDoL(); break;
                case 6: System.out.println("6: Adres toevoegen");adressenmenuTA(); break;
                case 7 :System.out.println("7: verander type");adressenmenuVT(); break;
                case 8: System.out.println("8: verander straat");adressenmenuVS(); break;
                case 9:  System.out.println("9: verander huisnummer");adressenmenuVHnr(); break;
                case 10: System.out.println("10: verander huisnummertoevoeging");adressenmenuVHnrT(); break;
                case 11: System.out.println("11: verander postcode");adressenmenuVPC(); break;
                case 12: System.out.println("12: verander land");adressenmenuVL(); break;
                case 13:System.out.println("13: Adres verwijderen");adressenmenu(); break;
                             }
                        }
   
                     
else{ System.out.println("verkeerde cijfer waarde");
adressenmenu();

    }
}


public static void adressenmenuDoAid(){
    
    System.out.println("U gaat een adres zoeken op ID.");
    System.out.println("Vul ID in en druk op enter.");
    
    int adresId = TextIO.getInt();
//Controller.findAdresById(adresId);

System.out.println("de controller klasse is nog niet af.");
    menu.adressenmenu();
}
public static void adressenmenuDoPc(){
    
    System.out.println("U gaat een adres zoeken op postcode.");
    System.out.println("Vul het postcode ###### (1111AA) in en druk op enter.");
    
    String adresPC = TextIO.getln();
//Controller.findAdresByPostcode(adresPC);

System.out.println("de controller klasse is nog niet af.");
    menu.adressenmenu();
}
public static void adressenmenuDoS(){
    
    System.out.println("U gaat een adres zoeken op straatnaam.");
    System.out.println("Vul de straatnaam in en druk op enter.");
    
    String adresStraat = TextIO.getln();
//Controller.findAdresByStraat(adresStraat);

System.out.println("de controller klasse is nog niet af.");
    menu.adressenmenu();
}
public static void adressenmenuDoK(){
    
    System.out.println("U gaat een adres zoeken op klantid.");
    System.out.println("Vul de adress klant id in en druk op enter.");
    
    int AKid = TextIO.getInt();
//Controller.findAdresByAdresKlantid(Akid);

System.out.println("de controller klasse is nog niet af.");
    menu.adressenmenu();
}
public static void adressenmenuDoL(){
    
    System.out.println("U gaat een adres zoeken op Land.");
    System.out.println("Vul het Land in en druk op enter.");
    
    String land = TextIO.getln();
//Controller.findAdresByLand(land);

System.out.println("de controller klasse is nog niet af.");
    menu.adressenmenu();
}
public static void adressenmenuTA(){
    
    System.out.println("U gaat een adres toevoegen.");
    System.out.println("Vul het adres type toe");
    
     int AT = TextIO.getInt();
    
    System.out.println("Vul het AdressklantenID toe");
    
     int AKid = TextIO.getInt();
    
     System.out.println("Vul het straatnaam toe");
    
     String Astraat = TextIO.getln();
     
      System.out.println("Vul het huisnummer toe");
    
     String AHuisnr = TextIO.getln();
     
     System.out.println("Heeft het een huisnummertoevoeging? 1 = ja, 0 = nee");
    
     int AstraatHT = TextIO.getInt();
     
     
      System.out.println("Vul het huisnummer toevoeging toe, niks is enter");
    
     String AstraatT = TextIO.getln();
     
     System.out.println("Vul de postcode in en druk op enter.");
    
    String PC = TextIO.getln();
     
     
    System.out.println("Vul het Land in en druk op enter.");
    
    String land = TextIO.getln();
    
    
    
//Controller..

System.out.println("de controller klasse is nog niet af.");
    menu.adressenmenu();
}

public static void adressenmenuVT(){
    
    System.out.println("U gaat een adres typen veranderen.");
    System.out.println("Vul het adres id in en druk op enter.");
    
    int Aid = TextIO.getInt();
    
    System.out.println("vul de nieuwe type (0 of 1) in en druk op enter");
    
    int AT = TextIO.getInt();
    
//Controller.UpdateAdresByType(Aid,AT);

System.out.println("de controller klasse is nog niet af.");
    menu.adressenmenu();
}
public static void adressenmenuVS(){
    
    System.out.println("U gaat een adres straatnaam veranderen.");
    System.out.println("Vul het adres id in en druk op enter.");
    
    int Aid = TextIO.getInt();
    
    System.out.println("vul de nieuwe straatnaam (string) in en druk op enter");
    
    String AS = TextIO.getln();
    
//Controller.UpdateAdresByStraat(Aid,AS);

System.out.println("de controller klasse is nog niet af.");
    menu.adressenmenu();
}

public static void adressenmenuVHnr(){
    
    System.out.println("U gaat een adres huisnummer veranderen.");
    System.out.println("Vul het adres id in en druk op enter.");
    
    int Aid = TextIO.getInt();
    
    System.out.println("vul de nieuwe straatnaam (string) in en druk op enter");
    
    int AHnr = TextIO.getInt();
    
//Controller.UpdateAdresByStraat(Aid,AS);

System.out.println("de controller klasse is nog niet af.");
    menu.adressenmenu();
}
public static void adressenmenuVHnrT(){
    
    System.out.println("U gaat een adres straatnaam veranderen.");
    System.out.println("Vul het adres id in en druk op enter.");
    
    int Aid = TextIO.getInt();
    
    System.out.println("vul de nieuwe straatnaam (string) in en druk op enter");
    
    String AHnrT = TextIO.getln();
   // int AHnrT = TextIO.getInt();
    
    
//Controller.UpdateAdresByStraat(Aid,AHnrT);

System.out.println("de controller klasse is nog niet af.");
    menu.adressenmenu();
}
public static void adressenmenuVPC(){
    
    System.out.println("U gaat een adres postcode veranderen.");
    System.out.println("Vul het adres id in en druk op enter.");
    
    int Aid = TextIO.getInt();
    
    System.out.println("vul de nieuwe postcode (string) in en druk op enter");
    
    //String PC = TextIO.getln();
    //int AHnrT = TextIO.getInt();
    
    
//Controller.UpdateAdresByStraat(Aid,PC);

System.out.println("de controller klasse is nog niet af.");
    menu.adressenmenu();
}
public static void adressenmenuVL(){
    
    System.out.println("U gaat een adres Land veranderen.");
    System.out.println("Vul het adres id in en druk op enter.");
    
    int Aid = TextIO.getInt();
    
    System.out.println("vul de nieuwe Land (string) in en druk op enter");
    
    String Land = TextIO.getln();
    //int AHnrT = TextIO.getInt();
    
    
//Controller.UpdateAdresByStraat(Aid,Land);

System.out.println("de controller klasse is nog niet af.");
    menu.adressenmenu();
}
public static void adressenmenuDELETE(){
    
    System.out.println("U gaat een adres verwijderen.");
    System.out.println("Vul het adres id in en druk op enter.");
    
    int Aid = TextIO.getInt();
    
    //System.out.println("vul de nieuwe Land (string) in en druk op enter");
    
    //String Land = TextIO.getln();
    //int AHnrT = TextIO.getInt();
    
    
//Controller.DELETEAdres(Aid);

System.out.println("de controller klasse is nog niet af.");
    menu.adressenmenu();
}






public static void bestellingenmenu(){

System.out.println("Welkom in het bestellingenmenu ");
System.out.println("Wat wilt u doen?");

         System.out.println("=========================");
         System.out.println("Doorzoek producten");
         System.out.println("-------------------------");
         System.out.println("1: Doorzoek bestelling met id.");
         System.out.println("2: Doorzoek bestelling met klant id.");
         System.out.println("3: Doorzoek bestelling met adress ."); 
         System.out.println("4: Doorzoek bestelling met aantal artikelen.");
         System.out.println("5: Doorzoek bestelling met totaal prijs.");
         System.out.println("6: Toevoegen bestelling.");
         System.out.println("7: Verander bestelling klant id.");
         System.out.println("8: Verander bestelling adress id.");
         System.out.println("9: Verander bestelling aantal artikelen");
         System.out.println("10: Verander bestelling totaal prijs.");
         System.out.println("11: VERWIJDER bestelling met id.");
         System.out.println("0: Terug naar hoofdmenu.");
         System.out.println("=========================");
         System.out.println("Geef uw keuze : ");
System.out.println("Vul het cijfer in wat u wilt doen");
System.out.println("en druk dan op enter.");
    
        
    Scanner inputklant = new Scanner(System.in); 
    
    int wa = inputklant.nextInt();
if (wa == 0){ hoofdmenu();}
else if(wa <= 11 && wa >0 ){
    
            switch (wa){
                case 1: System.out.println(" 1 Doorzoek op bestellingID"); bestellingenmenuDbi(); break;
                case 2: System.out.println(" 2 Doorzoek op klantID"); bestellingenmenuDbk(); break;
                case 3: System.out.println(" 3 Doorzoek op adress"); bestellingenmenuDbA(); break;
                case 4: System.out.println(" 4 Doorzoek op aantal artikelen"); bestellingenmenuDbAA();    break;
                case 5: System.out.println(" 5 Doorzoek op totaalprijs");  bestellingenmenuDoTP(); break;
                case 6: System.out.println(" 6 Toevoegen bestelling ");  bestellingenmenuTB(); break;
                case 7: System.out.println(" 7 Verander  bestelling klant id"); bestellingenmenuVki(); break;
                case 8: System.out.println(" 8 Verander bestelling adress id"); bestellingenmenuVAi(); break;
                case 9: System.out.println(" 9 Verander bestelling aantal artikelen"); bestellingenmenuVAA(); break;
                case 10: System.out.println(" 10 Verander bestelling totaal prijs");bestellingenmenuVTP(); break;
                case 11: System.out.println(" 11 Verwijder bestelling dmv id"); bestellingenmenuDELETE(); break;
                             }
                        }
   
                     
else{ System.out.println("verkeerde cijfer waarde");
klantenmenu();

    }
}

public static void bestellingenmenuDbi(){
    
     System.out.println("U gaat een bestelling zoeken op bestelling ID.");
    System.out.println("Vul ID in en druk op enter.");
    
    int bestellingId = TextIO.getInt();
//Controller.findBestellingById(bestellingId);

System.out.println("de controller klasse is nog niet af.");
    menu.bestellingenmenu();
    
    
    
}
public static void bestellingenmenuDbk(){
     System.out.println("U gaat een bestelling zoeken mbv klant ID.");
    System.out.println("Vul ID in en druk op enter.");
    
    int klantId = TextIO.getInt();
//Controller.findBestellingByKlant(klantId);

System.out.println("de controller klasse is nog niet af.");
    menu.bestellingenmenu();
    

}
public static void bestellingenmenuDbA(){
    
     System.out.println("U gaat een bestelling zoeken op Adress id.");
    System.out.println("Vul ID in en druk op enter.");
    
    int adressId = TextIO.getInt();
//Controller.findBestellingByAdress(adressId);

System.out.println("de controller klasse is nog niet af.");
    menu.bestellingenmenu();
    
    
}
public static void bestellingenmenuDbAA(){
    
     System.out.println("U gaat een bestelling zoeken op Aantal Artikelen.");
    System.out.println("Vul het aantal in en druk op enter.");
    
    int aantal = TextIO.getInt();
//Controller.findBestellingByAantalArtikelen(aantal);

System.out.println("de controller klasse is nog niet af.");
    menu.bestellingenmenu();
    
    
}
public static void bestellingenmenuDoTP(){
    
     System.out.println("U gaat een bestelling zoeken op Totaal prijs.");
    System.out.println("Vul het totaal in en druk op enter.");
    
     BigDecimal pPrijs = new BigDecimal(TextIO.getln());
//Controller.findBestellingTotaalprijs(pPrijs);

System.out.println("de controller klasse is nog niet af.");
    menu.bestellingenmenu();
    
    
}

public static void bestellingenmenuTB(){
    
     System.out.println("U gaat een bestelling toevoegen.");
   System.out.println("Vul de klant id  in en druk op enter.");
      int klantid = TextIO.getInt();
    System.out.println("Vul het adres id en druk op enter");
      int adresid = TextIO.getInt();
    System.out.println("Vult aantal artikelen in en druk op enter");
     int AA = TextIO.getInt();
    System.out.println("Vul het aantal in de voorraad en druk op enter");
       BigDecimal Totprijs = new BigDecimal(TextIO.getln());
   
   //maak product 
   
 // Bestelling nbestelling = new Bestelling.BestellingBuilder().klantid(klantid).adresid(adresid).Aantalartikelen(AA).Totprijs(Totprijs).build();
  
  
   
//Controller.toevoegenBestelling(Bestelling nbestelling);


//System.out.println(nbestelling.toString());
System.out.println("de controller klasse is nog niet af.");


    menu.bestellingenmenu();
    
    
}

public static void bestellingenmenuVki(){
    
     
    System.out.println("U gaat een bestelling klant id veranderen.");
    
    
     System.out.println("Vul bestellingid in druk enter.");
    
     int Bid = TextIO.getInt();
    
    
    
    
    System.out.println("Vul het klant id en dan enter.");
   // System.out.println("Vul hierna de omschrijving in en druk enter.");
    
    
    int KiD = TextIO.getInt();
   // String pOmschrijving = TextIO.getln();
    
    
    
//Controller.updateBestellingKlantID(Bid,Kid);

System.out.println("de controller klasse is nog niet af.");
    menu.bestellingenmenu();
    
    
    
}
public static void bestellingenmenuVAi(){
    
     
    System.out.println("U gaat een bestelling Adres id veranderen.");
    
     System.out.println("Vul bestellingid in druk enter.");
    
     int Bid = TextIO.getInt();
    
    
    System.out.println("Vul het Adres id en dan enter.");
   // System.out.println("Vul hierna de omschrijving in en druk enter.");
    
    
    int AiD = TextIO.getInt();
   // String pOmschrijving = TextIO.getln();
    
    
    
//Controller.updateBestellingAdresID(Bid,AiD);

System.out.println("de controller klasse is nog niet af.");
    menu.bestellingenmenu();
    
    
    
}
public static void bestellingenmenuVAA(){
    
     
    System.out.println("U gaat het aantal artikelen in een bestelling veranderen.");
    
    
    System.out.println("Vul bestellingid in druk enter.");
    
     int Bid = TextIO.getInt();
    System.out.println("Vul het aantalartikelen in  en dan enter.");
    
    
  
    
    
    int AA = TextIO.getInt();
   // String pOmschrijving = TextIO.getln();
    
    
    
//Controller.updateBestellingAantalartikelen(Bid,AiD);

System.out.println("de controller klasse is nog niet af.");
    menu.bestellingenmenu();
    
    
    
}
public static void bestellingenmenuVTP(){
    
     
    System.out.println("U gaat het totaal prijs in een bestelling veranderen.");
    
    
    System.out.println("Vul bestellingid in druk enter.");
    
     int Bid = TextIO.getInt();
    System.out.println("Vul het totaal prijs in  en dan enter.");
    
    
  
    
    
    int TP = TextIO.getInt();
   // String pOmschrijving = TextIO.getln();
    
    
    
//Controller.updateBestellingTotaalprijs(Bid,TP);

System.out.println("de controller klasse is nog niet af.");
    menu.bestellingenmenu();
    
    
    
}
public static void bestellingenmenuDELETE(){
    
     
    System.out.println("U gaat een bestelling verwijderen");
    
    
    System.out.println("Vul bestellingid in druk enter.");
    
     int Bid = TextIO.getInt();
    //System.out.println("Vul het totaal prijs in  en dan enter.");
    
    
  
    
    
    //int TP = TextIO.getInt();
   // String pOmschrijving = TextIO.getln();
    
    
    
//Controller.DELETEBestellingTotaalprijs(Bid);

System.out.println("de controller klasse is nog niet af.");
    menu.bestellingenmenu();
    
    
    
}

/**  info om bestellingmenu te maken:
1: Om bestellingen te zoeken:
    Bestelling findBestellingById(int bestellingId); // returns Bestelling object als zoekresultaat
    List findBestellingByKlant(int klantId); // returns List<Bestelling> met zoekresultaten
    List findBestellingByAdres(Adres opgegevenAdres); // returns List<Bestelling> met zoekresultaten
    List findBestellingByAantalArtikelen(int aantal); // returns List<Bestelling> met zoekresultaten
    List findBestellingByTotaalprijs(BigDecimal prijs); // returns List<Bestelling> met zoekresultaten
    // 2: Om bestellingen toe te voegen:
    boolean toevoegenBestelling(Bestelling opgegevenBestelling); //returns succes of mislukt
    // 3: Om bestellingen aan te passen:
    boolean updateBestellingKlantId(int bestellingId, int klantId); // returns succes of mislukt (+ laat vernieuwde bestelling zien?)
    boolean updateBestellingAdresId(int bestellingId, int adresId); // returns succes of mislukt
    boolean updateBestellingAantalArtikelen(int bestellingId, int aantalArtikelen); // returns succes of mislukt
    boolean updateBestellingTotaalprijs(int bestellingId, BigDecimal totaalprijs); // returns succes of mislukt
    // 4: Om bestellingen te verwijderen:
    boolean verwijderenBestelling(int bestellingId); // returns succes of mislukt

*/




public void printString(String string){
    
    System.out.println(string);
}
        
        
         
  public void printList(List list){
      
      System.out.println(Arrays.toString(list.toArray()));
        }

      
  }










