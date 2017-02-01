/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package opdracht6test;
import java.util.Scanner;
/**
 *
 * @author Frank
 */
public class menu extends StartProgram {
   
    
   
    
    
    
    

    
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
        case 1: System.out.println(" 1 Producten menu, het bestaat nog niet dus je komt terug"); cijfer = 0; hoofdmenu(); break;
        case 2: System.out.println(" 2 Klanten menu bestaat "); klantenmenu();   break;
        case 3: System.out.println(" 3 Adres gegevens menu bestaat nog niet dus je komt terug");   hoofdmenu(); break;
        case 4: System.out.println(" 4 Bestelling menu bestaat menu nog niet dus je komt terug ");  hoofdmenu(); break;
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
System.out.println(" 1: klant gegevens aanpassen"+"\n"+  " 2: Klant gegevens zoeken"+ "\n"+ " 3: klant maken"+"\n"+ " 4: Klant zoeken bij naam"+ "\n"+ " 5: Klant zoeken bij volledige naam " +"\n"+ " 6: Laat klant zien" +"\n"+ " 7: Klant iets" +"\n"+ " 0: Terug naar hoofdmenu");
System.out.println("Vul het cijfer in wat u wilt doen");
System.out.println("en druk dan op enter.");
    
        
    Scanner inputklant = new Scanner(System.in); 
    
    int waarde = inputklant.nextInt();
if (waarde == 0){ hoofdmenu();}
else if(waarde <= 7 && waarde >0){
    
            switch (waarde){
                
                case 1: System.out.println(" 1 klanten gegevens aanpassen"); klantenmenu(); break;
                case 2: System.out.println(" 2 Klant gegevens zoeken"); klantenmenu();    break;
                case 3: System.out.println(" 3 klant maken");  klantenmenu(); break;
                case 4: System.out.println(" 4 klant zoeken bij naam ");  klantenmenu(); break;
                case 5: System.out.println(" 5 klant zoeken bij volledige naam");  klantenmenu(); break;
                case 6: System.out.println(" 6 laat klant zien");  klantenmenu(); break;
                case 7: System.out.println(" 7 klant iets");  klantenmenu(); break;
               
      
                             }
                        }
   
                     
else{ System.out.println("verkeerde waarde");
klantenmenu();

    }

}
}

