package Buvesztruk;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Jatek {

    private static final Scanner sc = new Scanner(System.in, "latin1");
    private static final Random r = new Random();
    private int[] lapElemek;
    private Lapok elemek;

    public Jatek() {
        elemek = new Lapok();

        csere();
        gondoltLap();
        gondoltLap();
    }

    //Műveletek
    private void csere() {
        elemek.elszamolas();
        int[] lapok = elemek.getLapok();
        for (int i = 0; i < lapok.length; i++) {
            int j = r.nextInt(lapok.length);
            System.out.print(lapok[j] + " ");
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }

    }

    private void megSzamlalas(int sor) {
        int[] lapok = elemek.getLapok();
        int sorIndex = (sor - 1) * 4;
        int[] sorLapok = new int[4]; 
        System.out.println("A sorban található lapok: " + lapok[sorIndex]);

    }

    

    private void gondoltLap() {
        //Sor megadása és ellenőrzése
        System.out.print("Adja meg hogy melyik sorban van az ön lapja (1-4): ");
        boolean sorIgaz = false;
        int sor = 0;
        while (!sorIgaz) {
            if (sc.hasNextInt()) { // Ellenőrzi, hogy a bemenet szám-e
                sor = sc.nextInt();
                if (sor > 4 || sor < 1) {
                    leir("Vagy tul nagy szamot adott meg, vagy meg tul kicsit.");
                    System.out.print("Adja meg hogy melyik sorban van az ön lapja (1-4): ");
                } else {
                    sorIgaz = true;
                }
            } else {
                System.out.print("Betut adott meg, adja meg hogy melyik sorban van az ön lapja (1-4): ");
                sc.next(); // Beolvasza és eldobja a nem szám karaktertartalmú bemenetet
            }
        }

        megSzamlalas(sor);

    }

    //Getterek és Setterek
    public int[] getLapElemek() {
        return lapElemek;
    }

    public void setLapElemek(int[] lapElemek) {
        this.lapElemek = lapElemek;
    }

    public Lapok getElemek() {
        return elemek;
    }

    public void setElemek(Lapok elemek) {
        this.elemek = elemek;
    }

    //szöveg beolvasás
    private void leir(String str) {
        System.out.println(str);
    }

}
