package Gun29.Soru;

public class Banka {
    public static void main(String[] args) {
        Musteri mus1 = new Musteri();
        mus1.musteriNo=1 ;
        mus1.ad="Zeynep";
        mus1.soyad="Baglars";
        mus1.musteriHesap.paraYatir(100);
        mus1.musteriHesap.paraYatir(200);
        mus1.musteriHesap.paraCek(50);

        System.out.println("mus1 = " + mus1.musteriHesap);

       // mus1.musteriHesap.bakiye=1000000000000;

    }
}
