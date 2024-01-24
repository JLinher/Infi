package at.Jali.basis.formel1;

import java.util.ArrayList;
import java.util.Random;

public class TestIt {
    public static void main(String[] args) {
        Random r = new Random();

        // Test Formel1Auto
        Formel1Auto formel1Auto = new Formel1Auto("Red Bull", 1000, "Max Verstappen");
        System.out.println(formel1Auto.toString());
        formel1Auto.starten();
        formel1Auto.tanken();
        formel1Auto.reparieren();

        // Test Boxen
        Boxen boxen = new Boxen("Box 1", 5, true);
        System.out.println(boxen.toString());
        boxen.einweisen();
        boxen.werkzeugAuffuellen();
        boxen.schliessen();

    }
}