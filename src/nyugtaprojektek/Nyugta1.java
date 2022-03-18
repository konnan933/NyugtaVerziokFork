package nyugtaprojektek;

public class Nyugta1 {

    public static void main(String[] args) {
        kiiras("******************");
        kiiras("     Nyugta 1");
        kiiras("******************");
        kiiras("Tétel 1:    350 Ft");
        kiiras("Tétel 2:     90 Ft");
        kiiras("Tétel 3:    650 Ft");
        kiiras("==================");
        kiiras("Összesen:  1090 Ft");
        kiiras("------------------");
        kiiras("Kedvezmény: 109 Ft");
        kiiras("(10%)");
        kiiras("==================");
        kiiras("Fizetendő:  981 Ft");
        kiiras("------------------");
        kiiras("");
        kiirassortoresnelkul("_______");
        kiirassortoresnelkul("   ");
        kiiras("_______");
        kiirassortoresnelkul(" Dátum");
        kiirassortoresnelkul("   ");
        kiiras("   Név");
        kiiras("******************");
        kiiras("        CÉG");
        kiiras("******************");
    }

    private static void kiiras(String szoveg) {
        System.out.println(szoveg);
    }
    private static void kiirassortoresnelkul(String szoveg) {
        System.out.print(szoveg);
    }
    
}
