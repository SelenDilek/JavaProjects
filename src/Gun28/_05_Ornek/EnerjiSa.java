package Gun28._05_Ornek;

public class EnerjiSa {
    public static void main(String[] args) {

        Musteri mus1 = new Musteri("Selen");

        mus1.elektrikHesabi.tuketimEkle(50);
        mus1.elektrikHesabi.tuketimEkle(60);
        mus1.elektrikHesabi.tuketimEkle(70);

        System.out.println(" = " + mus1.elektrikHesabi.toplamTuketim);

        mus1.elektrikHesabi.faturaYaz();




    }
}
