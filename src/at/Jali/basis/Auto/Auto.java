package at.Jali.basis.Auto;

public class Auto {
    private int iLeistung;
    private String sFarbe;
    private int iAnzahlRaeder;

    private int fahrzeughoehe;

    public Auto() {
        this.iLeistung=0;
        this.sFarbe="keine Angabe";
        this.iAnzahlRaeder=0;
        this.fahrzeughoehe=0;
    }

    public Auto(int iLeistung, String sFarbe, int iAnzahlRaeder, int fahrzeughoehe) {
        this.iLeistung = iLeistung;
        this.sFarbe = sFarbe;
        this.iAnzahlRaeder = iAnzahlRaeder;
        this.fahrzeughoehe = fahrzeughoehe;
    }

    public int getFahrzeughoehe() {
        return fahrzeughoehe;
    }

    public void setFahrzeughoehe(int fahrzeughoehe) {
        this.fahrzeughoehe = fahrzeughoehe;
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
        return "Auto Farbe ist" + this.getsFarbe()+"mit Leistung"+this.getiLeistung() + "Anzahl Raeder" + this.getiAnzahlRaeder() + "Autohöhe" + this.getFahrzeughoehe();
    }
}
