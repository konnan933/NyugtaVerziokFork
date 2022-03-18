package nyugtaprojektek;
/* Probléma:
tüntessük el a kézzel beírt szóközöket,
a huf ne tartalmazzon eurót
a kedvezmény helyett legyen szervízdíj, amit hozzá kell adni a végössdzeghez
*/
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
    private static void fej() {
        csillagKiiras();
        System.out.printf("%14s\n", "Nyugta 3");
        csillagKiiras();
    }

    private static void kozep() {
        final String HUF = "Ft";
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
        kiirasf("%10s: %5d %s\n", "Tétel 1", tetel1, HUF);
        kiirasf("%10s: %5d %s\n", "Tétel 2", tetel2, HUF);
        kiirasf("%10s: %5d %s\n", "Tétel 3", tetel3, HUF);

        duplaKiiras();
        
        int osszesen = osszeadas(tetel1, tetel2);
        int osszesen2 = osszeadas(osszesen,tetel3);
        kiirasf("%10s: %5d %s\n", "Összesen", osszesen2, HUF);
        szagatottVonalKiiras();
        
        int szervizDijMertek = 10;
        int szervizDij = osztas(osszesen2, szervizDijMertek);
      
        kiirasf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        
        duplaKiiras();
        int fizetendo = osszeadas(osszesen2, szervizDij);
        kiirasf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
        double euro = fizetendo / 373.0;
        final String eur = "\u20ac";
        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
    }

    private static void vege() {
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
        fej();
        kozep();
        vege();
    }
    public static void main(String[] args) {
        szamla();  
        
    }

    

    
}
