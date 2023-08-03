package Gun26._01_Ornek;

public class Kampus {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        ogr1.okulNo = 1001 ;
        ogr1.ad="Hakan";
        ogr1.soyad="Kilic";

        ogr1.okul=new Okul();
        ogr1.okul.okulAd= "Bayram okulu";
        ogr1.okul.okulmudurAd="Selim Ozel";
        ogr1.okul.Adres="Umraniye/Istanbul";

        System.out.println("ogr1.ad = " + ogr1.ad);
        System.out.println("ogr1.okul.okulAd= " + ogr1.okul.okulAd);
    }
    
}
