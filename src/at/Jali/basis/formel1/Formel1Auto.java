package at.Jali.basis.formel1;

import java.util.ArrayList;

public class Formel1Auto {
    private String team;
    private int ps;
    private String fahrer;

    public Formel1Auto(String team, int ps, String fahrer) {
        this.team = team;
        this.ps = ps;
        this.fahrer = fahrer;
    }

    public String getTeam() {
        return team;
    }

    public int getPs() {
        return ps;
    }

    public String getFahrer() {
        return fahrer;
    }

    @Override
    public String toString() {
        return "Formel 1 Auto: Team = " + team + ", PS = " + ps + ", Fahrer = " + fahrer;
    }

    // Sinnvolle Methoden:
    public void starten() {
        System.out.println("Das Formel 1 Auto von " + team + " mit Fahrer " + fahrer + " startet!");
    }

    public void tanken() {
        System.out.println("Das Formel 1 Auto von " + team + " wird betankt.");
    }

    public void reparieren() {
        System.out.println("Das Formel 1 Auto von " + team + " wird repariert.");
    }
}
