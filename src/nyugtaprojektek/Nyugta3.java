package nyugtaprojektek;

public class Nyugta3 {
    private static void kiirasln(String szoveg) {
        System.out.println(szoveg);
    }
    private static void kiirast(String szoveg) {
        System.out.print(szoveg);
    }
    private static void kiirasf(String szoveg, String szoveg2,int elem1,String elem2) {
        System.out.printf(szoveg, szoveg2, elem1, elem2);
    }
    private static int osszeadas(int szam1, int szam2) {
        
        return szam1+szam2;
    }
    private static int osztas(int szam1, int szam2) {
        
        return szam1/szam2;
    }
    private static void csillagKiiras() {
        String csillagok = "********************";
        kiirasln(csillagok);
    }
    private static void duplaKiiras() {
        String duplaVonal = "====================";
        kiirasln(duplaVonal);
    }
    private static void rovidVonalKiiras() {
        String rovidVonal = "_______";
        kiirast(rovidVonal);
    }
    private static void szagatottVonalKiiras() {
        String szaggatottVonal = "--------------------";
        kiirasln(szaggatottVonal);
    }
    private static void sortores() {
        kiirasln("");
    }
    private static String huf() {
        final String HUF = "Ft";
        return HUF;
    }
    private static int tetel1() {
        int tetel1 = 350;
        return tetel1;
    }
    private static int tetel2() {
        int tetel2 = 90;
        return tetel2;
    }
    private static int tetel3() {
        int tetel3 = 1320;
        return tetel3;
    }
    private static void tetelek() {
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
        kiirasf("%10s: %5d %s\n", "Tétel 1", tetel1(), huf());
        kiirasf("%10s: %5d %s\n", "Tétel 2", tetel2(), huf());
        kiirasf("%10s: %5d %s\n", "Tétel 3", tetel3(), huf());  
    }
    private static int osszesen() {
        int osszesen = osszeadas(tetel1(), tetel2());
        osszesen = osszeadas(osszesen,tetel3());
        return osszesen;
    }
    private static int szervizDijMertek() {
        int szervizDijMertek = 10;
        return szervizDijMertek;
    }
    private static int szervizDij() {   
        int szervizDij = osztas(osszesen(), szervizDijMertek());
        return szervizDij;
    }
    private static int fizetendo() {   
        int fizetendo = osszeadas(osszesen(), szervizDij());
        return fizetendo;
    }
    private static double euro() {
        double euro = fizetendo() / 373.0;
        return euro; 
    }
    
    private static void nyugtaFej() {
        csillagKiiras();
        System.out.printf("%14s\n", "Nyugta 3");
        csillagKiiras();
    }

    private static void adatok() {
        tetelek();
        duplaKiiras();
        kiirasf("%10s: %5d %s\n", "Összesen", osszesen(), huf());
        szagatottVonalKiiras();
        kiirasf("%10s: %5d %s\n", "Szervízdíj", szervizDij(), huf());
        System.out.printf("(%d%%)\n", szervizDijMertek());
        duplaKiiras();
        kiirasf("%10s:  %d %s\n", "Fizetendő", fizetendo(), huf());
        final String eur = "\u20ac";
        System.out.printf("%10s%7.2f %s\n","", euro(), eur);//
    }

    private static void nyugtaVege() {
        szagatottVonalKiiras();
        sortores();
        rovidVonalKiiras();
        String rovidVonalValaszto = "      ";
        kiirast(rovidVonalValaszto);
        rovidVonalKiiras();
        sortores();
        kiirast(" Dátum");
        kiirast(rovidVonalValaszto);
        kiirasln("   Név");
        csillagKiiras();
        kiirasln("        CÉG");
        csillagKiiras();
    }
    private static void szamla() {
        nyugtaFej();
        adatok();
        nyugtaVege();
    }
    public static void main(String[] args) {
        szamla();   
    }  
}