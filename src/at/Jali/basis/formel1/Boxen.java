package at.Jali.basis.formel1;

import java.util.ArrayList;

public class Boxen {
    private String standort;
    private int mitarbeiter;
    private boolean werkzeugVerfuegbar;

    public Boxen(String standort, int mitarbeiter, boolean werkzeugVerfuegbar) {
        this.standort = standort;
        this.mitarbeiter = mitarbeiter;
        this.werkzeugVerfuegbar = werkzeugVerfuegbar;
    }

    public String getStandort() {
        return standort;
    }

    public int getMitarbeiter() {
        return mitarbeiter;
    }

    public boolean isWerkzeugVerfuegbar() {
        return werkzeugVerfuegbar;
    }

    @Override
    public String toString() {
        return "Boxen: Standort = " + standort + ", Mitarbeiter = " + mitarbeiter +
                ", Werkzeug verfügbar = " + werkzeugVerfuegbar;
    }

    // Sinnvolle Methoden:
    public void einweisen() {
        System.out.println("Die Boxen am Standort " + standort + " weisen einen neuen Mitarbeiter ein.");
    }

    public void werkzeugAuffuellen() {
        System.out.println("Das Werkzeug in den Boxen am Standort " + standort + " wird aufgefüllt.");
    }

    public void schliessen() {
        System.out.println("Die Boxen am Standort " + standort + " werden geschlossen.");
    }
}
