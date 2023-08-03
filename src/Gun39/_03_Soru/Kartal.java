package Gun39._03_Soru;

public class Kartal extends Hayvan{

    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    void yiyecegi() {
        System.out.println("Kartal kus yer..");

    }

    @Override
    void yemekMiktari() {
        System.out.println("Kartal etcil bir hayvandir");

    }

    @Override
    void gunlukUykuSuresi() {

        System.out.println("Kartal 6 saat uyur");

    }

    @Override
    void sesi() {

        System.out.println("Kartal kus sesi cikarir");

    }
}
