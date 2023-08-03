package Gun29.SoruBenimCozumum;

public class Musteri {
    int musteriNo=1001 ;
    String ad;
    String soyad ;


    Hesap MusteriHesap = new Hesap();

    public Musteri(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return
                "Musteri Numaraniz=" + musteriNo +
                ", Adiniz='" + ad + '\'' +
                ", Soyadiniz='" + soyad + '\'' +
                ", Hesap Bilgileriniz =" + MusteriHesap
                ;
    }
}
