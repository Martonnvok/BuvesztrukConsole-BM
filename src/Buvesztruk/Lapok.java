package Buvesztruk;

public class Lapok {

    private int[] lapok;
    private int[] oszlopok;

    public Lapok() {
        this.oszlopok = new int[]{1, 2, 3, 4};
        this.lapok = new int[16];
        
        
    }

    //elszámól 1-től 16-ig
    public void elszamolas() {
        int szam = 1;

        for (int i = 0; i < lapok.length; i++) {
            lapok[i] = szam;
            szam++;
        }
    }

//    //Lapok megjelenítése
//    public void kiir() {
//        elszamolas();
//        for (int i = 0; i < lapok.length; i++) {
//            System.out.print(lapok[i] + " ");
//            if ((i + 1) % 4 == 0) {
//                System.out.println();
//            }
//        }
//
//    }

    //Getterek és Setterek
    public int[] getLapok() {
        return lapok;
    }

    public void setLapok(int[] lapok) {
        this.lapok = lapok;
    }

    public int[] getOszlopok() {
        return oszlopok;
    }

    private void setOszlopok(int[] oszlopok) {
        this.oszlopok = oszlopok;
    }

}
