package Gun36._06_Interface;

public class GeoMain {
    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen();
        int Dikdortgenalani = dikdortgen.alani(3, 4);
        int Dikdortgencevresi = dikdortgen.cevresi(3, 4);

        System.out.println("Dikdortgencevresi = " + Dikdortgencevresi);
        System.out.println("Dikdortgenalani = " + Dikdortgenalani);

        Kare kare = new Kare();
        int kareAlan = kare.alani(3, 3);
        int kareCevre = kare.cevresi(3, 3);

        System.out.println("kareCevre = " + kareCevre);
        System.out.println("kareAlan = " + kareAlan);


    }
}
