package at.Jali.basis.Auto;

import java.util.ArrayList;
import java.util.Random;

public class TestIt {
    public static void main(String[] args) {
        Random r = new Random();
        Auto auto = new Auto();
        Garage garage = new Garage(30, "Lusternauerstrasse 11, 6850 Dornbirn", 180, 10.0);
        System.out.println("Garage-Adresse"+garage.getAdresse());


        System.out.println(auto.getInfoAuto());
        auto.setsFarbe("blau");
        auto.setiLeistung(340);
        auto.setiAnzahlRaeder(4);
        System.out.println(auto.getInfoAuto());

        Auto auto2 = new Auto(340, "blau", 4, 170);
        System.out.println(auto.getInfoAuto());

        ArrayList<Auto> aAutoListe = new ArrayList<>();
        String[] aFarben = {"blau", "rot", "gruen", "violett", "gelb", "pink", "türkis"};
        for (var i = 1; i <= 100; i++) {
            //max = 500 min=50
            int ps = r.nextInt(500 + 1 - 50) + 50;
            //max =4 min = 3
            int ra = r.nextInt(4 + 1 - 3) + 3;
            //Don't forget array Zugriff mit Index start bei 0!
            int fa = r.nextInt(aFarben.length - 1);
            int hoehe = r.nextInt(200+1-110)+110;


            aAutoListe.add(new Auto(ps,aFarben[fa],ra,hoehe));


        }

        for (Auto a : aAutoListe) {
            System.out.println(a.getInfoAuto());
            garage.addAutoGarage(a);
            System.out.println(garage.getStellplaetze()+"stell - frei"+ garage.getFreiePlaetze());

        }
    }
}