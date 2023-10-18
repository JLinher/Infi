package at.Jali.basis;

import java.util.Random;

public class ControlStructurs4 {
    public static void main(String[] args) {
        // Erstelle zwei Zufallszahlen zwischen 0 und 100
        Random random = new Random();
        int randomNumber1 = random.nextInt(100);
        int randomNumber2 = random.nextInt(100);

        // Gib die beiden Zufallszahlen aus
        System.out.println("Zahl 1: " + randomNumber1);
        System.out.println("Zahl 2: " + randomNumber2);

        // Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
        if (randomNumber1 < randomNumber2 && randomNumber1 < 50) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }

        // Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
        if (randomNumber1 < 30 || randomNumber2 < 30) {
            System.out.println("Eine der beiden ist kleiner als 30");
        }

        // Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
        if (randomNumber1 < 50 && randomNumber2 != 50) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }
    }
}
