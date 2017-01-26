/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht6test;

import java.util.*;
//Dit zit in de basis POJO
 

   


public class Klant {

    
    //PRIVATE
    
private int idKlant, telefoonnummer, Bezorghuisnummer, Factuurhuisnummer, idMedewerker;
private String Land, voornaam,tussenvoegsel, achternaam, BezorgPostcode,FactuurPostcode,BezorgHuisnummerToevoeging, FactuurHuisnummerToevoeging;



public void setALL(int idklant, String vnaam, String tv, String anaam, int tel, int BHnr, String BHnrT, String BPc, String FBPc, int FHnr, String FHnrT, String L){
this.idKlant = idklant;
this.voornaam = vnaam;
this.tussenvoegsel = tv;
this.achternaam = anaam;
this.telefoonnummer = tel;
this.Bezorghuisnummer = BHnr;
this.BezorgHuisnummerToevoeging = BHnrT;
this.BezorgPostcode = BPc;
this.FactuurPostcode = FBPc;
this.Factuurhuisnummer = FHnr;
this.FactuurHuisnummerToevoeging = FHnrT;
this.Land = L;
System.out.println(idKlant + voornaam + tussenvoegsel + achternaam + telefoonnummer + Bezorghuisnummer + BezorgHuisnummerToevoeging + BezorgPostcode + FactuurPostcode + Factuurhuisnummer +FactuurHuisnummerToevoeging + Land);
}


public void getAll (){

System.out.println(idKlant + voornaam + tussenvoegsel + achternaam + telefoonnummer + Bezorghuisnummer + BezorgHuisnummerToevoeging + BezorgPostcode + FactuurPostcode + Factuurhuisnummer +FactuurHuisnummerToevoeging + Land);

}



    public int getKlantID() {
        return idKlant;
    }

    public void setKlantID(int klantID) {
        this.idKlant = klantID;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public String getBezorgPostcode() {
        return BezorgPostcode;
    }

    public void setBezorgPostcode(String postcode) {
        this.BezorgPostcode = postcode;
    }
    
    public String getFactuurPostcode() {
        return FactuurPostcode;
    }

    public void setFactuurPostcode(String factuurcode) {
        this.FactuurPostcode = factuurcode;
    }
    
    public String getBezorgHuisnummertoevoeging() {
        return BezorgHuisnummerToevoeging;
    }

    public void setBezorgHuisnummertoevoeging(String BHtoevoeging) {
        this.BezorgHuisnummerToevoeging = BHtoevoeging;
    }
    
    public String getFactuurHuisnummertoevoeging() {
        return FactuurHuisnummerToevoeging;
    }

    public void setFactuurHuisnummertoevoeging(String FHtoevoeging) {
        this.FactuurHuisnummerToevoeging = FHtoevoeging;
    }

    public int getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(int telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }
    
    public int getBezorghuisnummer() {
        return Bezorghuisnummer;
    }

    public void setBezorghuisnummer(int bezorghuisnummer) {
        this.Bezorghuisnummer = bezorghuisnummer;
    }
    
    public int getFactuurhuisnummer() {
        return Factuurhuisnummer;
    }

    public void setFactuurhuisnummer(int factuurhuisnummer) {
        this.Factuurhuisnummer = factuurhuisnummer;
    }
  
     public String getLand() {
        return Land;
    }

    public void setLand(String land) {
        this.Land = land;
    }
    
    public int getMedewerkerID() {
        return idMedewerker;
    }

    public void setMedewerkerID(int medewerkerint) {
        this.idMedewerker = medewerkerint;
    }
    
    
    
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return "Klant{" + "klantID=" + idKlant + ", voornaam=" + voornaam + 
                ", achternaam=" + achternaam + ", tussenvoegsel=" + tussenvoegsel + ", telefoonnummer=" + telefoonnummer + '}';
    }
    
    
    
    
    //einde clas Klant
    
    
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    

