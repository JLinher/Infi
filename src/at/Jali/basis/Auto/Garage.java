package at.Jali.basis.Auto;


import java.util.ArrayList;

public class Garage {
    private int stellplaetze;

    private String adresse;

    private int einfahrtshoehe;

    private double  preisstunde;

    private ArrayList<Auto> autoListe;


    public Garage(int stellplaetze, String adresse, int einfahrtshoehe, double preisstunde) {
        this.stellplaetze = stellplaetze;
        this.adresse = adresse;
        this.einfahrtshoehe = einfahrtshoehe;
        this.preisstunde = preisstunde;
        this.autoListe = new ArrayList<Auto>();
    }

    public int getStellplaetze() {
        return stellplaetze;

    }

    public void setStellplaetze(int stellplaetze) {
        this.stellplaetze = stellplaetze;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getEinfahrtshoehe() {
        return einfahrtshoehe;
    }

    public void setEinfahrtshoehe(int einfahrtshoehe) {
        this.einfahrtshoehe = einfahrtshoehe;
    }

    public double getPreisstunde() {
        return preisstunde;
    }

    public void setPreisstunde(double preisstunde) {
        this.preisstunde = preisstunde;
    }

    public int getAutosinGarage(){
        return this.autoListe.size();
    }

    public int getFreiePlaetze(){
        return this.stellplaetze - getAutosinGarage();
    }

    public void addAutoGarage(Auto auto){
        //Abfrage ist Auto höher als garage hoehe
        if(auto.getFahrzeughoehe() > this.einfahrtshoehe){
            System.out.println("Hoi, hast a hohes Auto, leider nid i dera Garage!");
        } else if(this.getFreiePlaetze()>0) {
            this.autoListe.add(auto);
        } else {
            System.out.println("Upps, Garage keinen Platz mehr frei, versuche es später nocheinmal!");
        }
    }

    public int getGesamtFahrzeugeUebereinander(){
        int wert=0;

        return wert;
    }
}
