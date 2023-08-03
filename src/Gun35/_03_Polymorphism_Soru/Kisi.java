package Gun35._03_Polymorphism_Soru;

public class Kisi {
   private String ad;
   private String soyAd;
   private String gorevi;

    public Kisi(String ad, String soyAd, String gorevi) {
        setAd(ad);
        setSoyAd(soyAd);
        setGorevi(gorevi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }


    public static void kimlikBelgesiYazdir(Kisi gelenKisi){

        System.out.println("\n******** Kimlik Belgesi ************");
        System.out.println("Ad=" + gelenKisi.getAd());
        System.out.println("Soyad=" + gelenKisi.getSoyAd());
        System.out.println("Gorevi=" + gelenKisi.getGorevi());

        if( gelenKisi instanceof Calisan)
            System.out.println("Gorevi=" +
                    ((Calisan)gelenKisi).getDepertman());
        else
            System.out.println("Subesi="+
                    ((Ogrenci)gelenKisi).getSube());






    }







    @Override
    public String toString() {
        return "--Kimlik Belgesi Formu--" +
                "\nAdiniz='" + ad +
                ",\nSoyadiniz='" + soyAd +
                ",\nGoreviniz='" + gorevi ;
    }
}
