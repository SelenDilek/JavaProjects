package Gun39._03_Soru;

public class Kedi extends Hayvan{

    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    void yiyecegi() {

        System.out.println("Kedi fare yer sut icer..");

    }

    @Override
    void yemekMiktari() {
        System.out.println("Kedi gunde 2 defa yer ");

    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("Kedi gunde 12 saat uyur");

    }

    @Override
    void sesi() {

        System.out.println("Kedi miyav sesi cikarir");
    }
}
