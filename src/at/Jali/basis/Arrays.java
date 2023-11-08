package at.Jali.basis;

import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[]{17, 2, 8, 1, 0}; // Ein Beispiel-Array mit Werten

        // Ausgabe des ursprünglichen Arrays
        System.out.println("Ursprüngliches Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            int i1 = 0;

        }
        System.out.println();

        // Wert an der Position 2 auf 8 setzen
        arr[2] = 8;

        // Ausgabe des aktualisierten Arrays
        System.out.println("Aktualisiertes Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}