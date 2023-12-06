package at.Jali.basis.Auto;

public class Auto {
    private int iLeistung;
    private String sFarbe;
    private int iAnzahlRaeder;

    public Auto() {
        this.iLeistung=0;
        this.sFarbe="keine Angabe";
        this.iAnzahlRaeder=0;
    }

    public Auto(int iLeistung, String sFarbe, int iAnzahlRaeder) {
        this.iLeistung = iLeistung;
        this.sFarbe = sFarbe;
        this.iAnzahlRaeder = iAnzahlRaeder;
    }


    public int getiAnzahlRaeder() {
        return iAnzahlRaeder;
    }

    public void setiAnzahlRaeder(int iAnzahlRaeder) {
        this.iAnzahlRaeder = iAnzahlRaeder;
    }

    public int getiLeistung() {
        return iLeistung;
    }

    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }

    public String getInfoAuto(){
        return "Auto Farbe ist" + this.getsFarbe()+"mit Leistung"+this.getiLeistung() + "Anzahl Raeder" + this.getiAnzahlRaeder();
    }
}
